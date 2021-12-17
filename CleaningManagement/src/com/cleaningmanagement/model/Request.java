package com.cleaningmanagement.model;

import java.util.Objects;

public class Request {
     public int userId;
     public Employee empId;
     public String catogories;
     public String location;
     
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Employee getEmpId() {
		return empId;
	}
	public void setEmpId(Employee empId) {
		this.empId = empId;
	}
	public String getCatogories() {
		return catogories;
	}
	public void setCatogories(String catogories) {
		this.catogories = catogories;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public Request() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Request(int userId, Employee empId, String catogories, String location) {
		super();
		this.userId = userId;
		this.empId = empId;
		this.catogories = catogories;
		this.location = location;
		
	}
	public Request(int userId2, String catagories, String location2) {
		// TODO Auto-generated constructor stub
		this.userId=userId2;
		this.catogories = catogories;
		this.location = location2;
		
	}
	@Override
	public String toString() {
		return "userId=" + userId + "\nempId=" + empId + "\ncatogories=" + catogories + "\nlocation="
				+ location;
	}
	@Override
	public int hashCode() {
		return Objects.hash(catogories, empId, location,userId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Request other = (Request) obj;
		return Objects.equals(catogories, other.catogories) && Objects.equals(empId, other.empId)
				&& Objects.equals(location, other.location)
				&& Objects.equals(userId, other.userId);
	}
     
     
}