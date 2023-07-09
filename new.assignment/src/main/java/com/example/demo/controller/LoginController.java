package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.LoginService;

@CrossOrigin("*")
@RestController
public class LoginController {
	
	@Autowired
	LoginService loginService;
	

	
	@GetMapping("validate-user")
	@ResponseBody
	public ResponseEntity<?> getCredentials(@RequestParam("userName")String userName, 
			@RequestParam("password")String password)
	{
		return ResponseEntity.ok().body(loginService.getCredentials(userName, password));
		
		
	}

}
