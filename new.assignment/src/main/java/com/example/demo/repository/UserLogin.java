package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.model.LoggedinUser;

@Repository
public interface UserLogin extends JpaRepository<LoggedinUser,Long> {
	
	public LoggedinUser findByUserEmail(String userEmail);
	public LoggedinUser findByUserName(String userName);
	
	
	
	
	
	

}
