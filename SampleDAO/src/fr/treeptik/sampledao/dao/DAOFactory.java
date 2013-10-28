package fr.treeptik.sampledao.dao;

import fr.treeptik.sampledao.dao.impl.EmployeeJDBCImpl;

public class DAOFactory {
	
	
	public static EmployeeDAO getEmployeeDAO(){
		
		
		
		
		return new EmployeeJDBCImpl();
	}

}
