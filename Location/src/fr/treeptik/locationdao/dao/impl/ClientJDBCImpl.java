package fr.treeptik.locationdao.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.treeptik.locationdao.dao.ClientDAO;
import fr.treeptik.locationdao.domain.Client;
import fr.treeptik.locationdao.exception.DAOException;
import fr.treeptik.locationdao.utils.ConnectionJDBC;

public class ClientJDBCImpl implements ClientDAO {

	@Override
	public Client save(Client client) {
		return client;
		
	}

	@Override
	public void remove(Client client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Client findByCodeCl(Integer codeCl) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Client> findbynom() throws DAOException {
		
		ArrayList<Client> clients = new ArrayList<>();
		
		try {
			Connection connection = ConnectionJDBC.getConnection();
			PreparedStatement prepareStatement = connection.prepareStatement("Select * from client order by nomcl");
			
			ResultSet resultSet = prepareStatement.executeQuery();
			resultSet.next();
			
			while (resultSet.next()){
				Client client = new Client(resultSet.getInt("codecl"), resultSet.getString("nomcl"), resultSet.getString("adresse"), resultSet.getString("ville"));
				clients.add(client);
				
			}
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			throw new DAOException(e.getMessage(), e);
		}
		return clients;
	}

}
