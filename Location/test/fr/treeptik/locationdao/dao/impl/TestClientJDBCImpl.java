package fr.treeptik.locationdao.dao.impl;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import fr.treeptik.locationdao.dao.ClientDAO;
import fr.treeptik.locationdao.dao.DAOFactory;
import fr.treeptik.locationdao.domain.Client;
import fr.treeptik.locationdao.exception.DAOException;

@RunWith (JUnit4.class)
public class TestClientJDBCImpl {
	
	@Test
	public void TestFindClientOk(){
		
		ClientDAO clientDAO = DAOFactory.getClientDAO();
		
		try {
			List<Client> clients = clientDAO.findbynom();
			
			Assert.assertNotNull(clients);
		
		
		} catch (DAOException e) {
			
			Assert.fail(e.getMessage());
			
		}
	}

}
