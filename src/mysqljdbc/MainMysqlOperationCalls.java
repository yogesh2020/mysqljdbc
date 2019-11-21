package mysqljdbc;

import java.util.Scanner;
//main class for operation
public class MainMysqlOperationCalls 
{
	/**
	 * @implement note: this is main class.
	 * description: using switch case. and do while loop perform.
	 *and object create of scanner class.and object create mySql operation class.
	 */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		InterfaceMysql  ref = new MysqlOperationImpl();
	// or	MysqlOperationImpl  ref = new MysqlOperationImpl();
		int choice;
		do {
		System.out.println("press 1 for create operation");
		System.out.println("press 2 for update operation");
		System.out.println("press 3 for read or select operation");
		System.out.println("press 4 for delete operation");
		System.out.println("press 5 for system exit");
		System.out.println("choose ur choice");
	   choice = sc.nextInt();
		
		switch (choice)
		{
		/**
		 * description: input the value of employee name,employee age,employee salary,employee id.by scanner.
		 * and CreateOperation method called.
		 * parameter passed: employee name,employee age,employee salary,employee id.
		 */
		case 1:
			
			System.out.println("plz enter employee name==");
			String employee_Name = sc.next();
			
			System.out.println("plz enter employee age==");
				int age = sc.nextInt();
				
				System.out.println("plz enter employee salary==");
				int sal = sc.nextInt();
				System.out.println("plz enter employee id==");
				int	emp_id = sc.nextInt();
				
			ref.CreateOperation(employee_Name,age,sal,emp_id);
			System.out.println("  ");
			System.out.println("  ");
		break;
		/**
		 * description: input the value of employee name,employee age,employee salary,employee id.by scanner.
		 * and  UpdateOperation method called.
		 * parameter passed: employee name,employee age,employee salary,employee id.
		 */
		    case 2:
		    	System.out.println("enter employee id");
				emp_id=sc.nextInt();
				
				if(ref.checkExistence(emp_id)>0) {
				
				System.out.println("plz enter which update employee name ==");
				String emp_Name = sc.next();
			System.out.println("enter update employee age");
				int employee_age = sc.nextInt();
				System.out.println("enter update employee salary");
				int employee_sal = sc.nextInt();
		    ref. UpdateOperation(emp_id,emp_Name, employee_age,employee_sal);
		System.out.println("  ");
		System.out.println("  ");
				}
				
				else {
					System.out.println("dosent exit");
					System.out.println("  ");
				}
			break;
			/**
			 * description: select operation method called.
			 */
		case 3:
			ref.SelectOperation();
			
			System.out.println("  ");
			System.out.println("  ");
			break;
			/**
			 * description: delete operation method called.and take input emp_id from scanner.
			 * parameter: emp_id. 
			 */
		case 4:
			
			System.out.println("enter which u want to delete refence id===");
			String empl_id=sc.next();
			ref.DeleteOperation(empl_id);
			
			System.out.println();
			System.out.println("  ");
		   break;
		   /**
			 * description: system exit  method called.
			 */
		case 5:
			System.out.println("  ");
			ref.systemexit();
			System.out.println("  ");
			break;
			/**
			 * description: default choice for user give wrong input.
			 */
		   default:
			   System.out.println("  ");
			   System.out.println("wrong choice.");
			   System.out.println("  ");
				System.out.println("  ");
				
		  }
		}while(choice!=5);
		
	}
}
