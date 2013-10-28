package fr.treeptik.locationdao.dao;

import java.util.List;

import fr.treeptik.locationdao.domain.Supplements;
import fr.treeptik.locationdao.exception.DAOException;

public interface SupplementsDAO {
	
	
	Supplements save (Supplements supplements) throws DAOException;
	void remove (Supplements supplements) throws DAOException;
	Supplements findByCodeSupplement (Integer codeSupplement) throws DAOException;
	List<Supplements> findAll() throws DAOException;

}
