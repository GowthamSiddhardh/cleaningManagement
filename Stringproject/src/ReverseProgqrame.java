import java.util.Arrays;
import java.util.Scanner;

public class ReverseProgqrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbre: ");
		int num=sc.nextInt();
		int n=4;
		int a[]=new int[n];
		int i=0;
		
		
		while(num>0) {
			a[i]=num%10;
			num=num/10;
			i++;
		}
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		for(int j=a.length-1;j>=0;j--) {
			System.out.print(a[j]);
		}
		
		char[] ch= {'g','o','w','t'};
		String st=String.valueOf(ch);
		System.out.println(st);
		String str="0847";
		float abc=Float.parseFloat(str);
		System.out.println(abc);
		


	}

}
