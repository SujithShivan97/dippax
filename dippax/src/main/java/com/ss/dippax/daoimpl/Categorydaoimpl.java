package com.ss.dippax.daoimpl;

import java.util.ArrayList;
import java.util.List;

import com.ss.dippax.dao.Categorydao;
import com.ss.dippax.dto.Category;

public class Categorydaoimpl implements Categorydao {

	public static List<Category> categories=new ArrayList<Category>();
	static
	{
		Category category=new Category();
		category.setId(1);
		category.setName("Tv");
		category.setDescription("hello");
		category.setImageUrl("CAT_1.png");
		categories.add(category);
		
	}
	
	
	
	
	
	
	
	
	
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

}
