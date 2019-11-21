package mysqljdbc;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 * main class for connection established with mySql database.
 *return: return to the connection.
 */
public class MysqlConnection 
{
	/**
	 * description: load the driver. and connectivity to the mySql database. 
	 */
	public Connection getConnection()
	{
		 Connection conn=null;
		try
		{
			//  load the driver...
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//  Connecting to database...
			
 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/EMPLOYEE","root","system123");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			}
		return conn;
		
			}//end
	}
