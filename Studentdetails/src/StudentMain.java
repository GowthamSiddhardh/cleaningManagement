import java.sql.SQLException;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the details");
		int id=Integer.parseInt(sc.nextLine());
		String name=sc.nextLine();
		String email=sc.nextLine();
		PrivateStudents ps=new PrivateStudents(id,name,email);
		User u1=new User();	
		u1.StoreValues(ps);

	}

}
