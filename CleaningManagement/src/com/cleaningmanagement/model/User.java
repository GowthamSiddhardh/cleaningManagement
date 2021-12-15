package com.cleaningmanagement.model;

import java.util.Objects;

public class User {
    private String userEmail;
    private String userName;
    private String userPwd;
    private String userAddress;
    private long userMobileNo;
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public long getUserMobileNo() {
		return userMobileNo;
	}
	public void setUserMobileNo(long userMobileNo) {
		this.userMobileNo = userMobileNo;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userEmail, String userName, String userPwd, String userAddress, long userMobileNo) {
		super();
		this.userEmail = userEmail;
		this.userName = userName;
		this.userPwd = userPwd;
		this.userAddress = userAddress;
		this.userMobileNo = userMobileNo;
	}
	@Override
	public String toString() {
		return "userEmail=" + userEmail + "\nuserName=" + userName + "\nuserPwd=" + userPwd + "\nuserAddress="
				+ userAddress + "\nuserMobileNo=" + userMobileNo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(userAddress, userEmail, userMobileNo, userName, userPwd);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(userAddress, other.userAddress) && Objects.equals(userEmail, other.userEmail)
				&& Objects.equals(userMobileNo, other.userMobileNo) && Objects.equals(userName, other.userName)
				&& Objects.equals(userPwd, other.userPwd);
	}
    
}