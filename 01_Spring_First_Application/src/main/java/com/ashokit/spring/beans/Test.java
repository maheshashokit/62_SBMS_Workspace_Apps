package com.ashokit.spring.beans;

public class Test {
	
	private String message;
	private String title;
	
	//Defining the constructor
	public Test(String message) {
		System.out.println("Inside the Test Class Parameterized Constructor.....");
		this.message = message;
	}
	
	//Defining the two parameterized constructor
	public Test(String message,String title) {
		System.out.println("Inside the Test Class Two-Parameterized constructor.....");
		this.message = message;
		this.title = title;
	}
	
	//Defining the business method
	public void displayData() {
		System.out.println("Test Class Message:::" + message);
		System.out.println("Test Class Title  :::" + title);
	}

}
