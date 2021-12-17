import java.util.Arrays;
import java.util.Scanner;

public class RemoveRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr=new int[6];
		int m=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array element");
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=sc.nextInt();
        }
        System.out.println("enter the number");
        int num=sc.nextInt();
        
		for(int j=0;j<arr.length;j++)
		{
			if(num==arr[j])
			{
				m+=1;
				
			}
			//System.out.println(m);
		}
		for(int i=m;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		

}
}
