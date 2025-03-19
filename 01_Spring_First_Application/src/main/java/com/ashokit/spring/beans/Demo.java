package com.ashokit.spring.beans;

public class Demo {
	
	//Defining the simple property
	private String message;
	private String title;
	
	//setter Injection 
	public void setMessage(String message) {
		System.out.println("Inside the setter method");
		this.message = message;
	}
	
	public void setTitle(String title) {
		System.out.println("Inside the setter method-Title");
		this.title = title;
	}
	
	//business method to display message value
	public void displayMessage() {
		System.out.println("Message:::::" + message);
		System.out.println("Title  :::::" + title);
	}
}