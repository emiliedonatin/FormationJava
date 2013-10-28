package fr.treeptik.gestionprojet.dao.impl;

import java.util.Date;
import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import fr.treeptik.gestionprojet.dao.EmployeeDAO;
import fr.treeptik.gestionprojet.exception.DAOException;
import fr.treeptik.gestionprojet.model.Employee;

@Repository
public class EmployeeDAOImpl extends GenericDAOImpl<Employee, Integer> implements EmployeeDAO{

	public EmployeeDAOImpl() {
		super(Employee.class);
		
	}

	@Override
	public List<Employee> findAllWithProject() throws DAOException {
		
		TypedQuery<Employee> query = entityManager.createQuery("SELECT distinct e FROM Employee e left join FETCH e.projects p", Employee.class);
		List<Employee> resultList = query.getResultList();
		
		return resultList;
	}

	@Override
	public List<Employee> findByProjectName(String name) throws DAOException {
		
		TypedQuery<Employee> query = entityManager.createQuery("Select e FROM Employee e Right join FETCh e.projects p Where p.name= :name", Employee.class);
		query.setParameter("name", name);
		List<Employee> resultList = query.getResultList();
		
		return resultList;
	}

	@Override
	public List<Employee> findByStartDate(Date from, Date to) throws DAOException {
		
		TypedQuery<Employee> query = entityManager.createQuery("Select e From Employee e Where e.startDate between :dateFrom and :dateTo", Employee.class);
		query.setParameter("dateFrom", from);
		query.setParameter("dateTo", to);
		
		List<Employee> resultList = query.getResultList();
		
		
		return resultList;
	}

	@Override
	public List<Employee> findAllWithoutProject() throws DAOException {
		
		TypedQuery<Employee> query = entityManager.createQuery("Select e From Employee e Where e.projects IS EMPTY", Employee.class);
		List<Employee> resultList = query.getResultList();
		
		
		return resultList;
	}

	@Override
	public List<Object[]> findAvgSalaryByDepartment() throws DAOException {
		
		return null;
	}

	@Override
	public Employee findLastEmployee() throws DAOException {
		
		return null;
	}

	@Override
	public List<Employee> find4LastEmployee() throws DAOException {
		
		return null;
	}

}
