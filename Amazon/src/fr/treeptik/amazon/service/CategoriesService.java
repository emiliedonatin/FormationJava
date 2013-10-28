package fr.treeptik.amazon.service;

import java.util.List;
import java.util.Map;

import fr.treeptik.amazon.domain.Categories;
import fr.treeptik.amazon.exception.ServiceException;

public interface CategoriesService {
	
	Categories save (Categories categories) throws ServiceException;
	void remove (Categories categories) throws ServiceException;
	List<Categories> findByNoArticles() throws ServiceException;
	List<Categories> findByMoreArticles() throws ServiceException;
	Map<Categories, Long> findArtByCat() throws ServiceException;
}
