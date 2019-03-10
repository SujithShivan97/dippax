package com.ss.dippax.daoimpl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.ss.dippax.dao.Categorydao;
import com.ss.dippax.dto.Category;


@Repository("categorydao")
public class Categorydaoimpl implements Categorydao {

	private static List<Category> categories= new ArrayList<Category>();
	static
	{
		Category category=new Category();
		category.setId(1);
		category.setName("BOYS WEARS");
		category.setDescription("HERE BOYS WEARS");
		category.setImageUrl("CAT_1.PNG");
		categories.add(category);
		
		
		
		category=new Category();
		category.setId(2);
		category.setName("GIRLS WEARS");
		category.setDescription("HERE GIRLS WEARS");
		category.setImageUrl("CAT_2.PNG");
		categories.add(category);
		
		category=new Category();
		category.setId(3);
		category.setName("SHOES");
		category.setDescription("HERE SHOES");
		category.setImageUrl("CAT_3.PNG");
		categories.add(category);
		
		
		category=new Category();
		category.setId(4);
		category.setName("ACCESSORIES");
		category.setDescription("HERE ACCESSORIE ");
		category.setImageUrl("CAT_4.PNG");
		categories.add(category);
	}
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	public Category get(int id)
	{
		for(Category category:categories) {
			if(category.getId()==id)
				return category;
		
	}
		return null;
	}
	}

	
	
   /*  public List<Category> list() {
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
	      
	}*/


	

	

	/*public boolean update(Category category) {
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
	}*/


