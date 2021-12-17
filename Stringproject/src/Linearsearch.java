import java.util.Scanner;

public class Linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to search");
		int num=sc.nextInt();
		int[] arr= {45,28,12,46,18,2,89,100};
		int index=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(num==arr[i])
			{
				index=i;
			}
			
		}
		System.out.println("the index is:"+ index);
		if(index<0)
		{
			System.out.println("number not found");
		}
	
		

	}

}
