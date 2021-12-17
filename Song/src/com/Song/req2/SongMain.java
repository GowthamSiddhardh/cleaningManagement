package com.Song.req2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;



public class SongMain {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("enter the song1");
		String song1=sc.nextLine();
		System.out.println("enter the song2");
		String song2=sc.nextLine();
		
		String[] s1=song1.split(",");
		String[] s2=song2.split(",");
		
		SongChecking s=new SongChecking();
		s.setName(s1[0]);
		s.setArtist(s1[1]);
		s.setSongType(s1[2]);
		s.setRatings(Double.parseDouble(s1[3]));
		s.setNumberOfDownloads(Integer.parseInt(s1[4]));
		s.setDateDownloaded(sdf.parse(s1[5]));
		
		SongChecking ss=new SongChecking(s2[0],s2[1],s2[2],Double.parseDouble(s2[3]),Integer.parseInt(s2[4]),sdf.parse(s2[5]));
        System.out.println(s);
        System.out.println(ss);
        System.out.println(s.equals(ss));

	}

}
