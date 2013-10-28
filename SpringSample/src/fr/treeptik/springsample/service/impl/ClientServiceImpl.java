package fr.treeptik.springsample.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.treeptik.springsample.dao.ClientDAO;
import fr.treeptik.springsample.exception.DAOException;
import fr.treeptik.springsample.exception.ServiceException;
import fr.treeptik.springsample.model.Client;
import fr.treeptik.springsample.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService {

	// l'annotation autowired remplace l'appel de la factory

	@Autowired
	private ClientDAO clientDAO;

	@Override
	public Client save(Client client) throws ServiceException {

		try {
			clientDAO.save(client);
		} catch (DAOException e) {
			throw new ServiceException(e.getMessage(), e);
		}
		return client;
	}

	@Override
	public void remove(Client client) throws ServiceException {
		try {
			clientDAO.remove(client);
		} catch (DAOException e) {
			throw new ServiceException(e.getMessage(), e);
		}

	}

	@Override
	public List<Client> findAll() throws ServiceException {
		List<Client> clients = null;

		try {
			clients = clientDAO.findAll();
		} catch (DAOException e) {
			throw new ServiceException(e.getMessage(), e);
		}
		return clients;
	}

}
