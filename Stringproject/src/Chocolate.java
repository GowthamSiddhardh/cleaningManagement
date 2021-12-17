import java.util.Arrays;
import java.util.Scanner;

public class Chocolate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the matrix size");
		int n=sc.nextInt();
		int [][] arr=new int[n][n];
		System.out.println("enter the elements");
	
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("matrix");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
		int res=0;
		int res1=0;
		int res2=0;
		
		for(int i=0;i<n;i++)
		{
			for(int j=i;j==i;j++)
			{
			    res+=arr[i][j];
			}
	}
	System.out.println(res);
		
	for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				res1+=arr[i][j];
			}
		}
		System.out.println(res1);
		
	

	
	for(int i=1;i<n;i++) {
		for(int j=0;j<i;j++) {
			res2+=arr[i][j];
		}
}
	System.out.println(res2);

	}}
