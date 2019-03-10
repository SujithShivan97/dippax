package com.ss.dippax.dao;

import java.util.List;

import com.ss.dippax.dto.Category;

public interface Categorydao {
	
	
	
    List <Category> list();
	Category get(int id);
    
}
