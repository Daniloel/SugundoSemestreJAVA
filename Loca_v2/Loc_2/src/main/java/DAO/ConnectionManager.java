package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	  
	
	
	/*
	 * public static Connection getConnection() throws SQLException { return
	 * DriverManager.getConnection(
	 * "jdbc:sqlserver://datatechserver.database.windows.net;databaseName=datatech;user=datatech;password=Datttechoffice01"
	 * ); }
	 */
	 
	 
	 
	
	
	
	
	
	  public static Connection getConnection() throws SQLException { return
	  DriverManager.getConnection(
	  "jdbc:sqlserver://Localhost:1433;databaseName=Louise;user=Jorge;password=1234;encrypt=true;trustServerCertificate=true"
	  ); }
	 
	 
	  
	 
	  
}
