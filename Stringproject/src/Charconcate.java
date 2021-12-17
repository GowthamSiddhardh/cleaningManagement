import java.util.Arrays;
import java.util.Scanner;

public class Charconcate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the char1");
		char [] c1=new char[n];
		for(int i=0;i<n;i++)
		{
			c1[i]=sc.next().charAt(0);
		}
		char [] c2=new char[n];
		System.out.println("enter the char2");
		for(int i=0;i<n;i++)
		{
			c2[i]=sc.next().charAt(0);
		}
		String[] result=name(c1,c2);
		System.out.println(Arrays.toString(result));
		
		
		

	}
	public static String[] name(char[] c1,char[]c2)
	{  
		String[] s=new String[c1.length];
		for(int i=0;i<c1.length;i++)
		{
			
				String s1=String.valueOf(c1[i]);
				String s2=String.valueOf(c2[i]);
				s[i]=s1.concat("+").concat(s2);
				
			
		}
		return s;
	}

}
