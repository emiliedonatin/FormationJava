package fr.treeptik.amazon.service;

import fr.treeptik.amazon.domain.Articles;
import fr.treeptik.amazon.exception.ServiceException;

public interface ArticlesService {
	
	Articles save (Articles articles) throws ServiceException;
	void remove (Articles articles) throws ServiceException;
	
	// on doit mettre ici des requêtes complexes qui peuvent appeler plusieurs DAO différents 
	// on peut par exemple demander d'enregistrer un articles et d'envoyer un mail d'avertissement en même temps
	// on ira ensuite implementer ces requêtes dans la class ArticlesServiceImpl

}
