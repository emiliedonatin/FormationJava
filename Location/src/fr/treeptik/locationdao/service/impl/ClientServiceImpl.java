package fr.treeptik.locationdao.service.impl;

import java.sql.SQLException;

import fr.treeptik.locationdao.dao.ClientDAO;
import fr.treeptik.locationdao.dao.DAOFactory;
import fr.treeptik.locationdao.domain.Client;
import fr.treeptik.locationdao.exception.DAOException;
import fr.treeptik.locationdao.exception.ServiceException;
import fr.treeptik.locationdao.service.ClientService;
import fr.treeptik.locationdao.utils.ConnectionJDBC;

public class ClientServiceImpl implements ClientService {

	private ClientDAO clientDAO = DAOFactory.getClientDAO();

	@Override
	public Client save(Client client) throws ServiceException {

		
			try {
				client = clientDAO.save(client);
				ConnectionJDBC.getConnection().commit();
			} catch (DAOException | InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
				throw new ServiceException(e.getMessage(), e);
			}
			return client;
			
			
	
	}
}
