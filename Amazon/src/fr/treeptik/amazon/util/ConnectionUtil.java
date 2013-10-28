package fr.treeptik.amazon.util;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConnectionUtil {
	
	@Autowired
	private  DataSource dataSource;
	
	private Connection connection;
	
	public  Connection getConnection() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException{
		
		
		if (connection == null || connection.isClosed()){
			
			connection = dataSource.getConnection();
			connection.setAutoCommit(false);
			
		}

		return connection;
		
		
	}

}
