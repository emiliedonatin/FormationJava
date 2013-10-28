package fr.treeptik.locationdao.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.treeptik.locationdao.dao.SupplementsDAO;
import fr.treeptik.locationdao.domain.Supplements;
import fr.treeptik.locationdao.exception.DAOException;
import fr.treeptik.locationdao.utils.ConnectionJDBC;

public class SupplementsJDBCImpl implements SupplementsDAO {

	@Override
	public Supplements save(Supplements supplements) throws DAOException {
		
		try {
			
			Connection connection = ConnectionJDBC.getConnection();
			
			PreparedStatement prepareStatement = connection.prepareStatement("Insert into supplements (libelle_supp, tarif_jour) values (?, ?)");
			
			prepareStatement.setString(1, supplements.getLibelleSupp());
			prepareStatement.setInt(2, supplements.getTarifJour());
			
			prepareStatement.executeUpdate();
	
		
		
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			
			throw new DAOException(e.getMessage(), e);

		}
		return supplements;
	}

	@Override
	public void remove(Supplements supplements) throws DAOException {
		
		try {
			
			Connection connection = ConnectionJDBC.getConnection();
			PreparedStatement prepareStatement = connection.prepareStatement("delete from supplements where codesupplement=?");
			
			prepareStatement.setInt(1, supplements.getCodeSupplement());
			
			prepareStatement.executeUpdate();
		
		
		
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			throw new DAOException(e.getMessage(), e);
			

		}
		
	}

	@Override
	public Supplements findByCodeSupplement(Integer codeSupplement) throws DAOException {
		Supplements supplements = null;
		try {
			Connection connection = ConnectionJDBC.getConnection();
			PreparedStatement prepareStatement = connection.prepareStatement("Select * from supplements where codesupplement=?");
			
			prepareStatement.setInt(1, codeSupplement);
			
			ResultSet resultSet = prepareStatement.executeQuery();
			resultSet.next();
			
			supplements = new Supplements(resultSet.getInt("codesupplement"), resultSet.getString("libelle_supp"), resultSet.getInt("tarif_jour"));
			
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			
			throw new DAOException(e.getMessage(), e);
			
		}
		
		
		
		
		
		
		return supplements;
		
	}

	@Override
	public List<Supplements> findAll() throws DAOException {
		
		ArrayList<Supplements> supplementslist = new ArrayList<>();

		try {
			Connection connection = ConnectionJDBC.getConnection();
			PreparedStatement prepareStatement = connection.prepareStatement("Select * from supplements");

			ResultSet resultSet = prepareStatement.executeQuery();

		

			while (resultSet.next()) {

				Supplements supplements = new Supplements(resultSet.getInt("codesupplement"), resultSet.getString("libelle_supp"), resultSet.getInt("tarif_jour"));
				supplementslist.add(supplements);

			}

		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {

			throw new DAOException(e.getMessage(), e);

		}

		return supplementslist;

	}

}
