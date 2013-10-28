package fr.treeptik.amazon.service.impl;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.treeptik.amazon.dao.CommentairesDAO;
import fr.treeptik.amazon.domain.Commentaires;
import fr.treeptik.amazon.exception.DAOException;
import fr.treeptik.amazon.exception.ServiceException;
import fr.treeptik.amazon.service.CommentairesService;
import fr.treeptik.amazon.util.ConnectionUtil;


@Service
public class CommentairesServiceImpl implements CommentairesService {
	
	@Autowired
	private CommentairesDAO commentairesDAO;
	
	@Autowired
	private ConnectionUtil connectionUtil;

	@Override
	public Commentaires save(Commentaires commentaires) throws ServiceException {
		
		try {
			Connection connection = connectionUtil.getConnection();
			
			commentairesDAO.save(commentaires);
			
			connection.commit();
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException | DAOException e) {
		
			throw new ServiceException(e.getMessage(), e);
			
		}

		return commentaires;
	}

	@Override
	public void remove(Commentaires commentaires) throws ServiceException {
		
		try {
			Connection connection = connectionUtil.getConnection();
			commentairesDAO.remove(commentaires);
			
			connection.commit();
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException | DAOException e) {
			
		
			throw new ServiceException(e.getMessage(), e);
		
		}
		
		
	}

}
