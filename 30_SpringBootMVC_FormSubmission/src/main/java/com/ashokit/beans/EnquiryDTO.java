package com.ashokit.beans;

public class EnquiryDTO {
	
	private Integer enquiryId;
	
	private String name;

	private String contactNo;

	private String emailId;

	private String courseName;
	
	public EnquiryDTO() {

	}
	
	public EnquiryDTO(String name, String contactNo, String emailId, String courseName) {
		super();
		this.name = name;
		this.contactNo = contactNo;
		this.emailId = emailId;
		this.courseName = courseName;
	}
	
	public void setEnquiryId(Integer enquiryId) {
		this.enquiryId = enquiryId;
	}
	
	public Integer getEnquiryId() {
		return enquiryId;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "EnquiryDTO [name=" + name + ", contactNo=" + contactNo + ", emailId=" + emailId + ", courseName="
				+ courseName + "]";
	}
}
