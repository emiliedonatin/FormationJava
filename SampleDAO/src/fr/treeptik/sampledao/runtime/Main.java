package fr.treeptik.sampledao.runtime;

import java.util.List;

import fr.treeptik.sampledao.dao.DAOFactory;
import fr.treeptik.sampledao.dao.EmployeeDAO;
import fr.treeptik.sampledao.domain.Employee;

public class Main {

	public static void main(String[] args) {
		
		
		
		EmployeeDAO employeeDAO = DAOFactory.getEmployeeDAO();
		
		List<Employee> all = employeeDAO.findAll();
		
		
		
		
	}

}
