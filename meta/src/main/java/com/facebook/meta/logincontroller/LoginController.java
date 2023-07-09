package com.facebook.meta.logincontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.facebook.meta.loginservice.LoginService;

@RestController


public class LoginController {
	
	@Autowired 
	LoginService loginService;
	
	@GetMapping("/validate-user")
	
	public String getLogin(@RequestParam ("UserName")String UserName,
			@RequestParam("password")String password) {
		
		return loginService.getLogin(UserName,password);
		
		
	}}
	
	
	
	
	


