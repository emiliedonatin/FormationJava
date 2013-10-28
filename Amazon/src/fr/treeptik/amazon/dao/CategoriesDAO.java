package fr.treeptik.amazon.dao;

import java.util.List;
import java.util.Map;

import fr.treeptik.amazon.domain.Categories;
import fr.treeptik.amazon.exception.DAOException;

public interface CategoriesDAO {
	
	Categories save (Categories categories) throws DAOException;
	void remove (Categories categories) throws DAOException;
	List<Categories> findByNoArticles() throws DAOException;
	List<Categories> findByMoreArticles() throws DAOException;
	Map<Categories, Long> findArtByCat() throws DAOException; 

}
