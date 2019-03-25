package com.ss.dippax.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ss.dippax.dao.Productdao;
import com.ss.dippax.dto.Product;



public class ProductTestCase {
	
    private static AnnotationConfigApplicationContext context;
	private static Productdao productdao;
	private Product product;
	
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.ss.dippax");
		context.refresh();
		productdao = (Productdao)context.getBean("productdao");
	}
	
	@Test
	public void testCRUDProduct() {
		
		// create operation
		product = new Product();
				
		product.setName("Jeans");
		product.setBrand("Denim");
		product.setDescription("Fashionable!");
		product.setUnitPrice(2000);
		product.setQuantity(21);
		product.setActive(true);
		product.setCategoryId(1);
		product.setSupplierId(3);
		assertEquals("Something went wrong while inserting a new product!",
				true,productdao.add(product));		
		product = new Product();
		product.setName("Hoodies");
		product.setBrand("Rowdy Club");
		product.setDescription("Fashionable!");
		product.setUnitPrice(1000);
		product.setQuantity(20);
		product.setActive(true);
		product.setCategoryId(1);
		product.setSupplierId(3);
		assertEquals("Something went wrong while inserting a new product!",
				true,productdao.add(product));		
		product = new Product();
		product.setName("Casuals");
		product.setBrand("Roadster");
		product.setDescription("Fashionable!");
		product.setUnitPrice(1000);
		product.setQuantity(15);
		product.setActive(true);
		product.setCategoryId(1);
		product.setSupplierId(3);
		assertEquals("Something went wrong while inserting a new product!",
				true,productdao.add(product));		
		
		
		product = new Product();
		product.setName("Jeans");
		product.setBrand("Lady Sid");
		product.setDescription("Fashionable!");
		product.setUnitPrice(1000);
		product.setQuantity(32);
		product.setActive(true);
		product.setCategoryId(2);
		product.setSupplierId(3);
		
		
		assertEquals("Something went wrong while inserting a new product!",
				true,productdao.add(product));		
		
		
		product = new Product();
		product.setName("Kurtas");
		product.setBrand("Myntra");
		product.setDescription("Fashionable!");
		product.setUnitPrice(1000);
		product.setQuantity(21);
		product.setActive(true);
		product.setCategoryId(2);
		product.setSupplierId(3);
		
		
		assertEquals("Something went wrong while inserting a new product!",
				true,productdao.add(product));		
		
		product = new Product();
		product.setName("Party Wears");
		product.setBrand("Vogue");
		product.setDescription("Fashionable!");
		product.setUnitPrice(1000);
		product.setQuantity(17);
		product.setActive(true);
		product.setCategoryId(2);
		product.setSupplierId(3);
		
		
		assertEquals("Something went wrong while inserting a new product!",
				true,productdao.add(product));		
		
		
		
		product = new Product();
		product.setName("Party Shoes");
		product.setBrand("Nike");
		product.setDescription("Fashionable!");
		product.setUnitPrice(1000);
		product.setQuantity(31);
		product.setActive(true);
		product.setCategoryId(3);
		product.setSupplierId(3);
		
		
		assertEquals("Something went wrong while inserting a new product!",
				true,productdao.add(product));		
		
		product = new Product();
		product.setName("Heels");
		product.setBrand("Levinge");
		product.setDescription("Fashionable!");
		product.setUnitPrice(1000);
		product.setQuantity(21);
		product.setActive(true);
		product.setCategoryId(3);
		product.setSupplierId(3);
		
		
		assertEquals("Something went wrong while inserting a new product!",
				true,productdao.add(product));		
		
			
		
		product = new Product();
		product.setName("Watches");
		product.setBrand("Sonata");
		product.setDescription("Fashionable!");
		product.setUnitPrice(1000);
		product.setQuantity(22);
		product.setActive(true);
		product.setCategoryId(4);
		product.setSupplierId(3);
		
		
		
		
		
		assertEquals("Something went wrong while inserting a new product!",
				true,productdao.add(product));		
		
		product = new Product();
		product.setName("Bands");
		product.setBrand("Damnuous");
		product.setDescription("Fashionable!");
		product.setUnitPrice(1000);
		product.setQuantity(12);
		product.setActive(true);
		product.setCategoryId(4);
		product.setSupplierId(3);
		
		
		assertEquals("Something went wrong while inserting a new product!",
				true,productdao.add(product));		
		
		
		
		
		
		
		
				
	}

}
