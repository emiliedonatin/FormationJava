package fr.treeptik.locationJPA.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import fr.treeptik.locationJPA.DAO.ClientDAO;
import fr.treeptik.locationJPA.DAOImpl.ClientDAOImpl;
import fr.treeptik.locationJPA.domain.Client;


@RunWith(JUnit4.class)
public class TestClientDAOImpl {
	
	@Test
	public void testSaveClient(){
		
		ClientDAO clientDAO = new ClientDAOImpl();
	
		Client client = new Client(null, "nomCl", "adresse", "ville");
		
		clientDAO.save(client);
		
		
		
	}
	
	

}
