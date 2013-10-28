package fr.treeptik.amazon.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysql.jdbc.Statement;

import fr.treeptik.amazon.dao.CommentairesDAO;
import fr.treeptik.amazon.domain.Commentaires;
import fr.treeptik.amazon.exception.DAOException;
import fr.treeptik.amazon.util.ConnectionUtil;


@Repository
public class CommentairesJDBCImpl implements CommentairesDAO{
	
	@Autowired
	private ConnectionUtil connectionUtil;

	@Override
	public Commentaires save(Commentaires commentaires) throws DAOException {
		
		try {
			Connection connection = connectionUtil.getConnection();
			PreparedStatement prepareStatement = connection.prepareStatement
			("Insert into commentaires (art_id, com_nom, com_email, com_texte, com_date, com_validation) values (?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
			
			prepareStatement.setInt(1, commentaires.getArticles().getArtId());
			prepareStatement.setString(2, commentaires.getComNom());
			prepareStatement.setString(3, commentaires.getComEmail());
			prepareStatement.setString(4, commentaires.getComTexte());
			prepareStatement.setDate(5, new java.sql.Date(commentaires.getComDate().getTime()));
			prepareStatement.setBoolean(6, commentaires.getComValidation());
			
			prepareStatement.executeUpdate();
			
			ResultSet resultSet = prepareStatement.getGeneratedKeys();
			resultSet.next();
			
			commentaires.setComId(resultSet.getInt(1));
			
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			
			throw new DAOException(e.getMessage(), e);
		}
		
		return commentaires;
	}

	@Override
	public void remove(Commentaires commentaires) throws DAOException {
		
		try {
			Connection connection = connectionUtil.getConnection();
			PreparedStatement prepareStatement = connection.prepareStatement("Delete from commentaires where com_id=?");

			prepareStatement.setInt(1, commentaires.getComId());
			prepareStatement.executeUpdate();
		
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			
			throw new DAOException(e.getMessage(), e);
			

		}
		
	}

}
