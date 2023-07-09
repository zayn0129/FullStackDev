package com.example.second.assignmentservice;

import com.example.second.assignmentmodel.ResponceDTO;

public class LoginService {
	
	public ResponceDTO getCredentials(String username, String password) {
	ResponceDTO responseDTO = new ResponceDTO();
	
	if (username.equals("Zayn")&& password.equals("1234567a")) {
		responseDTO.setMessage("Success");
	
	}

	else {
		responseDTO.setMessage("Failed");
	
	}
	return responseDTO;	
}
}