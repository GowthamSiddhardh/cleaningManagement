import java.util.*;

public class Sumofprimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of interger");
		int n = sc.nextInt();
		int[] array = new int[n];
		System.out.println("enter the numbers");
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		prime(array, n);

	}

	public static void prime(int[] array, int n) {
		int total = 0;
		int flag = 0;
		for (int i = 0; i < n; i++) {
			
			for (int j = 2; j <= array[i] / 2; j++) {
				if (array[i] % j == 0) {
					flag=1;
					break;
				}

			}
			if (flag==0) {
				total = total + array[i];
			}
            flag=0;
		}
		System.out.println(total);
	}

}
