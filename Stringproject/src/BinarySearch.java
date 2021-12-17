import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to search");
		int num=sc.nextInt();
		int[] arr= {45,28,12,46,18,2,89,100,42,88,95};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int m=arr.length/2;
		//System.out.println(arr[m]);
		int index= -1;
		for(int i=0;i<arr.length;i++)
		{
			if(num==arr[m])
			{
				index=m;
				
			}
			
			else if(num>arr[m])
			{
				for(int j=m+1;j<arr.length;j++)
				{
					if(num==arr[j]) 
					{
						index=j;
					}
				}
			}
			
			else if(num<arr[m])
			{
				for(int j=0;j<m;j++)
				{
					if(num==arr[j]) 
					{
						index=j;
					}
				}
			}
		}System.out.println(index);
		
		
    }
}
