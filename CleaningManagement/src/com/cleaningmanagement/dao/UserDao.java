package com.cleaningmanagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.cleaningmanagement.model.Employee;
import com.cleaningmanagement.model.User;

public class UserDao {
	 public boolean insertUserDatabase(User user)
     {   
    	 Connection con=ConnectionClass.getConnection();
    	 String query="insert into  WMS_user(user_email,user_name,user_pwd,Address,mobile_no) values(?,?,?,?,?)";
    	 try {
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setString(1, user.getUserEmail() );
			pstmt.setString(2, user.getUserName());
			pstmt.setString(3, user.getUserPwd());
			pstmt.setString(4, user.getUserAddress());
			pstmt.setLong(5, user.getUserMobileNo());
			ResultSet rs=pstmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
		
     }
	 public User validateUser(String email,String password)
	 {   User user=null;
		 Connection con=ConnectionClass.getConnection();
		 String query="select * from WMS_user where user_email='"+email+"' and user_pwd='"+password+"'";
		 Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(query);
			if(rs.next())
			{
				user=new User(email,rs.getString(3),password);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		return user;
		 
	 }
    
    	
}

