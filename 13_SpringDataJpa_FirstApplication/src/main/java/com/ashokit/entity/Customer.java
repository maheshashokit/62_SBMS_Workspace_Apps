package com.ashokit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Representing Java class as Entity Class in ORM 
@Entity

//Establishing relationship between Java class to DB table
@Table(name = "shopping_customers")
public class Customer {
	
	@Id
	@Column(name = "customer_id")
	private Integer customerId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="location")
	private String location;
	
	@Column(name="email")
	private String emailId;
	
	@Column(name="contact_no")
	private String contactNo;

	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(Integer customerId, String name, String location, String emailId, String contactNo) {
		this.customerId = customerId;
		this.name = name;
		this.location = location;
		this.emailId = emailId;
		this.contactNo = contactNo;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", location=" + location + ", emailId="
				+ emailId + ", contactNo=" + contactNo + "]";
	}
}