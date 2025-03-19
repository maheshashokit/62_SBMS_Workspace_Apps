package com.ashokit.spring.beans;

public class Address {

	 private String doorNo;
	 private String streetName;
	 private String pincode;
	 
	 public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	 }
	 
	 public void setPincode(String pincode) {
		this.pincode = pincode;
	 }
	 
	 public void setStreetName(String streetName) {
		this.streetName = streetName;
	 }

	 @Override
	 public String toString() {
		return "Address [doorNo=" + doorNo + ", streetName=" + streetName + ", pincode=" + pincode + "]";
	 }
	 
	 //Business method returning formatted Address details...
	 public String displayAddressDetails() {
		 return String.format("DoorNo-%s, StreetName-%s, pincode-%s", doorNo,streetName,pincode);
	 }
}