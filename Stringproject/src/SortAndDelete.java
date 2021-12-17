import java.util.Arrays;
import java.util.Scanner;

public class SortAndDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the arraysize");
		int n=sc.nextInt();
		int [] array=new int[n];
		System.out.println("enter the array");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("enter the num to delete");
		int d=sc.nextInt();
		delete(array, d, n);
		
	

	}
    public static void delete(int [] array,int d,int n)
    {   int index = -1;
    	for(int i=0;i<n;i++)
    	{
    		if(d==array[i])
    		{
    			array[i]=0;
    			index=i;
    			break;
    		}
    	}
    	for(int i=index;i<array.length-1;i++)
    	{
    		array[i]=array[i+1];
    	}
    	array[array.length-1]=0;
    	System.out.println(Arrays.toString(array));
    }    
}
