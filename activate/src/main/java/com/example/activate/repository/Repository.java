package com.example.activate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.activate.model.User;

@org.springframework.stereotype.Repository

public interface Repository extends JpaRepository<User, Long>{
 
	

}
