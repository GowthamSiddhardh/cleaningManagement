package com.cleaningmanagement.test;



import java.util.Scanner;

import com.cleaningmanagement.dao.AdminDao;
import com.cleaningmanagement.dao.ConnectionClass;
import com.cleaningmanagement.dao.EmployeeDao;
import com.cleaningmanagement.dao.UserDao;
import com.cleaningmanagement.model.Admin;
import com.cleaningmanagement.model.Employee;
import com.cleaningmanagement.model.User;

public class WmsMain {

	public static void main(String[] args)  {
		   
		   String adminEmail=null;
		   String passWord=null;
		   boolean b=false;
		   EmployeeDao empdao=null;
		   String empEmail=null;
		   String empName=null;
		   String empPassword=null;
		   String email=null;
		   String userEmail=null;
		   String userName=null;
		   String userPassword=null;
		   String userAddress=null;
		   long mobileNo=0;
		   String validateEmail=null;
		   
		   Scanner sc=new Scanner(System.in);
		   System.out.println("1 adminvalidation \n 2 employeeReg \n 3 userReg ");
		   int choice=Integer.parseInt(sc.nextLine());
		   switch(choice) {
		   case 1:
		     
		   do {
           System.out.println("enter the adminName");
		   adminEmail=sc.nextLine();
		   if(!adminEmail.matches("[a-zA-z][a-zA-z0-9]+[@][a-z]+[.][a-z]{2,3}"))
		   {
			  System.out.println("email should be in abc@gamil.com");
		   }
		   if(adminEmail.isEmpty())
		   {
			   System.out.println("name cant be empty");
		   }
		   } while(!adminEmail.matches("[a-z][a-z0-9]+[@][a-z]+[.][a-z]{2,3}"));
		   do {
	       System.out.println("enter the password");
	       passWord=sc.nextLine();
	       if(!passWord.matches("[a-zA-z0-9&@#$_]+{8,15}")) 
	       {
	    	   System.out.println("password doesnot matches the condition");
	       }
	       if(passWord.isEmpty())
	       {
	    	   System.out.println("password not be empty");
	       }
		   }while(!passWord.matches("[a-zA-z0-9&@#$_]+{8,15}")||passWord.isEmpty());
	       AdminDao ad=new AdminDao();
	       b=ad.AdminDatabase(adminEmail,passWord);
	       if(b==true) 
	       {
	       System.out.println("valid successful");
	       }
	       else 
	       {
	    	   System.out.println("invalid username and password");
	       }
	       break;
	       case 2:
	    	System.out.println("\n1 registration \n2 validation");
	    	int i=Integer.parseInt(sc.nextLine());
	    	switch(i) {
	    	case 1: 
	    		do {
	            System.out.println("enter the employee email");
	    	    empEmail=sc.nextLine();
	    	    if(!empEmail.matches("[a-z][a-z0-9]+[@][a-z]+[.][a-z]{2,3}"))
	    	    {
	    	    	System.out.println("email should be in abc@gamil.com");
	    	    }
	    	    if(empEmail.isEmpty())
	    	    {
	    	    	System.out.println("cant be empty");
	    	    }
	    		}while(!empEmail.matches("[a-z][a-z0-9]+[@][a-z]+[.][a-z]{2,3}")||empEmail.isEmpty());
	    		do {
	    		System.out.println("enter the employee name");
	    		empName=sc.nextLine();
	    		 if(!empName.matches("[a-zA-z]+{32}"))
	  		     {
	  			   System.out.println("name should not have the numbers");
	  		     }
	  		    if(empName.isEmpty())
	  		    {
	  			   System.out.println("name cant be empty");
	  		    }
	  		    }while(!empName.matches("[a-zA-z]+{32}") || empName.isEmpty());
	    		do {
	    		System.out.println("enter the employee Password");
	    	    empPassword=sc.nextLine();
	    		 if(!empPassword.matches("[a-zA-z0-9&@#$_]+{8,15}")) 
	  	         {
	  	    	   System.out.println("password doesnot matches the condition");
	  	         }
	  	         if(empPassword.isEmpty())
	  	         {
	  	    	   System.out.println("password not be empty");
	  	         }
	  		     }while(!empPassword.matches("[a-zA-z0-9&@#$_]+{8,15}")||empPassword.isEmpty());
	    		Employee emp=new Employee(empEmail,empName,empPassword);
	    		empdao=new EmployeeDao();
	    		b=empdao.insertEmpDatabase(emp);
	    		System.out.println("inserted successfully");
	    	    break;	
	    	    case 2:
	    		do {
	    	    System.out.println("enter the email");
	    	    email=sc.nextLine();
	    	    if(!email.matches("[a-z][a-z0-9]+[@][a-z]+[.][a-z]{2,3}"))
	    	    {
	    	    	System.out.println("email should be in abc@gamil.com");
	    	    }
	    	    if(email.isEmpty())
	    	    {
	    	    	System.out.println("cant be empty");
	    	    }
	    		}while(!email.matches("[a-z][a-z0-9]+[@][a-z]+[.][a-z]{2,3}")||email.isEmpty());
	    		
	            empdao=new EmployeeDao();
    		    b=empdao.validation(email);
    		    if(b==false)
    		    {
    			  System.out.println("invalid");
    		    }
    		    else
    		    {
    			  System.out.println("validate successfully");
    		    }
    		    break;
	    	}
	    break;
	       case 3:
				System.out.println("\n1 registration \n2 validation");
		    	int j=Integer.parseInt(sc.nextLine());
		    	
		    	switch(j) {
		    	case 1:
		    		  
		    		do {
			            System.out.println("enter the user email");
			    	    userEmail=sc.nextLine();
			    	    if(!userEmail.matches("[a-z][a-z0-9]+[@][a-z]+[.][a-z]{2,3}"))
			    	    {
			    	    	System.out.println("email should be in abc@gamil.com");
			    	    }
			    	    if(userEmail.isEmpty())
			    	    {
			    	    	System.out.println("cant be empty");
			    	    }
			    		}while(!userEmail.matches("[a-z][a-z0-9]+[@][a-z]+[.][a-z]{2,3}")||userEmail.isEmpty());
			    		do {
			    		System.out.println("enter the user name");
			    		userName=sc.nextLine();
			    		 if(!userName.matches("[a-zA-z]+{32}"))
			  		     {
			  			   System.out.println("name should not have the numbers");
			  		     }
			  		    if(userName.isEmpty())
			  		    {
			  			   System.out.println("name cant be empty");
			  		    }
			  		    }while(!userName.matches("[a-zA-z]+{32}") || userName.isEmpty());
			    		do {
			    		System.out.println("enter the user Password");
			    	    userPassword=sc.nextLine();
			    		 if(!userPassword.matches("[a-zA-z0-9&@#$_]+{8,15}")) 
			  	         {
			  	    	   System.out.println("password doesnot matches the condition");
			  	         }
			  	         if(userPassword.isEmpty())
			  	         {
			  	    	   System.out.println("password not be empty");
			  	         }
			  		     }while(!userPassword.matches("[a-zA-z0-9&@#$_]+{8,15}")||userPassword.isEmpty());
			    		do {
			    		  System.out.println("enter the user Address");
			    		  userAddress=sc.nextLine();
			    		  if(!userAddress.matches("[0-9a-zA-Z/,]+{50}"))
			    		  {
			    			  System.out.println("Address is not in proper format");
			    		  }
			    		}while(!userAddress.matches("[0-9a-zA-Z/,]+{50}"));
			    		String tempno=null;
			    		do {
			    			System.out.println("enter the mobile number");
			    			tempno=sc.nextLine();
			    			if(!tempno.matches("[0-9]+{10}"))
			    			{
			    				System.out.println("mobile number should not contains alphabets");
			    			}
			    			if(tempno.isEmpty())
			    			{
			    				System.out.println("mobile number should be empty");
			    			}
			    		}while(!tempno.matches("[0-9]+{10}")||tempno.isEmpty());
			    		mobileNo=Long.parseLong(tempno);
			    		User user=new User(userEmail,userName,userPassword,userAddress,mobileNo);
			    		UserDao ud=new UserDao();
			    		ud.insertUserDatabase(user);
		    		break;
		    	}
		    	
		   }
	}
}
    		
		 
	    
	    	
	    	
	    	
	       	
	       
	      
	       


