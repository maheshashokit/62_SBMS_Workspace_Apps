package com.ashokit.spring.beans;

public class Student {
	
	//simple properties
	private String studentId;
	private String name;
	
	//object properties
	private Address address;
	private Course course;

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", address=" + address + ", course=" + course
				+ "]";
	}	
}