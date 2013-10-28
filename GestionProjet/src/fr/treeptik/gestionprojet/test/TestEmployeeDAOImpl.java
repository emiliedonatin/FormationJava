package fr.treeptik.gestionprojet.test;

import java.util.Date;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.treeptik.gestionprojet.dao.EmployeeDAO;
import fr.treeptik.gestionprojet.exception.DAOException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class TestEmployeeDAOImpl {

	@Autowired
	private EmployeeDAO employeeDAO;

	@Test
	@Ignore
	public void testFindAllWithProject() throws DAOException {

		try {
			System.out.println(employeeDAO.findAllWithProject());
		} catch (DAOException e) {
			throw new DAOException(e.getMessage(), e);

		}

	}

	@Test
	@Ignore
	public void testFindByProjectName() throws DAOException {
		
		try {
			employeeDAO.findByProjectName("Release1");
		} catch (DAOException e) {
			throw new DAOException(e.getMessage(), e);
		}

	}


	@Test
	@Ignore
	public void testFindByStartDate() throws DAOException{
		
		try {
			employeeDAO.findByStartDate(new Date(), new Date());
		} catch (DAOException e) {
			throw new DAOException(e.getMessage(), e);
		}
		
		
	}

	@Test
	public void testfindAllWithoutProject() throws DAOException{
		
		try {
			employeeDAO.findAllWithoutProject();
		} catch (DAOException e) {
			throw new DAOException(e.getMessage(), e);
		}
		
	}

}
