package com.ashokit.spring.beans;

public class Employee {
	
	//simple properties
	private String empId;
	private String empName;
	
	//object property
	private Address address;
	
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	
	//Business method
	public void displayEmployeeDetails() {
		System.out.println("EmployeeId       ::::: " + empId);
		System.out.println("EmployeeName     ::::: " + empName);
		//Calling the Address service method
		System.out.println("Employee Address ::::: " + address.displayAddressDetails());
	}
}