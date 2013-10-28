package fr.treeptik.locationdao.dao;

import java.util.List;

import fr.treeptik.locationdao.domain.TypeVoiture;
import fr.treeptik.locationdao.exception.DAOException;

public interface TypeVoitureDAO {
	
	TypeVoiture save (TypeVoiture typeVoiture) throws DAOException;
	void remove (TypeVoiture typeVoiture) throws DAOException;
	TypeVoiture findByCodeType(String codeType) throws DAOException;
	List<TypeVoiture> findAll() throws DAOException;

}
