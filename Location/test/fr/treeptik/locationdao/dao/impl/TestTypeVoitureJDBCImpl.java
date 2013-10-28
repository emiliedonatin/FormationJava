package fr.treeptik.locationdao.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import fr.treeptik.locationdao.dao.DAOFactory;
import fr.treeptik.locationdao.dao.TypeVoitureDAO;
import fr.treeptik.locationdao.domain.TypeVoiture;
import fr.treeptik.locationdao.exception.DAOException;
import fr.treeptik.locationdao.utils.ConnectionJDBC;

@RunWith(JUnit4.class)
public class TestTypeVoitureJDBCImpl {

	@Test
	public void TestSaveTypeVoitureOk() {

		TypeVoitureDAO typeVoitureDAO = DAOFactory.getTypeVoitureDAO();

		TypeVoiture typeVoiture = new TypeVoiture("VZ", "Voiture de Luxe", 5, 195);

		try {
			typeVoiture = typeVoitureDAO.save(typeVoiture);

			Assert.assertNotNull(typeVoiture);

			ConnectionJDBC.getConnection().commit();

		} catch (DAOException | InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {

			Assert.fail(e.getMessage());

		}
	}

	@Test
	public void TestRemoveTypeVoitureOk() {

		try {
			TypeVoitureDAO typeVoitureDAO = DAOFactory.getTypeVoitureDAO();

			TypeVoiture typeVoiture = new TypeVoiture();
			typeVoiture.setCodeType("VZ");

			typeVoitureDAO.remove(typeVoiture);

			ConnectionJDBC.getConnection().commit();

		} catch (DAOException | InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {

			Assert.fail(e.getMessage());
		}

	}

	@Test
	public void TestFindTypeVoitureOk() {

		try {
			TypeVoitureDAO typeVoitureDAO = DAOFactory.getTypeVoitureDAO();
			TypeVoiture typeVoiture = typeVoitureDAO.findByCodeType("VSP");

			Assert.assertNotNull(typeVoiture);
			Assert.assertEquals("VSP", typeVoiture.getCodeType());

		} catch (DAOException e) {

			Assert.fail(e.getMessage());

		}

	}

	@Test
	public void TestFindTypeVoitureAllOk() {

		TypeVoitureDAO typeVoitureDAO = DAOFactory.getTypeVoitureDAO();
		try {
			List<TypeVoiture> typeVoitures = typeVoitureDAO.findAll();

			Assert.assertNotNull(typeVoitures);
			Assert.assertTrue(typeVoitures.size() > 0);

		} catch (DAOException e) {

			Assert.fail(e.getMessage());
		}

	}
}
