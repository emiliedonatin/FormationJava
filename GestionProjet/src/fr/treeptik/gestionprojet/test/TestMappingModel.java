package fr.treeptik.gestionprojet.test;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import fr.treeptik.gestionprojet.model.Employee;
import fr.treeptik.gestionprojet.model.Phone;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class TestMappingModel {
	
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Test
	@Transactional
	@Rollback(false)

	public void testMapping(){
		
		Employee employee = new Employee(null, "name", new BigInteger("100000"), new Date(), null, null, null);
		
		entityManager.persist(employee);
	}

	@Test
	@Transactional
	@Rollback(false)
	@Ignore
	public void testEnumPhone(){
		
		
		Phone phone = new Phone(null, "number",	"Home", null);
		entityManager.persist(phone);
	}
	
}
