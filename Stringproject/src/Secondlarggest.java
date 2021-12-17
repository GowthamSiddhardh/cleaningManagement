import java.util.*;
public class Secondlarggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of integer");
		int n=sc.nextInt();
		int[] array=new int[n];
		System.out.println("enter the arrayinteger");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
        largest(array, n);
	}
    public static int[] largest(int[] array, int n)
    {   int max=array[0];
    	for(int i=0;i<n;i++)
    	{
    		Arrays.sort(array);
    			if(array[i]>max)
        		{
        			max=array[i];
        		}
    		
    		
        }
    	System.out.println(max);
    	System.out.println(Arrays.toString(array));
    	System.out.println("smallest number"+array[0]);
    	System.out.println("second largest"+array[array.length-2]);
    	System.out.println("product:" + array[0]*array[array.length-2]);
    	return array;
    }
}
