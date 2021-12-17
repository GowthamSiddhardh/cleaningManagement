import java.util.Scanner;

public class Starpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		int i,k; 
//		for( i=1;i<=n;i++)
//		{
//			for(int j=1;j<=n-i;j++) 
//			{
//			System.out.print(" ");
//		    }
//		
//		   for(int k=1;k<=i*2-1;k++)
//		    {
//			System.out.print("*");
//		    }
//        System.out.println( );
//		}
		for( i=5;i>=0;i--)
		{
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for( k=1;k<=i*2-1;k++)
			{
				System.out.print("*");
			}
			System.out.println( );
		}
	}
}


