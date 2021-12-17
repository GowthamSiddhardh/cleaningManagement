package order;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the details");
		String s1=sc.nextLine();
		String [] s2=s1.split(",");
		products pd=new products(Integer.parseInt(s2[0]),s2[1],s2[2],Double.parseDouble(s2[3]),Double.parseDouble(s2[4]));
        InsertShow is=new InsertShow();
        is.update(pd);
        is.Show(pd);
	}

}

