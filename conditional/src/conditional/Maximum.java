package conditional;

import java.util.Arrays;

public class Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int a=110,b=75,c=90,d=130,e=120;
		if(a>b && a>c && a>d && a>e)
			System.out.println("a is greater");
		
		else if(b>c && b>d && b>e)
			System.out.println("b is greater");
		else if(c>d && c>e)
			System.out.println("c is greater");
		else if(d>e)
		    System.out.println("d is greater");
	    else
			System.out.println("e is greater");
		
		float i=200.5f,j=3.5f,k=25.5f;
		float result=((i>j && i>k)?i:(j>k)?j:k);
		System.out.println(result);
		
		int[] arr= {30,80,50,70,90};
		Arrays.sort(arr);
		int max=arr[0];
		for(int u=0;u<arr.length;u++) {
		   if(arr[u]>max) {
			   max=arr[u];
			   
		   }
		}
	System.out.println("min value is:"+ max);
	//System.out.println("max value is:"+ arr[arr.length-1]);*/
	 int[] arr= {5,3,7,9};
	 int result=0;
	 int i=0;
	 while(i<arr.length) {
		 result=result+arr[i];
		 i++;
	 }
	 System.out.println(result);
	 
	/* int result=0;
	 for(int i:arr) {
		  result=result+i;
	 }
	 System.out.println(result);
	 
	 String s1=String.valueOf(result);
	 int rem=0,sum=0;
	 int temp=result;
	 for(int i=0;i<s1.length();i++)
	 {
		 rem=temp%10;
		 sum=sum+rem;
		 temp=temp/10;
	 }
	 System.out.println(sum);*/
	 
	 
	 }
	
}
