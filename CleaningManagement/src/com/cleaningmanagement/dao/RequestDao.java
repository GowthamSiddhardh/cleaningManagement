package com.cleaningmanagement.dao;

import com.cleaningmanagement.model.Request;

public class RequestDao {
    public boolean insertRequestDetails(Request req)
    {   
    	String id="select emp_id from WMS_employee where location= '"+req.location+",";
		return false;
    	
    }
}
