package com.example.dependency.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dependency.model.LoggedinUser;

@Repository
public interface UserLogin extends JpaRepository<LoggedinUser,Long> {
	public LoggedinUser findByUserEmail(String email);
	public LoggedinUser findByUserName(String Username);
	
	

}
