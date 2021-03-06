package com.cleaningmanagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.cleaningmanagement.model.Employee;
import com.cleaningmanagement.model.Request;
import com.cleaningmanagement.model.User;

public class UserDao {
	public boolean insertUserDatabase(User user) {
		Connection con = ConnectionClass.getConnection();
		String query = "insert into  WMS_user(user_email,user_name,user_pwd,Address,mobile_no) values(?,?,?,?,?)";

		try {
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, user.getUserEmail());
			pstmt.setString(2, user.getUserName());
			pstmt.setString(3, user.getUserPwd());
			pstmt.setString(4, user.getUserAddress());
			pstmt.setLong(5, user.getUserMobileNo());
			ResultSet rs = pstmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;

	}

	public User validateUser(String email, String password) {
		User user = null;
		Connection con = ConnectionClass.getConnection();
		String query = "select * from WMS_user where user_email='" + email + "' and user_pwd='" + password + "'";
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			if (rs.next()) {

				user = new User(email, rs.getString(3), password, rs.getString(5), rs.getLong(6), rs.getDouble(7));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return user;
	}

	public int findUserId(User user) {
		Connection con = ConnectionClass.getConnection();
		String query = "select user_id from WMS_user where user_email= '" + user.getUserEmail() + "'";
		int id = 0;
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			if (rs.next()) {
				id = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return id;

	}

	public User findUser(int id)

	{
		Connection con = ConnectionClass.getConnection();
		String query = "select * from WMS_user where user_id=" + id;
		User user = null;
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			if (rs.next()) {
				user = new User(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getLong(6),
						rs.getDouble(7));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;

	}

	public int findUser(String email)

	{
		Connection con = ConnectionClass.getConnection();
		String query = "select user_id from WMS_user where user_email='" + email + "'";
		int n = 0;
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			if (rs.next()) {
				n = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;

	}

	public ResultSet userBill(User user) {
		UserDao userdao = new UserDao();
		int userid = userdao.findUserId(user);
		Connection con = ConnectionClass.getConnection();
		String joinQuery = "select r.request_id,r.user_id,r.category,c.weight_kg,c.amount,r.emp_id from WMS_request r "
				+ "join WMS_calculation c on r.category=c.categories where user_id=" + userid;
		ResultSet rs = null;
		try {
			Statement stmt = con.createStatement();
			rs = stmt.executeQuery(joinQuery);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}

	public boolean rechargeWallet(User user) {
		Connection con = ConnectionClass.getConnection();
		String updateQuery = "update WMS_user set wallet=? where user_id=?";
		UserDao userdao = new UserDao();
		int userId = userdao.findUserId(user);
		boolean flag = false;
		try {
			PreparedStatement pstmt = con.prepareStatement(updateQuery);
			pstmt.setDouble(1, user.getWallet());
			pstmt.setInt(2, userId);
			flag = pstmt.executeUpdate() > 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return flag;

	}

	public boolean updateWallet(User user, int amount) {
		Connection con = ConnectionClass.getConnection();
		UserDao userdao = new UserDao();
		int userId = userdao.findUserId(user);
		String updateQuery1 = "update WMS_user set Wallet=" + (user.getWallet() - amount) + "where user_id=" + userId;
		boolean flag = false;
		try {
			Statement stmt = con.createStatement();
			flag = stmt.executeUpdate(updateQuery1) > 0;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return flag;

	}

}
