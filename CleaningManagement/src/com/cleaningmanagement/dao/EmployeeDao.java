package com.cleaningmanagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.cleaningmanagement.model.Employee;

public class EmployeeDao {
     public boolean insertEmpDatabase(Employee emp)
     {   
    	 Connection con=ConnectionClass.getConnection();
    	 String query="insert into  WMS_employee(emp_email,emp_name,emp_pwd) values(?,?,?)";
    	 try {
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setString(1, emp.getEmpEmail());
			pstmt.setString(2, emp.getEmpName());
			pstmt.setString(3, emp.getEmpPassWord());
			ResultSet rs=pstmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
		
     }
     public boolean validation(String email)
     {  boolean flag=false;
    	Connection con=ConnectionClass.getConnection();
    	ResultSet rs=null;
    	try {
    		String query="select emp_id from WMS_employee where emp_email='"+email+"'";
			Statement pstmt=con.createStatement();
			 rs=pstmt.executeQuery(query);
			if(rs.next())
			{    flag=true;
				System.out.println(rs.getInt(1));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
    	
    	 
    	 
     }
}
