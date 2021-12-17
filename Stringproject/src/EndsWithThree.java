import java.util.Scanner;

public class EndsWithThree {
   public static void main(String[] args)
 {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to search");
		int n=sc.nextInt();
		int[] array=new int[n];
		System.out.println("enter the array");
		for(int i=0;i<n;i++)
		{
			 array[i]=sc.nextInt();
		}
		end(array, n);
 }
   public static void end(int [] array,int n)
   {  int c=0;
	   for(int i=0;i<n;i++)
	   {
		   if(array[i]%10==3)
		   {
			   c++;
		   }
	   }
	   System.out.println(c);
   }
}
