import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDetails {
      public Connection join() throws ClassNotFoundException, SQLException
      {
    	  Class.forName("oracle.jdbc.OracleDriver");
    	  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
    	    return con;  
      }
      
}
