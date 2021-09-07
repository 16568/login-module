package com.login.dao;

import com.login.model.amodel;
public interface aDao {

	String insertUserDetails(amodel addjava);
	public amodel getDetails(amodel addjava);
	int updatedata(amodel data);
	String login(amodel data);
	
	
}