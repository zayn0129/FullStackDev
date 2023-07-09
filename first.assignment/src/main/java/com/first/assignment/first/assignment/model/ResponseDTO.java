package com.first.assignment.first.assignment.model;

public class ResponseDTO {
	
private String message;

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public ResponseDTO (String message) {
	super();
	this.message = message;
}
	public ResponseDTO() {
}
}
