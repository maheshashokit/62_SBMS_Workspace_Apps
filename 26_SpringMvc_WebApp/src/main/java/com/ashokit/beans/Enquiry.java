package com.ashokit.beans;

public class Enquiry {
	
	private String firstName;

	private String emailId;

	private String contactNo;

	private String courses;

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return firstName;
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

	public void setCourses(String courses) {
		this.courses = courses;
	}
	
	public String getCourses() {
		return courses;
	}

	@Override
	public String toString() {
		return "Enquiry [name=" + firstName + ", emailId=" + emailId + ", contactNo=" + contactNo + ", courseName="
				+ courses + "]";
	}

}
