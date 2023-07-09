package com.facebook.meta.loginservice;

import org.springframework.stereotype.Service;

@Service

public class LoginService {
	
	public String getLogin(String UserName,String password) {
		if (UserName.equals("Zayn")&& password.equals("1234567a")) {
			return "success";}
		
		else {
			return "failed";
			
			
			
				
			}
			
		}
	}
	
	


