import java.util.Arrays;
import java.util.Scanner;

public class Multiarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a1=new int[2][3];
		int [][] a2=new int[2][3];
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 1st matrix");
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a1[i].length;j++) {
				a1[i][j]=sc.nextInt();
				
			}
			
		}
		System.out.println("enter the 2nd matrix");
		for(int i=0;i<a2.length;i++) {
			for(int j=0;j<a2[i].length;j++) {
				a2[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a1[i].length;j++) {
				System.out.print(a1[i][j]);
			}System.out.println();
		}
		System.out.println(Arrays.deepToString(a1));
		System.out.println(Arrays.deepToString(a2));
		
		int result[][]=new int[2][3];
		for(int i=0;i<a2.length;i++) {
			for(int j=0;j<a2[i].length;j++) {
				result[i][j]=a2[i][j]-a1[i][j];
			}
		}
        System.out.println(Arrays.deepToString(result));
	}

}
