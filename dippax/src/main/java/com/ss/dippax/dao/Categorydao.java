package com.ss.dippax.dao;

import java.util.List;

import com.ss.dippax.dto.Category;



public interface Categorydao {
	
	
	Category get(int id);
    List <Category> list();
	
	boolean add(Category category);
	boolean update(Category category);
	boolean delete(Category category);
    
}
