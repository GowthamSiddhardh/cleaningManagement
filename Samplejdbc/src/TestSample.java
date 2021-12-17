
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestSample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		Statement stmt= con.createStatement();
		
	
		
//		ps.setInt(1, 5);
//		ps.setString(2,"siddu");
//		ps.setString(3,"siddu@gmail.com");
//		
//		ps.executeUpdate();
//		
		
//		ps.setInt(1, 6);		
//		ps.setString(2,"gokul");
//		ps.setString(3,"gokul@gmail.com");
//		 
//		System.out.println(ps.executeUpdate());
//		
		
        
//        String sql;
//        sql="insert all "
//		+ "into users1 values(2,'maari','sadkj@gmail.com')"
//		+ "into users1 values(3,'mani','rahul3421@gmail.com')"
//		+ "into users1 values(4,'paalmaadu','ponnu@gmail.com')"
//		+ "select * from dual";
//        
//        System.out.println(stmt.executeUpdate(sql));
//        String sql="select * from users1";
//        ResultSet rs=stmt.executeQuery(sql);
//        while(rs.next())
//        {
//        	System.out.println(rs.getInt("id")+"\t"+rs.getString("name")+"\t"+rs.getString("email"));
//        }
		Scanner sc=new Scanner(System.in);
		String ss="insert into users(id,name,email) values(?,?,?)";
		PreparedStatement pp=con.prepareStatement(ss);
		int i=1;
		while(i==1)
		{
			System.out.println("enter the details");
			int id=Integer.parseInt(sc.nextLine());
			pp.setInt(1,id);
			String name=sc.nextLine();
			pp.setString(2, name);
			
			String email=sc.nextLine();
			pp.setString(3, email);
			String query="insert into users1 values("+id+",'"+name+"','"+email+"')";
			stmt.executeUpdate(query);
			System.out.println("do you want to continue(1/2)");
			 i=Integer.parseInt(sc.nextLine());
		}
		pp.executeUpdate();
//		String str1="select * from users1";
//		
//		ResultSet rs=stmt.executeQuery(str1);
//		while(rs.next())
//		{
//			System.out.println(rs.getInt("id")+"\t"+rs.getString("name")+"\t"+rs.getString("email"));
//		}
		
		
	}

}
