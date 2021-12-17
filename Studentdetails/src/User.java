import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
 

public class User {
      public void StoreValues(PrivateStudents ps) throws ClassNotFoundException, SQLException
      {
    	 ConnectionDetails cd=new ConnectionDetails();
    	 Connection c=cd.join();
    	 int  b=1;
    	 while(b==1) {
         Scanner scan=new Scanner(System.in);
         String str="insert into studentprofile(id,name,email) values(?,?,?)";
         PreparedStatement pd=c.prepareStatement(str); 
         pd.setInt(1, ps.getId());
         pd.setString(2, ps.getName());
         pd.setString(3, ps.getEmail());
         System.out.println(pd.executeUpdate());
         System.out.println("do you wnat to continue(t/f)");
         b=scan.nextInt();
         
    	 }
      }
}
