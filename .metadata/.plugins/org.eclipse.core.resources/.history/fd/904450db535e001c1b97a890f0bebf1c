package com.cleaningmanagement.model;

import java.util.Objects;

public class Admin {
   private int adminId;
   private String adminName;
   private String adminPwd;
   private String city;
public int getAdminId() {
	return adminId;
}
public void setAdminId(int adminId) {
	this.adminId = adminId;
}
public String getAdminName() {
	return adminName;
}
public void setAdminName(String adminName) {
	this.adminName = adminName;
}
public String getAdminPwd() {
	return adminPwd;
}
public void setAdminPwd(String adminPwd) {
	this.adminPwd = adminPwd;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Admin() {
	super();
	// TODO Auto-generated constructor stub
}
public Admin(int adminId, String adminName, String adminPwd, String city) {
	super();
	this.adminId = adminId;
	this.adminName = adminName;
	this.adminPwd = adminPwd;
	this.city = city;
}
@Override
public String toString() {
	return "adminId=" + adminId + "\nadminName=" + adminName + "\nadminPwd=" + adminPwd + "\ncity=" + city;
}
@Override
public int hashCode() {
	return Objects.hash(adminId, adminName, adminPwd, city);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Admin other = (Admin) obj;
	return adminId == other.adminId && Objects.equals(adminName, other.adminName)
			&& Objects.equals(adminPwd, other.adminPwd) && Objects.equals(city, other.city);
}
   
}
