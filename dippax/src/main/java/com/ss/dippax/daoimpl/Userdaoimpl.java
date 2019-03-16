package com.ss.dippax.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ss.dippax.dao.Userdao;
import com.ss.dippax.dto.Address;
import com.ss.dippax.dto.Cart;
import com.ss.dippax.dto.User;


@Repository("userdao")
@Transactional
public class Userdaoimpl implements Userdao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	public User getByEmail(String email) {
		String selectQuery = "FROM User WHERE email = :email";
		try {
		return sessionFactory
				.getCurrentSession()
					.createQuery(selectQuery,User.class)
						.setParameter("email",email)
							.getSingleResult();
		}
		catch(Exception ex) 
		{
			return null;
		
	}
	}
	
	
	
	public boolean add(User user) {
		
		try {			
			sessionFactory.getCurrentSession().persist(user);			
			return true;
		}
		catch(Exception ex)
		{
			return false;
		}
	}

	
	public boolean addAddress(Address address) {
		try {			
			
			sessionFactory.getCurrentSession().persist(address);			
			return true;
		}
		catch(Exception ex) {
			
			return false;
		
	}
	}

	
	public boolean update(Cart cart) {
		
     try {			
			
			sessionFactory.getCurrentSession().update(cart);			
			return true;
		}
		catch(Exception ex) {
			
		
		return false;
	}

}

 public Address getBillingAddress(int userId) {
	 String selectQuery = "FROM Address WHERE userId = :userId AND billing = :isBilling";
		try{
		return sessionFactory
				.getCurrentSession()
					.createQuery(selectQuery,Address.class)
						.setParameter("userId", userId)
						.setParameter("isBilling", true)
						.getSingleResult();
		}
		catch(Exception ex) {
			return null;
		}
		
	}



	
	public List<Address> listDeliveryAddress(int userId) {
		String selectQuery = "FROM Address WHERE userId = :userId AND shipping = :isDelivery ORDER BY id DESC";
		return sessionFactory
				.getCurrentSession()
					.createQuery(selectQuery,Address.class)
						.setParameter("userId", userId)
						.setParameter("isDelivery", true)
							.getResultList();
		
	
	}


	
	
}
