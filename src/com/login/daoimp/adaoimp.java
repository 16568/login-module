package com.login.daoimp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

import com.login.dao.aDao;
import com.login.model.amodel;

//@Repository
public class adaoimp implements aDao {

	Object assignValuesFromResultSet1(ResultSet rs, amodel data) {
		try {
			data.setUsername(rs.getString("username"));
			data.setPassword(rs.getString("password"));
			data.setEmailid(rs.getString("email"));
			data.setGender(rs.getString("gender"));
			data.setContact(rs.getString("contact"));
			data.setAddress(rs.getString("address"));
		} 
		
		catch (Exception e) {
	    e.printStackTrace();
		}
		return data;
	}

	@Override
	public String insertUserDetails(amodel addjava) {
		try {
			
			String url = "jdbc:jtds:sqlserver://10.44.58.202:1433/ADMV4.3.1";
			String username1 = "pos_user";
			String password1 = "posuser123#";
			Connection conn = null;
			PreparedStatement ps = null;
			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			System.out.println("Driver class loaded");
			conn = DriverManager.getConnection(url, username1, password1);
			System.out.println("connected");
			String username=addjava.getUsername();
			String query = "Select count(*) from UserDetails where username=? ";
	        ps = conn.prepareStatement(query);
	        ps.setString(1, username);
	        ResultSet resultSet = ps.executeQuery();
	        if(resultSet.next())
	        {
	        	if(resultSet.getInt(1) > 0)
	        		return "User Already Exists";
	        	else
	        	{
	        		String sql = "insert into UserDetails(username,password,gender,email,address,contact) values(?,?,?,?,?,?)";

	    			ps = conn.prepareStatement(sql);
	    			ps.setString(1, addjava.getUsername());
	    			ps.setString(2, addjava.getPassword());
	    			ps.setString(3, addjava.getGender());
	    			ps.setString(4, addjava.getEmail());
	    			ps.setString(5, addjava.getAddress());
	    			ps.setString(6, addjava.getContact());
	    		
	    			int count = ps.executeUpdate();
	    			System.out.println(count + "row affected");
	    			if(count !=0)
	    			{
	    				System.out.println("User Added with name="+addjava.getUsername());
	    				return "Inserted successfully";
	    			}
	    			else{
	    				System.out.println("Failed to add user with name="+addjava.getUsername());	
	        }
	        	 ps.close();
	             conn.close();
		}
		}
		}
		catch (Exception e) {

			System.err.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		 
		return null;
      
	}

	@Override
	public amodel getDetails(amodel data) {

		try {
			String url = "jdbc:jtds:sqlserver://10.44.58.202:1433/ADMV4.3.1";
			String username = "pos_user";
			String password = "posuser123#";
			Connection conn = null;
			PreparedStatement ps = null;

			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			System.out.println("Driver class loaded");
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("connected");
			String sql = "select username,password,email,gender,address,contact from UserDetails where username=?";
			ps = conn.prepareStatement(sql);

			ps.setString(1, data.getSearch());
			ResultSet rs = ps.executeQuery();
			if (rs != null && rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2)+ " " + rs.getString(3) + " " + rs.getString(4) + " "
						+ rs.getString(5) + " " + rs.getString(6));
				data = (amodel) assignValuesFromResultSet1(rs, data);
				data.setExist(true);
			}
			 ps.close();
				conn.close();
			return data;
			
		}

		catch (Exception exception) {
			return null;
			
		}
	}

	
	@Override
	public int updatedata(amodel data) {
		try
		{
		String url = "jdbc:jtds:sqlserver://10.44.58.202:1433/ADMV4.3.1"; 
		String username="pos_user";
		String password="posuser123#";
        Connection conn = null; 
        PreparedStatement ps = null;

		Class.forName("net.sourceforge.jtds.jdbc.Driver");
		System.out.println("Driver class loaded");
		conn=DriverManager.getConnection(url, username,password);
	System.out.println("connected");	
	String sql="update UserDetails  set username=?,password=?,email=?,address=?,contact=? where username=?";
	ps=conn.prepareStatement(sql);
	ps.setString(1, data.getUsername());
	ps.setString(2, data.getPassword());
	ps.setString(3, data.getEmail());
	ps.setString(4, data.getAddress());
	ps.setString(5, data.getContact());
	ps.setString(6, data.getUsername());
	
	int count=ps.executeUpdate();
	System.out.println(count);
	 ps.close();
	conn.close();
		return count;    
		}
		catch(Exception exception)
		{
			return 0;
		}
	}
	
		@Override
		public String login(amodel loginget){
			
			try {
				String url = "jdbc:jtds:sqlserver://10.44.58.202:1433/ADMV4.3.1"; 
				String username1="pos_user";
				String password1="posuser123#";
		        Connection conn = null; 
		        PreparedStatement ps = null;
				Class.forName("net.sourceforge.jtds.jdbc.Driver");
				System.out.println("Driver class loaded");
				conn=DriverManager.getConnection(url, username1,password1);
				String username=loginget.getUsername();
				String password=loginget.getPassword();
				String query = "Select count(*) from UserDetails where username=? and password=?";
		        ps = conn.prepareStatement(query);
		        ps.setString(1, username);
		        ps.setString(2, password);
		        ResultSet resultSet = ps.executeQuery();
		        if(resultSet.next())
		        {
		        	if(resultSet.getInt(1) > 0)
		        		return "login successfull";
		        	else
		        		return "Invalid Credentials";
		        }
		        ps.close();
		    	conn.close();
			}	
			catch (Exception e)
			{
				System.out.println(e);
			}
			return null;
		}

		private Connection getConnection() {
			// TODO Auto-generated method stub
			return null;
		}

		
	
	}

