import java.util.Arrays;
import java.util.Scanner;

public class MinvalueOfArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size1");
		int n = sc.nextInt();

		int[] array = new int[n];
		int[] array1 = new int[n];
		System.out.println("enter the array");
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("enter the array1");
		for (int i = 0; i < n; i++) {
			array1[i] = sc.nextInt();
		}
		small(array, array1, n);

	}

	public static void small(int[] array, int[] array1, int n) {
		int min = array[0], min1 = array1[0];
		int index = -1, index1 = -1;
		for (int i = 0; i < n; i++) {
			if (array[i] < min) {
				min = array[i];
				index = i;
			}
			
		}
		System.out.println(min);
		System.out.println(index);
		
		for (int j = 0; j < n; j++) {
			if (array1[j] < min1) {
				min1 = array1[j];
				index1 = j;
			}
		}
		System.out.println(min1);
	   if(index==index1)
       {
		   Arrays.sort(array1);		   
		   System.out.println((min + array1[1]));
		   
	   }else
		System.out.println(min + min1);

	}
}