package order;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
     public static Connection getDbConnection() throws ClassNotFoundException, SQLException
     {   
    	 Class.forName("oracle.jdbc.OracleDriver");
    	 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
    	 return con;
     }
}
