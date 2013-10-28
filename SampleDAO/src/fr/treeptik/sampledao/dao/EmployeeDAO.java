package fr.treeptik.sampledao.dao;

import java.util.List;

import fr.treeptik.sampledao.domain.Employee;

public interface EmployeeDAO {
	
	// il s'agit d'une interface donc par défaut la signature des méthodes est public et abstraite
	// cette classe comporte la signature de toutes les méthodes qui concernent les employés
	
	void save (Employee employee);
	void remove (Employee employee);
	Employee findById (Integer id);
	List<Employee> findAll();

}
