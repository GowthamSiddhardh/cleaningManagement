import java.util.Scanner;

public class Boat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int distance=100;
		Scanner sc=new Scanner(System.in);
		System.out.println("boat speed:");
		int b=sc.nextInt();
		System.out.println("Water speed:");
		int w=sc.nextInt();
		int speed=b+w;
		int time=distance/speed;
		System.out.println("time:"+" "+time);

	}

}
