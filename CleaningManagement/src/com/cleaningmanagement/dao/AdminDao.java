package com.cleaningmanagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.cleaningmanagement.model.Admin;

public class AdminDao {
	public boolean AdminDatabase(String adminEmail,String passWord)  {
		boolean flag=false;
        try {
			Connection con=ConnectionClass.getConnection();
			String insertQuery="select * from WMS_admin where admin_email='"+adminEmail+"'and admin_pwd='"+passWord+"'";
			
			Statement pstmt=con.createStatement();
			ResultSet rs=pstmt.executeQuery(insertQuery);
			if(rs.next())
			{
				flag=true;
			}
			else
			{
				flag=false;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return flag;
        
    }
}
