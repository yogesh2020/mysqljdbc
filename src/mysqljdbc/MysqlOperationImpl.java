package mysqljdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

//  main class for operation performed..... 
public class MysqlOperationImpl implements InterfaceMysql
{
	MysqlDatabaseAccess databaseAccess = new MysqlDatabaseAccess();
	
	/**
	 * @implement note: perform create operation.and insert query apply.
	 * @description: calling getConnection method and established connection with database.
	 and result store in ResultSet from database.
	 * @param id: employee_name,employee_age,employee_sal,emp_id.
	 * return: no return value
	 */
	@Override
	 public void CreateOperation(String name ,int age,int sal,int id)
	  {
			this.databaseAccess.insertQuery(name, age, sal, id);
		//	databaseAccess.insertQuery(name, age, sal, id);
		}
	 
	 public int checkExistence(int id) 
	 {
	  int count=0;
	   try { 
			  ResultSet rs = this.databaseAccess.selectWhereQuery(id);
	   if(rs.last()) {
		   count = + rs.getRow();
	   }
	  } 
	  catch(SQLException e) {
	 e.printStackTrace();
	 } 
	   return count;
}
	  /**
	  * @implement note: perform update operation.and update query apply.
	  * @description: calling getConnection method and established connection with database.
	 and result store in ResultSet from database.
	  * @param id: employee id.
	  */
	@Override
	 public void UpdateOperation(int id,String name,int age,int sal) 
		  {	
			  this.databaseAccess.updateQuery(id, name, age, sal);
		 }

	  /**
	   * implement note:  method for select operation performed. and select query performed.
	 description: calling getConnection method and established connection with database.
	 and result store in ResultSet from database.
	   print employee detail: employee_id, employee_name,employee_age and employee_salary.
	 return statement: no return value.
	   * 
	   */
	@Override
	public void SelectOperation() 
		 {		 		 
		  try { 
			  ResultSet rs = this.databaseAccess.selectQuery();
		  while(rs.next()) {
			  System.out.print(rs.getString("emp_id")+"    ");
			 System.out.print(rs.getString("employee_Name")+"    ");
			 System.out.print(rs.getString("employee_age")+"    ");
			 System.out.println(rs.getString("employee_sal")+"    ");
		  }
		  } 
		  catch(SQLException e) {
		 e.printStackTrace();
		 } 
			
		  }
	
	/**
	 *  implement note: perform delete operation.
	  description: calling getConnection method and established connection with database.
	  and delete query perform.
	  parameter: employee_id.
	  this statement nothing return.
	 
	 */
	@Override
	public void DeleteOperation(String id) {
		   if(this.databaseAccess.deleteQuery(id)==1) {
			   System.out.println("employee deleted sucessfuly");
		   } else {
			  System.out.println("enter id employee not found"); 
		   }
		}
	
/**
 *  implement note : method create for System exit.
 *  using if loop.
 *  no return value.
 */
	
	public void systemexit()
	{
		int choice=5;
		if(choice==5)
		{
		System.out.println("System exit");
		System.exit(0);
		}
	}
	}















