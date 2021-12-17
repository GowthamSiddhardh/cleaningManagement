import java.util.Arrays;
import java.util.Scanner;

public class ThreeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size1");
		int n = sc.nextInt();

		int[] array = new int[n];
		int[] array1 = new int[n];
		int [] array2=new int[n];
		
		System.out.println("enter the array");
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("enter the array1");
		for (int i = 0; i < n; i++) {
			array1[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{   int index=array1[i];
			array2[index]=array[i];
		}
		System.out.println(Arrays.toString(array2));
		

	}
	
}
