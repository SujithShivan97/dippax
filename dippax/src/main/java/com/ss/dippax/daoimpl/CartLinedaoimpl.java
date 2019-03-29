package com.ss.dippax.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ss.dippax.dao.CartLinedao;
import com.ss.dippax.dto.Cart;
import com.ss.dippax.dto.CartLine;
import com.ss.dippax.dto.OrderDetail;

@Repository("cartLinedao")
@Transactional
public class CartLinedaoimpl implements CartLinedao {
  
	
	@Autowired
	private SessionFactory sessionFactory;
	

	
	public List<CartLine> list(int cartId) {
		
		String query = "FROM CartLine WHERE cartId = :cartId";
		return sessionFactory.getCurrentSession().createQuery(query, CartLine.class).
				setParameter("cartId", cartId)
				.getResultList();
	}

	
	public CartLine get(int id) {
		return sessionFactory.getCurrentSession().get(CartLine.class, Integer.valueOf(id));
	}

	
	public boolean add(CartLine cartLine) {
		
		try {
			sessionFactory.getCurrentSession().persist(cartLine);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	
	public boolean update(CartLine cartLine) {
		
		try {
			sessionFactory.getCurrentSession().update(cartLine);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	
	public boolean delete(CartLine cartLine) {
		
		try {
			sessionFactory.getCurrentSession().delete(cartLine);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	
	public CartLine getByCartAndItem(int cartId, int productId) {
		
		String query = "FROM CartLine WHERE cartId = :cartId AND product.id = :productId";
		try {

			return sessionFactory.getCurrentSession().createQuery(query, CartLine.class).
					setParameter("cartId", cartId)
					.setParameter("productId", productId).getSingleResult();

		} catch (Exception ex) {
			return null;
		}
	}

	
	public boolean updateCart(Cart cart) {
		try {
			sessionFactory.getCurrentSession().update(cart);
			return true;
		} catch (Exception ex) {
			return false;
		}
		
	}

	
	public List<CartLine> listAvailable(int cartId) {
		String query = "FROM CartLine WHERE cartId = :cartId AND available = :available";
		return sessionFactory.getCurrentSession().createQuery(query, CartLine.class).
				setParameter("cartId", cartId)
				.setParameter("available", true).getResultList();
		
	}

	
	public boolean addOrderDetail(OrderDetail orderDetail) {
		try {
			sessionFactory.getCurrentSession().persist(orderDetail);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

}
