package com.example.activate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.activate.model.User;

import com.example.activate.service.Srv;

@RestController

public class Controller {
	@Autowired
	Srv service;
	@PostMapping("/postUser")
	
	public ResponseEntity<?> postUser (){
		List<User> model = service.postUser();
		 return ResponseEntity.ok().body(model);
	}
}
