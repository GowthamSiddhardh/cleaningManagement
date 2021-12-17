import java.util.*;
public class Stringhome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("total no of subjects");
		int numOfSubject=scan.nextInt();
		
		System.out.println("enter the marks");
		int[] markArray=new int[numOfSubject];
		for(int i=0;i<numOfSubject;i++) {
			markArray[i]=scan.nextInt();
		}
		int result=calculateGrade(markArray, numOfSubject);
		if(result<0) {
			System.out.println("invalid input");
		}
		else if(result==1) {
			System.out.println("First Grade University");
		}
		else if(result==2) {
			System.out.println("Second Grade University");
		}
		else {
			System.out.println("third Grade University");
		}
	
		
		

}
	public static int calculateGrade(int[] marks,int n) {
		int total=0,avg=0;
		for(int i=0;i<n;i++) {
			if(marks[i]<0) {
				return -1;
			}
			else {
			total=total+marks[i];
			}
		}avg=total/n;
		if(avg>100) {
			return -1;
		}
		else if(avg>80 && avg<=100) {
			return 1;
		}
		else if(avg>60 && avg<=80) {
			return 2;
		}
		else {
			return 3;
		}
		
	}
	}
