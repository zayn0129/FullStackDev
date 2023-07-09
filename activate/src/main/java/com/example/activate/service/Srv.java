package com.example.activate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.activate.model.User;
import com.example.activate.repository.Repository;
@org.springframework.stereotype.Service

public class Srv {
	@Autowired
	Repository repository;
		
	public List<User>postUser(){
		return repository.findAll();
		}
}
