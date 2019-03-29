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
	
    @Test 
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
		
		address = new Address();
		address.setAddressLineOne("3/4,Naidu Building");
		address.setAddressLineTwo("Srinivasa Nagar");
		address.setCity("Chennai");
		address.setState("Tamilnadu");
		address.setCountry("India");
		address.setPostalCode("600050");
		address.setBilling(true);
		//set the address to user
		address.setUser(user);
	    assertEquals("Failed to add the address!", true, userdao.addAddress(address));

		
		
		
		user = new User() ;
		user.setFirstName("Sujith");
		user.setLastName("Shivan");
		user.setEmail("ss@gmail.com");
		user.setContactNumber("123451544");
		user.setRole("ADMIN");
		user.setEnabled(true);
		user.setPassword("1997");
		assertEquals("Failed to add the user!", true, userdao.add(user));	
		
		
		
		
    user = new User() ;
	user.setFirstName("Srinivasan");
	user.setLastName("Sriram");
	user.setEmail("ssi@gmail.com");
	user.setContactNumber("12345125445");
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
	
	address = new Address();
	address.setAddressLineOne("12/4,Ambattur ");
	address.setAddressLineTwo("Tiruvalur");
	address.setCity("Chennai");
	address.setState("Tamilnadu");
	address.setCountry("India");
	address.setPostalCode("600050");
	address.setBilling(true);
	//set the address to user
	address.setUser(user);
    assertEquals("Failed to add the address!", true, userdao.addAddress(address));

	
   user = new User() ;
  user.setFirstName("Anita");
user.setLastName("S");
user.setEmail("as@gmail.com");
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

}
		
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
	
	

