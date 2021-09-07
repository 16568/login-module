package com.login.service;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;

import com.login.dao.aDao;
import com.login.model.amodel;

//@Service
public class aservice {
	
	//@Autowired
	private aDao adddao;
	
	public String validateUser(amodel addjava) {
		String error = null;
		if(addjava.getPassword().matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[@#$%^&+=]).*$")&&(addjava.getEmail().contains("@")==true)&&addjava.getContact().matches("^[0-9]{10}$"))
		{
		System.out.println("validation successfull");
		return adddao.insertUserDetails(addjava);
				
		}

		else {
			 if (addjava.getPassword().matches(
					"^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[@#$%^&+=]).*$") == false) {
				error = "Enter the valid password";
			}
		}
		return error;
	}
	
			
	
	public amodel IsPresent(amodel data) {
		
		data = adddao.getDetails(data);
		if(data.isExist())
			return data;
		else 
			return  null;
		
	}
	
	

	public String UpdateData(amodel data)
	{
		String error = null;

		if( data.getPassword().matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[@#$%^&+=]).*$") && data.getEmail().contains("@")&&data.getContact().matches("^[0-9]{10}$"))
				{
			
			int result=adddao.updatedata(data);
			
			if(result!=0)
			{
				return "updated successfully";
			}
			return "Username cannot be updated!!!";
				}
		
			else 
			{
				if (data.getPassword().matches(
						"^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[@#$%^&+=]).*$") == false) {
					error = "Enter valid password!!!";
				} else if (data.getEmail().contains("@") == false) {
					error = "Enter valid email";
				} else if (data.getContact().matches("^[0-9]{10}$") == false) {
					error = "Enter valid Contact number";
				}
			}
		return error;

	}
	
	
	public static String loginservice(amodel data) {	
			String error=null;
			if(data.getUsername()!=null){
			return aDao.login(data);
			}
			else
			{
			error="Enter valid UserName and Password";
		     return error;
			}
	}
	
}
		
		
	
