package fr.treeptik.locationdao.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConnectionJDBC {
	
	
	private static Connection connection;
	
	public static Connection getConnection() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException{
		
		if (connection == null || connection.isClosed()){
			
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/location", "root", "root");
			
			connection.setAutoCommit(false);
		}
	
	return connection;
	
	}
	
	
	
}