package fr.treeptik.amazon.service;

import fr.treeptik.amazon.domain.Auteurs;
import fr.treeptik.amazon.exception.ServiceException;

public interface AuteursService {
	
	Auteurs save (Auteurs auteurs) throws ServiceException;
	void remove (Auteurs auteurs) throws ServiceException;
	Auteurs findByAutId (Integer autId) throws ServiceException;

}
