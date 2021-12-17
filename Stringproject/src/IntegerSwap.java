import java.util.Arrays;
import java.util.Scanner;

public class IntegerSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	
		System.out.println("enter the size of the array");
		int n=sc.nextInt();
		System.out.println("enter the elements");
		int[] elementsArray=new int[n];
		for(int i=0;i<n;i++) {
			elementsArray[i]=sc.nextInt();
		}
		interchangeArray(elementsArray, n);

	}
	public static void interchangeArray(int[] array,int size) {
		for(int i=0;i<size/2;i++) {
			int temp=array[i];
			array[i]=array[size-1-i];
			array[size-1-i]=temp;
			System.out.println(array[i]+" " +array[size-1-i]);
		}
		System.out.println(Arrays.toString(array));
	}

}
