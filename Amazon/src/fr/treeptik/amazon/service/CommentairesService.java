package fr.treeptik.amazon.service;

import fr.treeptik.amazon.domain.Commentaires;
import fr.treeptik.amazon.exception.ServiceException;

public interface CommentairesService {
	
	Commentaires save (Commentaires commentaires) throws ServiceException;
	void remove (Commentaires commentaires) throws ServiceException;

}
