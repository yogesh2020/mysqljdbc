package mysqljdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlDatabaseAccess {
	MysqlConnection  connection = new MysqlConnection();
	Connection conn = connection.getConnection();
	
	public ResultSet selectQuery() {		 
		 ResultSet rs = null;
		 try {
			  Statement stmt = conn.createStatement();		 
		  String sql; 
		  sql = "Select * FROM employee";		 
		  rs = stmt.executeQuery(sql); 
		 }
		  catch(SQLException e) {
				 e.printStackTrace();
				 } 
		  return rs;
}
	public void insertQuery(String name ,int age,int sal,int id) {		 
		  try {
				//  creating statement...
			Statement stmt = conn.createStatement();
			
			 stmt.executeUpdate("insert into employee value('"+id+"','"+name+"','"+age+"','"+sal+"')");

			} 
			catch (SQLException e) {				
				e.printStackTrace();
		}
}
	
	public void updateQuery(int id,String name,int age,int sal) {		 
		  try 
		  {
			  //  creating statement...
			  Statement stmt = conn.createStatement();
		  String sql; 
		  sql = "Update EMPLOYEE.employee set employee_name= '"+name+"', employee_age= '"+age+"',employee_sal= '"+sal+"' where emp_id = '"+id +"'";
			stmt.executeUpdate(sql);
			
		  } catch(SQLException e) {
		  e.printStackTrace(); 
		  }
}
	
	public int deleteQuery(String id) {		 
		int deleted = 0;
		 
		 try {
			 //  creating statement...
			  Statement stmt = conn.createStatement();
		 
		  String sql; 
		  sql = "DELETE FROM employee WHERE emp_id='"+id +"'";
		  deleted = stmt.executeUpdate(sql);
		  		    
		 } catch(SQLException e) {
		 
		  e.printStackTrace();
	       }
		 return deleted;
}
	
	public ResultSet selectWhereQuery(int id) {	
		ResultSet rs = null;
		   try { 
				  Statement stmt = conn.createStatement();
			 
			  String sql; 
			  sql = "select * FROM employee WHERE emp_id='"+id +"'";
			 
			   rs = stmt.executeQuery(sql); 
		

			  } 
			  catch(SQLException e) {
			 e.printStackTrace();
			 } 
		   return rs;
}
}
