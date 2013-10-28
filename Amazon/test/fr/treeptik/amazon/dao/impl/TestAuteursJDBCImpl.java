package fr.treeptik.amazon.dao.impl;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.treeptik.amazon.dao.AuteursDAO;
import fr.treeptik.amazon.domain.Auteurs;
import fr.treeptik.amazon.exception.DAOException;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")


public class TestAuteursJDBCImpl {
	
	@Autowired 
	private AuteursDAO auteursDAO;
	
	@Test
	public void testSaveAuteursOK(){
		
		Auteurs auteurs = new Auteurs(4, "autNom", "autPrenom", "url", "autEmail");
		
		try {
			
			auteurs = auteursDAO.save(auteurs);
			
			Assert.assertNotNull(auteurs);
		
		
		} catch (DAOException e) {
			
			Assert.fail(e.getMessage());
			
		}
		
		
	}
	
	@Test
	public void testRemoveAuteursOk(){
		
		Auteurs auteurs = new Auteurs();
		auteurs.setAutId(1);
		
		try {
			auteursDAO.remove(auteurs);
			
		} catch (DAOException e) {
			
			Assert.assertTrue(e.getMessage().contains("a foreign key constraint fails"));
			
		}
	}
	
	@Test
	public void testFindByAutIdOk(){
		
		try {
			Auteurs auteurs = auteursDAO.findByAutId(1);
			
			
			Assert.assertNotNull(auteurs);
			
		} catch (DAOException e) {
			
			Assert.fail(e.getMessage());
			

		}
	}

}
