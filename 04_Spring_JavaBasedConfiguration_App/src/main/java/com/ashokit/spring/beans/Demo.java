package com.ashokit.spring.beans;

public class Demo {

	private String username;

	private String password;
	

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Demo [username=" + username + ", password=" + password + "]";
	}
}