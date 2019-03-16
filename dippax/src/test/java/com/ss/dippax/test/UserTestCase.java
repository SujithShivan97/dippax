package com.ss.dippax.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ss.dippax.dao.Userdao;
import com.ss.dippax.dto.Address;
import com.ss.dippax.dto.Cart;
import com.ss.dippax.dto.User;



public class UserTestCase {
	
	private static AnnotationConfigApplicationContext context;
	private static Userdao userdao;
	private User user = null;
	private Cart cart = null;
	private Address address = null;
	
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.ss.dippax");
		context.refresh();
		
		userdao= (Userdao)context.getBean("userdao");
	}
	
    /*@Test 
	public void testAdd()
	{
    	user = new User() ;
		user.setFirstName("Rohan");
		user.setLastName("Ajay");
		user.setEmail("ra@gmail.com");
		user.setContactNumber("1234512345");
		user.setRole("USER");
		user.setEnabled(true);
		user.setPassword("12345");
		assertEquals("Failed to add the user!", true, userdao.add(user));	
		
		
		address = new Address();
		address.setAddressLineOne("101/B Jadoo Society, Krissh Nagar");
		address.setAddressLineTwo("Near Kaabil Store");
		address.setCity("Mumbai");
		address.setState("Maharashtra");
		address.setCountry("India");
		address.setPostalCode("400001");
		address.setBilling(true);
		
		// linked the address with the user
		address.setUserId(user.getId());	
				
		assertEquals("Failed to add the address!", true, userdao.addAddress(address));

		
		if(user.getRole().equals("USER"))
		{
			//Create a cart
		 cart=new Cart();
		 cart.setUser(user);
		 
		 assertEquals("Failed to add the cart!", true, userdao.addCart(cart));
		 
             
		 //Shipping Address
		    address = new Address();
			address.setAddressLineOne("201/B Jadoo Society, Kishan Kanhaiya Nagar");
			address.setAddressLineTwo("Near Kudrat Store");
			address.setCity("Mumbai");
			address.setState("Maharashtra");
			address.setCountry("India");
			address.setPostalCode("400001");
			address.setShipping(true);
			
			//link it with user
             address.setUserId(user.getId());
			assertEquals("Failed to add the shipping address!", true, userdao.addAddress(address));
			
	
		}
		
	}*/


	/*@Test 
	public void testAdd()
	{
    	user = new User() ;
		user.setFirstName("Rohan");
		user.setLastName("Ajay");
		user.setEmail("ra@gmail.com");
		user.setContactNumber("1234512345");
		user.setRole("USER");
		user.setEnabled(true);
		user.setPassword("12345");
		
		if(user.getRole().equals("USER"))
		{
			//Create a cart for the user
		 cart=new Cart();
		 cart.setUser(user);
		 
		 //attach the cart with the user
		 user.setCart(cart);
		 
		}
	
		assertEquals("Failed to add the user!", true, userdao.add(user));
		
	}*/
	
	/*@Test
	public void updateCart()
	{
		//fetch the user by email
		user=userdao.getByEmail("ra@gmail.com");
		//get the cart
		cart=user.getCart();
		cart.setGrandTotal(4545);
		cart.setCartLines(3);
		
		assertEquals("Failed to update the cart!", true, userdao.update(cart));
		
	}*/
	
	/*@Test
	public void AddAddress()
	{
		user = new User() ;
		user.setFirstName("Rohan");
		user.setLastName("Ajay");
		user.setEmail("ra@gmail.com");
		user.setContactNumber("1234512345");
		user.setRole("USER");
		user.setEnabled(true);
		user.setPassword("12345");
		assertEquals("Failed to add the user!", true, userdao.add(user));	
		
		address = new Address();
		address.setAddressLineOne("101/B Jadoo Society, Krissh Nagar");
		address.setAddressLineTwo("Near Kaabil Store");
		address.setCity("Mumbai");
		address.setState("Maharashtra");
		address.setCountry("India");
		address.setPostalCode("400001");
		address.setBilling(true);
		//set the address to user
		address.setUser(user);
	    assertEquals("Failed to add the address!", true, userdao.addAddress(address));

	    address = new Address();
		address.setAddressLineOne("201/B Jadoo Society, Kishan Kanhaiya Nagar");
		address.setAddressLineTwo("Near Kudrat Store");
		address.setCity("Mumbai");
		address.setState("Maharashtra");
		address.setCountry("India");
		address.setPostalCode("400001");
		address.setDelivery(true);
		
		//link it with user
		address.setUser(user);
		assertEquals("Failed to add the delivery address!", true, userdao.addAddress(address));
		
	}*/
	
	/*@Test
	public  void testAddAddress()
	{
		
		user= userdao.getByEmail("ra@gmail.com");
		address = new Address();
		address.setAddressLineOne("101/B Jadoo Society, Krissh Nagar");
		address.setAddressLineTwo("Near Kaabil Store");
		address.setCity("Chennai");
		address.setState("Tamilnadu");
		address.setCountry("India");
		address.setPostalCode("400001");
		address.setBilling(true);
		//set the address to user
		address.setUser(user);
	    assertEquals("Failed to add the address!", true, userdao.addAddress(address));

	}*/
	
	
}
		
		