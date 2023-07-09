package com.first.assignment.first.assignment.model;

public class LoginModel {
	
	private String userName;
	private String password;
	
	public LoginModel() {
		super();
	}
	public LoginModel(String username, String password) {
		super();
		this.userName = username;
		this.password = password;
	}
	public String getUsername() {
		return userName;
	}
	public void setUsername(String username) {
		this.userName = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}