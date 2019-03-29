package com.ss.dippax.dao;

import java.util.List;

import com.ss.dippax.dto.Cart;
import com.ss.dippax.dto.CartLine;
import com.ss.dippax.dto.OrderDetail;

public interface CartLinedao {
	
	// Basic CRUD operations
		public List<CartLine> list(int cartId);

		public CartLine get(int id);

		public boolean add(CartLine cartLine);

		public boolean update(CartLine cartLine);

		public boolean delete(CartLine cartLine);

		// fetch the CartLine based on cartId and productId
		public CartLine getByCartAndItem(int cartId, int productId);

		// update an cart
		boolean updateCart(Cart cart);

		// list of available cartLine
		public List<CartLine> listAvailable(int cartId);

		// adding order details
		boolean addOrderDetail(OrderDetail orderDetail);

}
