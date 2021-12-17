package com.Hotel.req3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;



public class HotelMain {

	public static void main(String[] args) throws NumberFormatException, ParseException {
		Scanner sc=new Scanner(System.in);
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		System.out.println("enter the hotel1");
		String hotel1=sc.nextLine();
		System.out.println("enter the hotel2");
		String hotel2=sc.nextLine();
		
		String[] s1=hotel1.split(",");
		String[] s2=hotel2.split(",");
		
	    HotelChecking h=new HotelChecking(Integer.parseInt(s1[0]),Integer.parseInt(s1[1]),s1[2],Integer.parseInt(s1[3]),sdf.parse(s1[4]),Double.parseDouble(s1[5]));
		HotelChecking hh=new HotelChecking(Integer.parseInt(s2[0]),Integer.parseInt(s2[1]),s2[2],Integer.parseInt(s2[3]),sdf.parse(s2[4]),Double.parseDouble(s2[5]));
		
		
		
        System.out.println(h);
        System.out.println(hh);
        System.out.println(h.equals(hh));


	}

}
