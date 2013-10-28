package fr.treeptik.amazon.dao;

import fr.treeptik.amazon.domain.Auteurs;
import fr.treeptik.amazon.exception.DAOException;

public interface AuteursDAO {
	
	Auteurs save (Auteurs auteurs) throws DAOException;
	void remove (Auteurs auteurs) throws DAOException;
	Auteurs findByAutId (Integer autId) throws DAOException;
	
}
