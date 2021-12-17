package order;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertShow {
     public void update(products pd) throws ClassNotFoundException, SQLException
     {
    	 Connection con=ConnectionUtil.getDbConnection();
    	 System.out.println("connected successful");
    	 String str="insert into orders values(?,?,?,?,?)";
    	 PreparedStatement stmt=con.prepareStatement(str);
    	 stmt.setInt(1, pd.getId());
    	 stmt.setString(2, pd.getName());
    	 stmt.setString(3, pd.getDesc());
    	 stmt.setDouble(4, pd.getStancost());
    	 stmt.setDouble(5, pd.getLocalcost());
    	 stmt.executeUpdate();
     }
     public void Show(products pd) throws ClassNotFoundException, SQLException
     {
    	 Connection con=ConnectionUtil.getDbConnection();
    	 String query="select * from orders";
    	 
    	 Statement st=con.createStatement();
    	 ResultSet rs=st.executeQuery(query);
    	 System.out.format("%-5s%-25s%-30s%-20s%-20s\n","id","name","des","stanCost","localCost");
    	 System.out.println("------------------------------------------------------------------------");
    	 while(rs.next())
    	 {
    		 System.out.format("%-5s%-25s%-30s%-20s%-20s\n",rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getDouble(5));
    	 }
    	 
     }
}
