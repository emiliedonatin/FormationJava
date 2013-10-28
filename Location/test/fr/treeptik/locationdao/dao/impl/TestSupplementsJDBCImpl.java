package fr.treeptik.locationdao.dao.impl;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import fr.treeptik.locationdao.dao.DAOFactory;
import fr.treeptik.locationdao.dao.SupplementsDAO;
import fr.treeptik.locationdao.domain.Supplements;
import fr.treeptik.locationdao.exception.DAOException;

@RunWith (JUnit4.class)
public class TestSupplementsJDBCImpl {

//	@Test
//	public void TestSaveSupplementsOk(){
//		
//		SupplementsDAO supplementsDAO = DAOFactory.getSupplementsDAO();
//		
//		Supplements supplements = new Supplements(6, "libelle supp", 100);
//		
//		try {
//			
//			supplements = supplementsDAO.save(supplements);
//	
//			Assert.assertNotNull(supplements);
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
//	public void TestRemoveSupplementsOk(){
//		
//		SupplementsDAO supplementsDAO = DAOFactory.getSupplementsDAO();
//		
//		Supplements supplements = new Supplements();
//		supplements.setCodeSupplement(6);
//		
//		try {
//			supplementsDAO.remove(supplements);
//			
//			ConnectionJDBC.getConnection().commit();
//		
//		
//		} catch (DAOException | InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
//			
//			
//			
//			Assert.fail(e.getMessage());
//		}
//		
//		
//	}

//@Test
//public void TestFindSupplementsOk(){
//	
//	SupplementsDAO supplementsDAO = DAOFactory.getSupplementsDAO();
//	
//	Supplements supplements;
//	
//	try {
//		supplements = supplementsDAO.findByCodeSupplement(5);
//		Assert.assertNotNull(supplements);
//	
//	
//	} catch (DAOException e) {
//		
//		Assert.fail(e.getMessage());
//		
//	}
//	
//	
//}

@Test
public void TestFindSupplementsAllOk() {

	SupplementsDAO supplementsDAO = DAOFactory.getSupplementsDAO();
	try {
		List<Supplements> supplementslist = supplementsDAO.findAll();

		Assert.assertNotNull(supplementslist);
		Assert.assertTrue(supplementslist.size() > 0);

	} catch (DAOException e) {

		Assert.fail(e.getMessage());
	}

}



}

