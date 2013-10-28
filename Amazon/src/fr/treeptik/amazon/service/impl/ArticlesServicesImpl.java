package fr.treeptik.amazon.service.impl;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.treeptik.amazon.dao.ArticlesDAO;
import fr.treeptik.amazon.domain.Articles;
import fr.treeptik.amazon.exception.DAOException;
import fr.treeptik.amazon.exception.ServiceException;
import fr.treeptik.amazon.service.ArticlesService;
import fr.treeptik.amazon.util.ConnectionUtil;

@Service
public class ArticlesServicesImpl implements ArticlesService {

	@Autowired
	private ArticlesDAO articlesDAO;

	@Autowired
	private ConnectionUtil connectionUtil;

	@Override
	public Articles save(Articles articles) throws ServiceException {
		try {

			Connection connection = connectionUtil.getConnection();

			articlesDAO.save(articles);

			connection.commit();

		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException | DAOException e) {

			throw new ServiceException(e.getMessage(), e);

		}

		return articles;
	}

	@Override
	public void remove(Articles articles) throws ServiceException {
		try {
			Connection connection = connectionUtil.getConnection();

			articlesDAO.remove(articles);

			connection.commit();

		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException | DAOException e) {

			throw new ServiceException(e.getMessage(), e);

		}

	}

}
