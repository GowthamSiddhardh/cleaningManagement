import java.util.Arrays;
import java.util.Scanner;

public class Floatdiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the char1");
		float [] f1=new float[n];
		for(int i=0;i<n;i++)
		{
			f1[i]=sc.nextFloat();
		}
		int[] arr=name(f1);
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	public static int[] name(float[] f1)
	{  
		int[] f2=new int[f1.length];
		for(int i=0;i<f1.length;i++)
		{
			f2[i]=(int)(f1[i]/2);
		}
		
		
		return f2;

	}

}
