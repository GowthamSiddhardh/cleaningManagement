package com.Mail.Req1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class MailMain {

	public static void main(String[] args) throws ParseException {
		
		Scanner scan =new Scanner (System.in);
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("enter mail 1 detail:");
		String details=scan.nextLine();
		String arr[]=details.split(",");
		
		MailChecking mail1=new MailChecking();
		
		mail1.setId(Long.parseLong(arr[0]));
		mail1.setTo(arr[1]);
		mail1.setFrom(arr[2]);
		mail1.setSubject(arr[3]);
		mail1.setContent(arr[4]);
		mail1.setReceivedDate(sdf.parse(arr[5]));
		mail1.setSize(Double.parseDouble(arr[6]));
		System.out.println(mail1);
		
		System.out.println("enter mail 2 detail:");
		String details1=scan.nextLine();
		String arr1[]=details1.split(",");
		MailChecking mail2=new MailChecking(Long.parseLong(arr1[0]),arr1[1],arr1[2],arr1[3],
				arr1[4],sdf.parse(arr1[5]),Double.parseDouble(arr1[6]));
		System.out.println(mail2);
		System.out.println(mail1.equals(mail2));
		
	}

}
