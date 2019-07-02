package Project.Interfaces;

public interface DaoInterface {
	
	public String url = "jdbc:mysql://localhost:3306/new_schema";
	public String username = "root";
	public String password = "password";
	
	public void Connect();

}
