package com.example.dependency.service;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.dependency.model.LoggedinUser;
import com.example.dependency.repository.UserLogin;

@Service
public class LoginService {
	@Autowired
	UserLogin userLogin;
	
	public boolean getCredentials(String userName, String password) {
		LoggedinUser loggedinUser =userLogin.findByUserName(userName);
		if(null !=loggedinUser && null !=loggedinUser.getUserName()&& 
				loggedinUser.getUserName().equals(userName)&&
				loggedinUser.getUserPassword().equals(password)) 
	
			{return true;
		
	} else {
		return false;

	}
		}
}
