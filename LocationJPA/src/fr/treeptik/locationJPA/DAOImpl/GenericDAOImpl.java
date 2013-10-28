package fr.treeptik.locationJPA.DAOImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import fr.treeptik.locationJPA.DAO.GenericDAO;

public class GenericDAOImpl<T, PK> implements GenericDAO<T, PK> {

	
	private static EntityManager entityManager = Persistence.createEntityManagerFactory("location").createEntityManager();
	
	
	private Class<T> type;
	
	// il ne faut pas mettre de constructeur sans paramètre
	public GenericDAOImpl(Class<T> type) {
		
		this.type = type;
		
	}
	
	
	
	
	@Override
	public T save(T entite) {
		
		entityManager.persist(entite);

		return entite;
	}

	@Override
	public void remove(T entite) {
		
		entityManager.remove(entite);

	}

	@Override
	public T findById(PK id) {
	
		return entityManager.find(type, id);
	}

	@Override
	public List<T> findAll() {
		
		return entityManager.createQuery("SELECT o FROM " + type.getSimpleName() + " o ", type).getResultList();
	}

}
