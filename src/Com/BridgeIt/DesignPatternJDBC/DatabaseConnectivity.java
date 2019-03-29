package Com.BridgeIt.DesignPatternJDBC;
import java.sql.*;
/**
 * 
 * @author Sangharsha Ranpise.
 * Seven Steps
 * 1. import 
 * 2.load & register the driver
 * 3.Create connection
 * 4.create Statement
 * 5.execute the query
 * 6.process the results
 * 7.close
 */

public class DatabaseConnectivity
{
	 //Java Database Connectivity 
	 public static void main(String[] args) throws ClassNotFoundException, SQLException
	 {
	      String url="jdbc:mysql://virtual-mysql-SANGHARSHASURESHRANPISE5C84FB3702982500276E3EF9/UserInformation";
	      String userName="root";
	      String password="eswwWEd";
	      String query="SELECT * FROM information";
// String query="INSERT INTO Person VALUES('Ramlala',7894561235,'chennai')";
	      Class.forName("com.mysql.jdbc.Driver");
	      //System.out.println("DemoClass.main()::driver loaded");
	      Connection con=DriverManager.getConnection(url,userName,password);
	      System.out.println("Connection established");
	      Statement st=con.createStatement();
	      ResultSet rs=st.executeQuery(query);
// int count =st.executeUpdate(query);
	      while(rs.next())
	        {
	           System.out.println(" UserName:-"+rs.getString(1)+" Password:-"+rs.getString(2));
	        }
//System.out.println(query);
	       st.close();
	       con.close();
	           
	       
	 } 
}
	   

	 
   
