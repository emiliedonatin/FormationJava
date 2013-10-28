package fr.treeptik.amazon.service.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.treeptik.amazon.dao.CategoriesDAO;
import fr.treeptik.amazon.domain.Categories;
import fr.treeptik.amazon.exception.DAOException;
import fr.treeptik.amazon.exception.ServiceException;
import fr.treeptik.amazon.service.CategoriesService;
import fr.treeptik.amazon.util.ConnectionUtil;

@Service
public class CategoriesServiceImpl implements CategoriesService{

	@Autowired
	private CategoriesDAO categoriesDAO;
	
	@Autowired
	private ConnectionUtil connectionUtil;

	@Override
	public Categories save(Categories categories) throws ServiceException {
		
		try {
			Connection connection = connectionUtil.getConnection();
			
			categoriesDAO.save(categories);
			
			connection.commit();
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException | DAOException e) {
			
			throw new ServiceException(e.getMessage(), e);
			
		}
		
		
		return categories;
		
		
	}

	@Override
	public void remove(Categories categories) throws ServiceException {
	
		try {
			Connection connection = connectionUtil.getConnection();
			
			categoriesDAO.remove(categories);
			connection.commit();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException | DAOException e) {
			throw new ServiceException(e.getMessage(), e);
		}
		
	}

	@Override
	public List<Categories> findByNoArticles() throws ServiceException {
		
		List<Categories> list= new ArrayList<>();
		try {
			Connection connection = connectionUtil.getConnection();
			
			categoriesDAO.findByNoArticles();
		
			connection.commit();
		
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException | DAOException e) {
			
			throw new ServiceException(e.getMessage(), e);
			
		}
		return list;
	}

	@Override
	public List<Categories> findByMoreArticles() throws ServiceException {
		
		List<Categories> list = new ArrayList<>();
		
		try {
			Connection connection = connectionUtil.getConnection();
			
			categoriesDAO.findByMoreArticles();
			
			connection.commit();
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException | DAOException e) {
			
			throw new ServiceException(e.getMessage(), e);
			
		}
		
		return list;
	}

	@Override
	public Map<Categories, Long> findArtByCat() throws ServiceException {
		
		HashMap<Categories, Long> map = new HashMap<Categories, Long>();
		
		try {
			Connection connection = connectionUtil.getConnection();
			
			categoriesDAO.findArtByCat();
			
			connection.commit();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException | DAOException e) {
			
			throw new ServiceException(e.getMessage(), e);
		}
		
		return map;
	}

}