package com.ss.dippax.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ss.dippax.dao.CartLinedao;
import com.ss.dippax.dao.Productdao;
import com.ss.dippax.dao.Userdao;
import com.ss.dippax.dto.Cart;
import com.ss.dippax.dto.CartLine;
import com.ss.dippax.dto.Product;
import com.ss.dippax.dto.User;

public class CartLineTestCase {

private static AnnotationConfigApplicationContext context;
	
	
	private static CartLinedao cartLinedao;
	private static Productdao productdao;
	private static Userdao userdao;
	
	
	private CartLine cartLine = null;
	private User user=null;
	private Cart cart=null;
	private Product product=null;
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.ss.dippax");
		context.refresh();
		cartLinedao = (CartLinedao)context.getBean("cartLinedao");
		productdao = (Productdao)context.getBean("productdao");
		userdao = (Userdao)context.getBean("userdao");
	}
	
	@Test
	public void testAddCartLine() {
		
		// fetch the user and then cart of that user
		User user = userdao.getByEmail("ra@gmail.com");		
		Cart cart = user.getCart();
		
		// fetch the item
		Product product = productdao.get(1);
		
		// Create a new CartLine
		cartLine = new CartLine();
		cartLine.setBuyingPrice(product.getUnitPrice());
		cartLine.setProductCount(cartLine.getProductCount()+1);
		cartLine.setTotal(product.getUnitPrice()*cartLine.getProductCount());
		cartLine.setAvailable(true);
		cartLine.setCartId(cart.getId());
		cartLine.setProduct(product);
		
		assertEquals("Failed to add the CartLine!",true, cartLinedao.add(cartLine));
		
		//update the cart
		cart.setGrandTotal(cart.getGrandTotal() + cartLine.getTotal());
		cart.setCartLines(cart.getCartLines()+1);
		
		assertEquals("Failed to update the cart!",true, cartLinedao.updateCart(cart));
		
	}
	
}
