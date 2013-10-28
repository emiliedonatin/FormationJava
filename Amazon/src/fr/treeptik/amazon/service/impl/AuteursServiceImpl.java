package fr.treeptik.amazon.service.impl;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.treeptik.amazon.dao.AuteursDAO;
import fr.treeptik.amazon.domain.Auteurs;
import fr.treeptik.amazon.exception.DAOException;
import fr.treeptik.amazon.exception.ServiceException;
import fr.treeptik.amazon.service.AuteursService;
import fr.treeptik.amazon.util.ConnectionUtil;


@Service
public class AuteursServiceImpl implements AuteursService {
	
	@Autowired
	private AuteursDAO auteursDAO;
	
	@Autowired
	private ConnectionUtil connectionUtil;
	

	@Override
	public Auteurs save(Auteurs auteurs) throws ServiceException {
		
		try {
			Connection connection = connectionUtil.getConnection();
			
			auteursDAO.save(auteurs);
			
			connection.commit();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException | DAOException e) {
			
			throw new ServiceException(e.getMessage(), e);
		}
		
		return auteurs;
	}

	@Override
	public void remove(Auteurs auteurs) throws ServiceException {
		
		try {
			Connection connection = connectionUtil.getConnection();
			auteursDAO.remove(auteurs);
			
			connection.commit();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException | DAOException e) {
		
			throw new ServiceException(e.getMessage(), e);
		}
	}

	@Override
	public Auteurs findByAutId(Integer autId) throws ServiceException {
		
		Auteurs auteurs = null;
		
		try {
			Connection connection = connectionUtil.getConnection();
			auteursDAO.findByAutId(autId);
			
			connection.commit();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException | DAOException e) {
			
			throw new ServiceException(e.getMessage(), e);
		}
		
		return auteurs;
	}

}
