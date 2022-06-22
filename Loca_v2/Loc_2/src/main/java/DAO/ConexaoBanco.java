package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoBanco {

	public static void main(String[] args) {
		

		//String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=Locadora;user=Jorge;password=1234;encrypt=true;trustServerCertificate=true";
		String connectionUrl ="jdbc:sqlserver://Localhost;databaseName=Louise;user=Jorge;password=1234;encrypt=true;trustServerCertificate=true";
		try {
			// Load SQL Server JDBC driver and establish connection.
			System.out.print("Connecting to SQL Server ... ");
			try (Connection connection = DriverManager.getConnection(connectionUrl)) {
				System.out.println("Conexao aberta com sucesso.");
			}
		} catch (Exception e) {
			System.out.println();
			e.printStackTrace();
		}
	}

}
