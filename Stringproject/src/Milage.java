import java.util.Scanner;

public class Milage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the cc");
		int cc=sc.nextInt();
		
		Cal(cc);

	}
	public static void Cal(int cc)
	{
		if(cc>220)
		{
			System.out.println("number is too large");
		}
	  else if(cc<100)
	    {
		    System.out.println("number is too small");
	    }
	  else{
		  if(cc>100 && cc<125) {
			  System.out.println("mileage is 75");
		  }
		  else if(cc>126 && cc<135)
		  {
			  System.out.println("mileage is 70");
		  }
		  else if(cc>136 && cc<150)
		  {
			  System.out.println("mileage is 60");
		  }
		  else if(cc>151 && cc<200)
		  {
			  System.out.println("mileage is 50");
		  }
		  else if(cc>201 && cc<220)
		  {
			  System.out.println("mileage is 35");
		  }
	  }
		  
	
	}
}
