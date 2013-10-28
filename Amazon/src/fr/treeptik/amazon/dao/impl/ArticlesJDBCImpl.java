package fr.treeptik.amazon.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysql.jdbc.Statement;

import fr.treeptik.amazon.dao.ArticlesDAO;
import fr.treeptik.amazon.domain.Articles;
import fr.treeptik.amazon.exception.DAOException;
import fr.treeptik.amazon.util.ConnectionUtil;

@Repository
public class ArticlesJDBCImpl implements ArticlesDAO {

	@Autowired
	private ConnectionUtil connectionUtil;

	@Override
	public Articles save(Articles articles) throws DAOException {

		try {
			Connection connection = connectionUtil.getConnection();
			PreparedStatement prepareStatement = connection.prepareStatement
			("Insert into articles (cat_id, art_titre, art_chapeau, art_contenu, art_date, aut_id, art_en_ligne) values (?, ?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);

			prepareStatement.setInt(1, articles.getCategories().getCatId());
			prepareStatement.setString(2, articles.getArtTitre());
			prepareStatement.setString(3, articles.getArtChapeau());
			prepareStatement.setString(4, articles.getArtContenu());
			prepareStatement.setDate(5, new Date(articles.getArtDate().getTime()));
			prepareStatement.setInt(6, articles.getAuteurs().getAutId());
			prepareStatement.setBoolean(7, articles.getArtEnLigne());

			prepareStatement.executeUpdate();

			ResultSet resultSet = prepareStatement.getGeneratedKeys();
			resultSet.next();

			articles.setArtId(resultSet.getInt(1));
			
			

		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {

			throw new DAOException(e.getMessage(), e);

		}

		return articles;
	}

	@Override
	public void remove(Articles articles) throws DAOException {
		
		try {
			Connection connection = connectionUtil.getConnection();
		
			PreparedStatement prepareStatement = connection.prepareStatement("Delete from articles where art_id=?");
			
			prepareStatement.setInt(1, articles.getArtId());
			
			prepareStatement.executeUpdate();
			
			
		
		
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			
			throw new DAOException(e.getMessage(), e);
			
		}

	}

}
