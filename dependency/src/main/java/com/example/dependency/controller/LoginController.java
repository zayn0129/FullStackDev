package com.example.dependency.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dependency.service.LoginService;

@CrossOrigin("*")
@RestController

public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@GetMapping("/validate")
	public boolean validate(@RequestParam("userName") String userName,
			@RequestParam("password") String password) {
		return loginService.getCredentials(userName, password);
	}
	
}


