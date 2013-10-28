package fr.treeptik.amazon.dao;

import fr.treeptik.amazon.domain.Commentaires;
import fr.treeptik.amazon.exception.DAOException;

public interface CommentairesDAO {
	
	Commentaires save (Commentaires commentaires) throws DAOException;
	void remove (Commentaires commentaires) throws DAOException;
	

}
