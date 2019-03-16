package com.ss.dippax.daoimpl;


import java.util.List;

import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ss.dippax.dao.Categorydao;
import com.ss.dippax.dto.Category;




@Repository("categorydao")
@Transactional
public class Categorydaoimpl implements Categorydao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public Category get(int id)
	{
	return sessionFactory.getCurrentSession().get(Category.class , Integer.valueOf(id));
	}
	
   public List<Category> list() {
		 String selectActiveCategory ="FROM Category WHERE active=:active";
		Query query=sessionFactory.getCurrentSession().createQuery(selectActiveCategory);
		 query.setParameter("active",true);
		return query.getResultList();
	}

   
	public boolean add(Category category) {
		
		try
		{
			sessionFactory.getCurrentSession().persist(category);
			return true;
		}
	 
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
	      
	}


	public boolean update(Category category) {
		try
		{
			sessionFactory.getCurrentSession().update(category);
			return true;
		}
	 
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
	      
		
	}

	public boolean delete(Category category) {
		
		category.setActive(false);
		try
		{
			sessionFactory.getCurrentSession().delete(category);
			return true;
		}
	 
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
	}

}

