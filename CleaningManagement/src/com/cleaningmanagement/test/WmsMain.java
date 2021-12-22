package com.cleaningmanagement.test;

import java.util.List;
import java.util.Scanner;

import com.cleaningmanagement.dao.AdminDao;

import com.cleaningmanagement.dao.ConnectionClass;
import com.cleaningmanagement.dao.EmployeeDao;
import com.cleaningmanagement.dao.RequestDao;
import com.cleaningmanagement.dao.UserDao;
import com.cleaningmanagement.model.Admin;

import com.cleaningmanagement.model.Employee;
import com.cleaningmanagement.model.Request;
import com.cleaningmanagement.model.User;

public class WmsMain {

	public static void main(String[] args) {
		EmployeeDao empdao = null;
		String validateEmail = null;
		Scanner sc = new Scanner(System.in);
		int empId1 = 0;
		System.out.println("1 adminvalidation \n 2 employeeReg \n 3 userReg ");
		int choice = Integer.parseInt(sc.nextLine());
		switch (choice) {
		case 1:
			String adminEmail = null;
			String passWord = null;
			Admin admin = null;
			do {
				System.out.println("login");

				do {
					System.out.println("enter the adminEmail");
					adminEmail = sc.nextLine();
					if (!adminEmail.matches("[a-zA-z][a-zA-z0-9]+[@][a-z]+[.][a-z]{2,3}")) {
						System.out.println("email should be in abc@gamil.com");
					}
					if (adminEmail.isEmpty()) {
						System.out.println("name cant be empty");
					}
				} while (!adminEmail.matches("[a-z][a-z0-9]+[@][a-z]+[.][a-z]{2,3}"));
				do {
					System.out.println("enter the password");
					passWord = sc.nextLine();
					if (!passWord.matches("[a-zA-z0-9&@#$_]{8,15}")) {
						System.out.println("password doesnot matches the condition");
					}
					if (passWord.isEmpty()) {
						System.out.println("password not be empty");
					}
				} while (!passWord.matches("[a-zA-z0-9&@#$_]{8,15}") || passWord.isEmpty());
				AdminDao ad = new AdminDao();
				admin = ad.AdminDatabase(adminEmail, passWord);
				if (admin != null) {
					System.out.println("welcome");
				} else {
					System.out.println("invalid username and password");
				}
			} while (admin == null);

		case 2:
			System.out.println("enter the employee details");
			System.out.println("\n1 registration \n2 validation \n3 showEmloyee");
			int i = Integer.parseInt(sc.nextLine());
			switch (i) {
			case 1:
				String empEmail = null;
				String empName = null;
				String empPassword = null;
				String location = null;
				boolean b = false;
				do {
					System.out.println("enter the employee email");
					empEmail = sc.nextLine();
					if (!empEmail.matches("[a-z][a-z0-9]+[@][a-z]+[.][a-z]{2,3}")) {
						System.out.println("email should be in abc@gamil.com");
					}
					if (empEmail.isEmpty()) {
						System.out.println("cant be empty");
					}
				} while (!empEmail.matches("[a-z][a-z0-9]+[@][a-z]+[.][a-z]{2,3}") || empEmail.isEmpty());
				do {
					System.out.println("enter the employee name");
					empName = sc.nextLine();
					if (!empName.matches("[a-zA-z]+{18}")) {
						System.out.println("name should not have the numbers");
					}
					if (empName.isEmpty()) {
						System.out.println("name cant be empty");
					}
				} while (!empName.matches("[a-zA-z]+{18}") || empName.isEmpty());
				do {
					System.out.println("enter the employee Password");
					empPassword = sc.nextLine();
					if (!empPassword.matches("[a-zA-z0-9&@#$_]{8,15}")) {
						System.out.println("password doesnot matches the condition");
					}
					if (empPassword.isEmpty()) {
						System.out.println("password not be empty");
					}
				} while (!empPassword.matches("[a-zA-z0-9&@#$_]{8,15}") || empPassword.isEmpty());
				do {
					System.out.println("enter the location");
					location = sc.nextLine();
					if (location.isEmpty()) {
						System.out.println("location should not be empty");
					}
					if (!location.matches("[a-zA-Z]+")) {
						System.out.println("location should be alphabets only");
					}
				} while (location.isEmpty() || !location.matches("[a-zA-Z]+"));
				Employee emp = new Employee(empEmail, empName, empPassword, location);
				empdao = new EmployeeDao();
				b = empdao.insertEmpDatabase(emp);
				if (b == true) {
					System.out.println("registered successfully");
				} else {
					System.out.println("not registered successfully");
				}
//	    		empId1=empdao.findEmpId(location);
//	    	    System.out.println(empId1);
				break;
			case 2:
				String email = null;
				String password = null;
				Employee employee = null;
				do {
					System.out.println("login");

					do {
						System.out.println("enter the email");
						email = sc.nextLine();
						if (!email.matches("[a-z][a-z0-9]+[@][a-z]+[.][a-z]{2,3}")) {
							System.out.println("email should be in abc@gamil.com");
						}
						if (email.isEmpty()) {
							System.out.println("cant be empty");
						}
					} while (!email.matches("[a-z][a-z0-9]+[@][a-z]+[.][a-z]{2,3}") || email.isEmpty());
					do {
						System.out.println("enter the password");
						password = sc.nextLine();
						if (!password.matches("[a-zA-Z0-9@#$_&%]{8,15}")) {
							System.out.println("password doesnot matches the condition");
						}
						if (password.isEmpty()) {
							System.out.println("password should not be empty");
						}
					} while (!password.matches("[a-zA-Z0-9@#$_&%]{8,15}") || password.isEmpty());
					empdao = new EmployeeDao();
					employee = empdao.validation(email, password);

					if (employee != null) {
						System.out.println("welcome" + " " + employee.getEmpName());
					} else {
						System.out.println("invalid email or password");
					}
				} while (employee == null);
			case 3:
				EmployeeDao employeedao = new EmployeeDao();
				List<Employee> list = employeedao.showEmployee();
				for (int j = 0; j < list.size(); j++) {
					System.out.println(list.get(j));
				}
				break;
			}

		case 3:
			System.out.println("\nUser\n1 registration \n2 validation \n3 show \n4 updateRequest");
			int j = Integer.parseInt(sc.nextLine());

			switch (j) {
			case 1:
				String userEmail = null;
				String userName = null;
				String userPassword = null;
				String userAddress = null;
				long mobileNo = 0;

				do {
					System.out.println("enter the user email");
					userEmail = sc.nextLine();
					if (!userEmail.matches("[a-z][a-z0-9]+[@][a-z]+[.][a-z]{2,3}")) {
						System.out.println("email should be in abc@gamil.com");
					}
					if (userEmail.isEmpty()) {
						System.out.println("cant be empty");
					}
				} while (!userEmail.matches("[a-z][a-z0-9]+[@][a-z]+[.][a-z]{2,3}") || userEmail.isEmpty());
				do {
					System.out.println("enter the user name");
					userName = sc.nextLine();
					if (!userName.matches("[a-zA-z]+{32}")) {
						System.out.println("name should not have the numbers");
					}
					if (userName.isEmpty()) {
						System.out.println("name cant be empty");
					}
				} while (!userName.matches("[a-zA-z]+{32}") || userName.isEmpty());
				do {
					System.out.println("enter the user Password");
					userPassword = sc.nextLine();
					if (!userPassword.matches("[a-zA-z0-9&@#$_]{8,15}")) {
						System.out.println("password doesnot matches the condition");
					}
					if (userPassword.isEmpty()) {
						System.out.println("password not be empty");
					}
				} while (!userPassword.matches("[a-zA-z0-9&@#$_]{8,15}") || userPassword.isEmpty());
				do {
					System.out.println("enter the user Address");
					userAddress = sc.nextLine();
					if (!userAddress.matches("[0-9a-zA-Z/,.]+{50}")) {
						System.out.println("Address is not in proper format");
					}
				} while (!userAddress.matches("[0-9a-zA-Z/,.]+{50}"));
				String tempno = null;
				do {
					System.out.println("enter the mobile number");
					tempno = sc.nextLine();
					if (!tempno.matches("[0-9]+{10}")) {
						System.out.println("mobile number should not contains alphabets");
					}
					if (tempno.isEmpty()) {
						System.out.println("mobile number should be empty");
					}
				} while (!tempno.matches("[0-9]+{10}") || tempno.isEmpty());
				mobileNo = Long.parseLong(tempno);
				User user = new User(userEmail, userName, userPassword, userAddress, mobileNo);
				UserDao ud = new UserDao();
				boolean a = ud.insertUserDatabase(user);
				System.out.println("inserted successfully");
				break;
			case 2:

				String validateUseremail = null;
				String validateUserPwd = null;
				String catagories = null;
				String location = null;
				Request req = null;
				User user1 = null;
				do {
					System.out.println("login");

					do {
						System.out.println("enter the user email");
						validateUseremail = sc.nextLine();
						if (!validateUseremail.matches("[a-z][a-z0-9]+[@][a-z]+[.][a-z]{2,3}")) {
							System.out.println("email should be in abc@gamil.com");
						}
					} while (!validateUseremail.matches("[a-z][a-z0-9]+[@][a-z]+[.][a-z]{2,3}"));
					do {
						System.out.println("enter the user password");
						validateUserPwd = sc.nextLine();
						if (!validateUserPwd.matches("[a-zA-z0-9&@#$_]{8,15}")) {
							System.out.println("password doesnot matches the condition");
						}
						if (validateUserPwd.isEmpty()) {
							System.out.println("password should not be empty");
						}
					} while (!validateUserPwd.matches("[a-zA-z0-9&@#$_]{8,15}") || validateUserPwd.isEmpty());

					UserDao udd = new UserDao();
					user1 = udd.validateUser(validateUseremail, validateUserPwd);
					if (user1 != null) {
						System.out.println("welcome" + user1.getUserName());
						EmployeeDao empDao = new EmployeeDao();
						// int userId=uid.findUserId(validateUseremail);
						System.out.println("enter the catagories");
						catagories = sc.nextLine();
						System.out.println("enter the location");
						location = sc.nextLine();
						Employee employee = empDao.findEmployee(location);
						req = new Request(user1, employee, catagories, location);
						RequestDao rd = new RequestDao();
						boolean b = rd.insertRequestDetails(req);
						if (b == true) {
							System.out.println("request details are updated successfully");
						} else {
							System.out.println("request details are not updated");
						}
					} else {
						System.out.println("invalid username and password");
					}
				} while (user1 == null);
				break;
			case 3:

				RequestDao requestdao = new RequestDao();
				List<Request> listemployee = requestdao.showRequest();
				for (int k = 0; k < listemployee.size(); k++) {
					System.out.println(listemployee.get(k));
				}
				break;
			case 4:

				int RequestId = 0;
				int n = 0;
				String category1=null;
				String location1=null;
				do {
				System.out.println("enter the category");
			    category1 = sc.nextLine();
				if(category1.isEmpty())
				{
					System.out.println("category should not be empty");
				}
				if(!category1.matches("[a-zA-Z]+"))
				{
					System.out.println("category should not contains numbers");
				}
				}while(category1.isEmpty() ||!category1.matches("[a-zA-Z]+") );
				do {
				System.out.println("enter the location");
			    location1 = sc.nextLine();
			    if(location1.isEmpty())
			    {
			    	System.out.println("location should not be empty");
			    }
			    if(!location1.matches("[a-zA-Z]+"))
			    {
			    	System.out.println("location should not contains numbers");
			    }
				}while(location1.isEmpty() ||!location1.matches("[a-zA-Z]+") );
				
				System.out.println("enter the email");
				String email = sc.nextLine();
				UserDao userdao = new UserDao();
				int userId = userdao.findUser(email);
				System.out.println(userId);
				RequestDao requestdao1 = new RequestDao();
				RequestId = requestdao1.findRequestID(userId, category1, location1);
				if (RequestId != 0) {
					System.out.println("requestId found");
				} else {
					System.out.println("requestId not found");
				}

				System.out.println("update the request");

				System.out.println("enter the category");
				String category2 = sc.nextLine();
				System.out.println("enter the location");
				String location2 = sc.nextLine();
				EmployeeDao empDao = new EmployeeDao();
				Employee employee = empDao.findEmployee(location2);
				RequestDao requestdao2 = new RequestDao();
				n = requestdao2.updateRequest(category2, location2, employee, RequestId);
				if (n != 0) {
					System.out.println("updated successfully");
				} else {
					System.out.println("not updated successfully");
				}

			}

		}
	}
}
