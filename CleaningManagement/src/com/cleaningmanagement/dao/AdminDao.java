package com.cleaningmanagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.cleaningmanagement.model.Admin;

public class AdminDao {
	public Admin AdminDatabase(String adminEmail, String passWord) {
		Admin admin = null;
		try {
			Connection con = ConnectionClass.getConnection();
			String insertQuery = "select * from WMS_admin where admin_email='" + adminEmail + "'and admin_pwd='"
					+ passWord + "'";

			Statement pstmt = con.createStatement();
			ResultSet rs = pstmt.executeQuery(insertQuery);
			if (rs.next()) {
				admin = new Admin(adminEmail, passWord);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return admin;

	}
}
