package fr.treeptik.amazon.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysql.jdbc.Statement;

import fr.treeptik.amazon.dao.AuteursDAO;
import fr.treeptik.amazon.domain.Auteurs;
import fr.treeptik.amazon.exception.DAOException;
import fr.treeptik.amazon.util.ConnectionUtil;

@Repository
public class AuteursJDBCImpl implements AuteursDAO {
	
	@Autowired
	private ConnectionUtil connectionUtil;

	@Override
	public Auteurs save(Auteurs auteurs) throws DAOException {
		
		try {
			Connection connection = connectionUtil.getConnection();
			PreparedStatement prepareStatement = connection.prepareStatement
			("Insert into auteurs (aut_nom, aut_prenom, aut_url, aut_email)values (?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
			
			prepareStatement.setString(1, auteurs.getAutNom());
			prepareStatement.setString(2, auteurs.getAutPrenom());
			prepareStatement.setString(3, auteurs.getUrl());
			prepareStatement.setString(4, auteurs.getAutEmail());
			
			prepareStatement.executeUpdate();
			
			ResultSet resultSet = prepareStatement.getGeneratedKeys();
			resultSet.next();
			
			auteurs.setAutId(resultSet.getInt(1));
			
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			
			throw new DAOException(e.getMessage(), e);
		}
		
		return auteurs;
	}

	@Override
	public void remove(Auteurs auteurs) throws DAOException {
		
		try {
			Connection connection = connectionUtil.getConnection();
			PreparedStatement prepareStatement = connection.prepareStatement("Delete from auteurs where aut_id=?");
			
			prepareStatement.setInt(1, auteurs.getAutId());
			
			prepareStatement.executeUpdate();
			
			
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			
			throw new DAOException(e.getMessage(), e);
			
		}
		
	}

	@Override
	public Auteurs findByAutId(Integer autId) throws DAOException {
		
		Auteurs auteurs = null;
		
		try {
			Connection connection = connectionUtil.getConnection();
			PreparedStatement prepareStatement = connection.prepareStatement("Select * from auteurs where aut_id=?");
			
			prepareStatement.setInt(1, autId);
			
			ResultSet resultSet = prepareStatement.executeQuery();
			resultSet.next();
			
			auteurs = new Auteurs(resultSet.getInt("aut_id"), resultSet.getString("aut_nom"), resultSet.getString("aut_prenom"), resultSet.getString("aut_url"), resultSet.getString("aut_email"));
			
			
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			
			throw new DAOException(e.getMessage(), e);
		}
		
		return auteurs;
	}

}
