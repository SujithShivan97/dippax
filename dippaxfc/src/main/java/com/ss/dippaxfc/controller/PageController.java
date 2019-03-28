package com.ss.dippaxfc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

import com.ss.dippax.dao.Categorydao;
import com.ss.dippax.dao.Productdao;
import com.ss.dippax.dto.Category;
import com.ss.dippax.dto.Product;


@Controller
public class PageController {

	@Autowired
	private Categorydao categorydao;
	
	@Autowired
	private Productdao productdao;
	
	
	@RequestMapping(value={"/","/home","/index"})
	public ModelAndView index()
	{
		ModelAndView mv=new ModelAndView("page");
	    mv.addObject("title","Home");
	    mv.addObject("categories",categorydao.list());
	    mv.addObject("userClickHome",true);
	    
	    
	    return mv;
	}

	@RequestMapping(value ="/about")
	public ModelAndView about()
	{
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("title","About us");
		mv.addObject("userClickAbout",true);
		
		return mv;
	}
	
	
	@RequestMapping(value ="/contact")
	public ModelAndView contact()
	{
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("title","Contact us");
		mv.addObject("userClickContact",true);
		
		return mv;
	}
	  
	@RequestMapping(value={"/show/all/listProducts"})
	public ModelAndView showAllProducts()
	{
		ModelAndView mv=new ModelAndView("page");
	    mv.addObject("title","All Products");
	    mv.addObject("categories",categorydao.list());
	    mv.addObject("userClickViewProducts",true);
	    
	    
	    return mv;
	}
	
	@RequestMapping(value={"/show/category/{id}/listProducts"})
	public ModelAndView showCategoryProducts(@PathVariable("id") int id)
	{
		ModelAndView mv=new ModelAndView("page");
		Category category=null;
		category=categorydao.get(id);
	   mv.addObject("title",category.getName());
	    mv.addObject("categories",categorydao.list());
	    mv.addObject("category",category);
	    mv.addObject("userClickCategoryProducts",true);
	    
	    
	    return mv;
	}
	
	@RequestMapping(value="/show/{id}/product")
	public ModelAndView showSingleProduct(@PathVariable int id)
	{
		ModelAndView mv=new ModelAndView("page");
		Product product = productdao.get(id);
		
		//update views count
		product.setViews(product.getViews() + 1);
		productdao.update(product);
		
		mv.addObject("title",product.getName());
		mv.addObject("product",product);
		 mv.addObject("userClickShowProduct",true);
	    
	    
	    return mv;
	
	   
}
}
