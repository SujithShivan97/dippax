package com.ss.dippaxfc.handler;


import org.springframework.stereotype.Component;


import com.ss.dippax.dto.Address;
import com.ss.dippax.dto.User;
import com.ss.dippaxfc.model.RegisterModel;

@Component
public class RegisterHandler {
	
	
	public RegisterModel init()
	{
		return new RegisterModel();
	}

	public void addUser(RegisterModel registerModel,User user)
	{
		registerModel.setUser(user);
	}
	
	public void addBilling(RegisterModel registerModel,Address billing)
	{
		registerModel.setBilling(billing);
		
	}
	
}
