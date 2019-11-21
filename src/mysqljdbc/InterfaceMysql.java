package mysqljdbc;

public interface InterfaceMysql {
	void CreateOperation(String name ,int age,int sal,int id);
	void UpdateOperation(int id,String name,int age,int sal) ;
	void SelectOperation() ;
	void DeleteOperation(String id);
    int checkExistence(int id) ;
    void systemexit();
}
