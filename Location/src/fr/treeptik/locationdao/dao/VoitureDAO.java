package fr.treeptik.locationdao.dao;

import java.util.List;

import fr.treeptik.locationdao.domain.Voiture;
import fr.treeptik.locationdao.exception.DAOException;

public interface VoitureDAO {
	
	
	Voiture save (Voiture voiture) throws DAOException;
	void remove (Voiture voiture) throws DAOException;
	Voiture findByNoImmatriculation (String noImmatriculation) throws DAOException;
	List<Voiture> findAll() throws DAOException;

}
