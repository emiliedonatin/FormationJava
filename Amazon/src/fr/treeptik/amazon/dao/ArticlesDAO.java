package fr.treeptik.amazon.dao;

import fr.treeptik.amazon.domain.Articles;
import fr.treeptik.amazon.exception.DAOException;

public interface ArticlesDAO {
	
	Articles save (Articles articles) throws DAOException;
	void remove (Articles articles) throws DAOException;
	

}
