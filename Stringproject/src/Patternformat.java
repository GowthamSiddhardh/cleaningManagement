import java.util.*;
public class Patternformat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rows");
		int n=sc.nextInt();
		
		//pattern(n);
		pattern1(n);
		

	}
	public static void pattern(int n) {
		
		for(int i=1;i<=n;i++) 
		{
		   for(int j=1;j<=n-i;j++) 
		    {
				System.out.print(" ");
				
			}
			for(int j=1;j<=i;j++) 
			{
				System.out.print("*");
			}
			System.out.println( );
			
		}
	}
	public static void pattern1(int n) {
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}System.out.println();
		}
	}
}
		



