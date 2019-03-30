package com.ss.dippaxfc.service;


	
	import java.util.List;

	import javax.servlet.http.HttpSession;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;


import com.ss.dippax.dao.CartLinedao;
import com.ss.dippax.dao.Productdao;
import com.ss.dippax.dto.Cart;
import com.ss.dippax.dto.CartLine;
import com.ss.dippax.dto.Product;

	
	public class CartService {

		@Autowired
		private CartLinedao cartLinedao;

		@Autowired
		private Productdao productdao;

		@Autowired
		private HttpSession session;

		// returns the entire cartLine
		public List<CartLine> getCartLines() {
			return cartLinedao.list(this.getCart().getId());

		}

		// returns the user cart when logged in
		private Cart getCart() {
			return ((UserModel) session.getAttribute("userModel")).getCart();
		}

		public String manageCartLine(int cartLineId, int count) {
			// TODO Auto-generated method stud
			CartLine cartLine = cartLinedao.get(cartLineId);
			if (cartLine == null) {
				return "result=error";
			}
			else {
				Product product = cartLine.getProduct();
				double oldTotal = cartLine.getTotal();
				//if product is available
				if (product.getQuantity() <count) {
					return "result=unavailable";
				}
				// update the cart line
				cartLine.ProductCount(count);
				cartLine.setBuyingPrice(product.getUnitPrice());
				cartLine.setTotal(product.getUnitPrice() * count);
				cartLinedao.update(cartLine);

				// update the cart
				Cart cart = this.getCart();
				cart.setGrandTotal(cart.getGrandTotal() - oldTotal + cartLine.getTotal());
				cartLinedao.updateCart(cart);
				return "result=updated";
			}
		}

		public String deleteCartLine(int cartLineId) {

			// fetch cartLine
			CartLine cartLine = cartLinedao.get(cartLineId);

			if (cartLine == null) {
				return "result=error";
			} else {
				// update the cart
				Cart cart = this.getCart();
				cart.setGrandTotal(cart.getGrandTotal() - cartLine.getTotal());
				cart.setCartLines(cart.getCartLines() - 1);
				cartLinedao.updateCart(cart);

				// remove the cartLine
				cartLinedao.delete(cartLine);

				return "result=deleted";
			}
		}

		public String addCartLine(int productId) {

			String response = null;
			Cart cart = this.getCart();
			CartLine cartLine = cartLinedao.getByCartAndProduct(cart.getId(), productId);
			if(cartLine==null) {
				// add a new cartLine if a new product is getting added
				cartLine = new CartLine();
				Product product = productdao.get(productId);
				
				// transfer the product details to cartLine
							cartLine.setCartId(cart.getId());
							cartLine.setProduct(product);
							cartLine.setProductCount(1);
							cartLine.setBuyingPrice(product.getUnitPrice());
							cartLine.setTotal(product.getUnitPrice());
							cartLine.setAvailable(true);
							
							// insert a new cartLine
							cartLinedao.add(cartLine);
							
							// update the cart
							cart.setGrandTotal(cart.getGrandTotal() + cartLine.getTotal());
							cart.setCartLines(cart.getCartLines() + 1);
							cartLinedao.updateCart(cart);
							
							response = "result=added";				
			}
			else {
				// check if the cartLine has been already reached to maximum count
				if(cartLine.getProductCount() < 3) {
					// call the manageCartLine method to increase the count
					response = this.manageCartLine(cartLine.getId(), cartLine.getProductCount() + 1);				
				}			
				else {				
					response = "result=maximum";				
				}						
			}	
			return response;
		}
		
		public String validateCartLine() {
			Cart cart = this.getCart();
			List<CartLine> cartLines = cartLinedao.list(cart.getId());
			double grandTotal = 0.0;
			int lineCount = 0;
			String response = "result=success";
			boolean changed = false;
			Product product = null;
			for(CartLine cartLine : cartLines) {					
				product = cartLine.getProduct();
				changed = false;
				// check if the product is active or not
				// if it is not active make the availability of cartLine as false
				if((!product.isActive() && product.getQuantity() == 0) && cartLine.isAvailable()) {
					cartLine.setAvailable(false);
					changed = true;
				}			
				// check if the cartLine is not available
				// check whether the product is active and has at least one quantity available
				if((product.isActive() && product.getQuantity() > 0) && !(cartLine.isAvailable())) {
						cartLine.setAvailable(true);
						changed = true;
				}
				
				// check if the buying price of product has been changed
				if(cartLine.getBuyingPrice() != product.getUnitPrice()) {
					// set the buying price to the new price
					cartLine.setBuyingPrice(product.getUnitPrice());
					// calculate and set the new total
					cartLine.setTotal(cartLine.getProductCount() * product.getUnitPrice());
					changed = true;				
				}
				
				// check if that much quantity of product is available or not
				if(cartLine.getProductCount() > product.getQuantity()) {
					cartLine.setProductCount(product.getQuantity());										
					cartLine.setTotal(cartLine.getProductCount() * product.getUnitPrice());
					changed = true;
					
				}
				
				// changes has happened
				if(changed) {				
					//update the cartLine
					cartLinedao.update(cartLine);
					// set the result as modified
					response = "result=modified";
				}
				
				grandTotal += cartLine.getTotal();
				lineCount++;
			}
			
			cart.setCartLines(lineCount++);
			cart.setGrandTotal(grandTotal);
			cartLinedao.updateCart(cart);

			return response;
		}

	}

