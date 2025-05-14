package com.ashokit.dao;

import java.util.List;

import com.ashokit.beans.Enquiry;

public interface EnquiryDao {
	
	public boolean saveEnquiryDetails(Enquiry enquiry);
	
	public List<Enquiry> getAllEnquires();

}
