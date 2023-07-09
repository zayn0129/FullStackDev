package com.first.assignment.first.assignment.service;

import org.springframework.stereotype.Service;

import com.first.assignment.first.assignment.model.ResponseDTO;

@Service

public class LoginService {
	
	public ResponseDTO getCredentials(String username, String password) {
		ResponseDTO responseDTO = new ResponseDTO();
		
if (username.equals("Zayn")&& password.equals("1234567a")) {
	responseDTO.setMessage("Success");
	
return responseDTO;
}

else {
	responseDTO.setMessage("Failed");
	return responseDTO;

}

}
}
