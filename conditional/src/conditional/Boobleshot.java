package conditional;

import java.util.Arrays;

public class Boobleshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr ={3,18,2,15,34,12};
		int n=arr.length;
		int i,j;
		int temp=0;
		for(i=0;i<n;i++) {
			for(j=1;j<n-i;j++) {
				if(arr[j-1]>arr[j]) {
				    temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				
					
				}
				
		}
	}System.out.println(Arrays.toString(arr));

}}
