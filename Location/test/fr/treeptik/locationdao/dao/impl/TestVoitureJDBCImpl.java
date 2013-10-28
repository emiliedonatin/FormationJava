package fr.treeptik.locationdao.dao.impl;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import fr.treeptik.locationdao.dao.DAOFactory;
import fr.treeptik.locationdao.dao.VoitureDAO;
import fr.treeptik.locationdao.domain.TypeVoiture;
import fr.treeptik.locationdao.domain.Voiture;
import fr.treeptik.locationdao.exception.DAOException;

@RunWith(JUnit4.class)
public class TestVoitureJDBCImpl {

//	@Test
//	public void TestSaveVoitureOk() {
//
//		VoitureDAO voitureDAO = DAOFactory.getVoitureDAO();
//
//		TypeVoiture typeVoiture = new TypeVoiture("VL", null, null, null);
//
//		Voiture voiture = new Voiture("Aq-123-CD", "Marque1", "Modele1", "Rouge", 500, true, typeVoiture);
//
//		try {
//			voitureDAO.save(voiture);
//
//			Assert.assertNotNull(voiture);
//
//			ConnectionJDBC.getConnection().commit();
//
//		} catch (DAOException | InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
//
//			Assert.fail(e.getMessage());
//
//		}
//
//	}

//	@Test
//	public void TestRemoveVoitureOk() {
//
//		try {
//			VoitureDAO voitureDAO = DAOFactory.getVoitureDAO();
//
//			TypeVoiture typeVoiture = new TypeVoiture("VSP", null, null, null);
//
//			Voiture voiture = new Voiture("AF-123-CD", "Marque1", "Modele1", "Rouge", 500, true, typeVoiture);
//
//			voitureDAO.remove(voiture);
//
//			ConnectionJDBC.getConnection().commit();
//
//		} catch (DAOException | InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
//
//			Assert.fail(e.getMessage());
//
//		}
//
//	}

	
	@Test
	public void TestFindVoitureOk(){
		
		VoitureDAO voitureDAO = DAOFactory.getVoitureDAO();
		
		try {
		
			TypeVoiture typeVoiture = new TypeVoiture("VL", null, null, null);
			Voiture voiture = voitureDAO.findByNoImmatriculation("Aq-123-CD");
		
			voiture.setTypeVoiture(typeVoiture);

			
			Assert.assertNotNull("aq-123-CD",voiture.getNoImmatriculation());
			
			
		} catch (DAOException e) {
			
			Assert.fail(e.getMessage());
			
		}
		
		
	}
}
