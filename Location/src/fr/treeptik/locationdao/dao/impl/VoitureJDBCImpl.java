package fr.treeptik.locationdao.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.treeptik.locationdao.dao.VoitureDAO;
import fr.treeptik.locationdao.domain.TypeVoiture;
import fr.treeptik.locationdao.domain.Voiture;
import fr.treeptik.locationdao.exception.DAOException;
import fr.treeptik.locationdao.utils.ConnectionJDBC;

public class VoitureJDBCImpl implements VoitureDAO {

	@Override
	public Voiture save(Voiture voiture) throws DAOException {
		
		try {
			Connection connection = ConnectionJDBC.getConnection();
			PreparedStatement prepareStatement = connection.prepareStatement
					("Insert into voiture (noimmatriculation, marque, modele, couleur, cumul_reparation, disponible, code_type) values (?, ?, ?, ?, ?, ?, ?)");
		
			prepareStatement.setString(1, voiture.getNoImmatriculation());
			prepareStatement.setString(2, voiture.getMarque());
			prepareStatement.setString(3, voiture.getModele());
			prepareStatement.setString(4, voiture.getCouleur());
			prepareStatement.setInt(5, voiture.getCumulReparation());
			prepareStatement.setBoolean(6, voiture.getDisponible());
			prepareStatement.setString(7, voiture.getTypeVoiture().getCodeType());
			
			prepareStatement.executeUpdate();
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			
			throw new DAOException(e.getMessage(), e);
		
		}
		
		return voiture;
		
	}

	@Override
	public void remove(Voiture voiture) throws DAOException {
		

		try {
			Connection connection = ConnectionJDBC.getConnection();
			PreparedStatement prepareStatement = connection.prepareStatement("Delete from voiture where noimmatriculation=?");
			
			prepareStatement.setString(1, voiture.getNoImmatriculation());
			
			prepareStatement.executeUpdate();
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			
			throw new DAOException(e.getMessage(), e);

		}
		
		
	}

	@Override
	public Voiture findByNoImmatriculation(String noImmatriculation) throws DAOException {
		
		
		try {
			Connection connection = ConnectionJDBC.getConnection();
			PreparedStatement prepareStatement = connection.prepareStatement("Select * from voiture where noimmatriculation=?");
			
			prepareStatement.setString(1, noImmatriculation);
			
			ResultSet resultSet = prepareStatement.executeQuery();
			resultSet.next();
			
			TypeVoiture typeVoiture = new TypeVoiture(resultSet.getString("code_type"), resultSet.getString("description_type"), resultSet.getInt("places"), resultSet.getInt("prix_jour"));
			Voiture Voiture = new Voiture(resultSet.getString("noimmatriculation"), resultSet.getString("marque"), resultSet.getString("modele"), resultSet.getString("couleur"), resultSet.getInt("cumul_reparation"), resultSet.getBoolean("disponible"), typeVoiture);
	
			Voiture.setTypeVoiture(typeVoiture);
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			
			throw new DAOException(e.getMessage(), e);
		}
		
		return null;
	}
	

	@Override
	public List<Voiture> findAll() throws DAOException {
		
		ArrayList<Voiture> voitures = new ArrayList<>();
		
		try {
			Connection connection = ConnectionJDBC.getConnection();
			
			PreparedStatement prepareStatement = connection.prepareStatement("Select * from voiture");
		
		
			ResultSet resultSet = prepareStatement.executeQuery();
			resultSet.next();
			
			while (resultSet.next()){
				
				TypeVoiture typeVoiture = new TypeVoiture(resultSet.getString("code_type"), resultSet.getString("description_type"), resultSet.getInt("places"), resultSet.getInt("prix_jour"));
				Voiture voiture = new Voiture(resultSet.getString("noimmatriculation"), resultSet.getString("marque"), resultSet.getString("modele"), resultSet.getString("couleur"), resultSet.getInt("cumul_reparation"), resultSet.getBoolean("disponible"), typeVoiture);
				
				voitures.add(voiture);
			}
		
		
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			throw new DAOException(e.getMessage(), e);
		}
		
		
		
		
		return null;
	}


}
