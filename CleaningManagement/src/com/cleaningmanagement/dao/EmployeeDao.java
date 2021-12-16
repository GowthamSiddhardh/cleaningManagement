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
     public Employee validation(String email,String password)
     {  
    	Connection con=ConnectionClass.getConnection();
    	ResultSet rs=null;
    	Employee emp=null;
    	try {
    		String query="select * from WMS_employee where emp_email='"+email+"' and emp_pwd='"+password+"'";
			Statement pstmt=con.createStatement();
			 rs=pstmt.executeQuery(query);
			if(rs.next())
			{    
				emp=new Employee(email,rs.getString(3),password);
				
		    }	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return emp;
		
    	
    	 
    	 
     }
}
