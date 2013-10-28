package fr.treeptik.locationdao.service;

import fr.treeptik.locationdao.domain.Client;
import fr.treeptik.locationdao.exception.ServiceException;

public interface ClientService {
	
	Client save(Client client) throws ServiceException;
	

}
