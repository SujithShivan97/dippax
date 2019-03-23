package com.ss.dippaxfc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ss.dippax.dao.Productdao;
import com.ss.dippax.dto.Product;

@Controller
@RequestMapping("/json/data")
public class JsonDataController {
	
	@Autowired
	private Productdao productdao;
	
	
	@RequestMapping("/all/products")
	@ResponseBody
	public List<Product> getAllProducts()
	{
		return productdao.listActiveProducts();
	}
	
	@RequestMapping("/category/{id}/products")
	@ResponseBody
	public List<Product> getProductsByCategory(@PathVariable int id)
	{
		return productdao.listActiveProductsByCategory(id);
	}

}
