
package com.ss.dippax.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ss.dippax.dao.Categorydao;
import com.ss.dippax.dto.Category;

public class CategoryTestCase {
	
	
	
	private static AnnotationConfigApplicationContext context;
	private static Categorydao categorydao;
	private Category category;
	
	@BeforeClass
	public static void init()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com.ss.dippax");
		context.refresh();
		 categorydao=(Categorydao)context.getBean("categorydao");
		
	}
	
	/*@Test
	public void testAddCategory()
	{
		category=new Category();
		category.setName("Girls wears");
		category.setDescription("Check out the latest fashion here girls");
		category.setImageUrl("CAT_2.png");
		assertEquals("Successfully added",true,categorydao.add(category));
		
		
	}*/
	
	/*@Test
	public void testGetCategory()
	{
		category=categorydao.get(2);
		assertEquals("Successfully fetched!","Boy wears",category.getName());
	}*/
	
	
	/*@Test
	public void testupdateCategory()
	{
		category=categorydao.get(2);
		category.setName("Girls wears");
		
		assertEquals("Successfully updated",true,categorydao.update(category));
	}*/
	
	/*@Test
	public void testdeleteCategory()
	{
		category=categorydao.get(2);
		
		
		assertEquals("Successfully deleted",true,categorydao.delete(category));	
	}*/
		
	/*@Test
	public void testListCategory()
	{
		assertEquals("Successfully fetched",2,categorydao.list().size());	
	}*/
	
	
	/*@Test
	public void testCRUDCategory()
	{
	category=new Category();
	category.setName("BOYS WEARS");
	category.setDescription("Check out the latest fashion here Boyies");
	category.setImageUrl("CAT_1.png");
	category.setActive(true);
	assertEquals("Something went wrong!",true,categorydao.add(category));
	
	category=new Category();
	category.setName("GIRLS WEARS");
	category.setDescription("Check out the latest fashion here Girlies");
	category.setImageUrl("CAT_2.png");
	category.setActive(true);
	assertEquals("Something went wrong!",true,categorydao.add(category));
	
	category=new Category();
	category.setName("SHOES");
	category.setDescription("Check out the latest fashion here");
	category.setImageUrl("CAT_3.png");
	category.setActive(true);
	assertEquals("Something went wrong!",true,categorydao.add(category));
	
	
	}*/
	
	
	
	
}
