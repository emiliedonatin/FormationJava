package fr.treeptik.gestionprojet.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.treeptik.gestionprojet.dao.GenericDAO;


public class GenericDAOImpl <T, PK> implements GenericDAO<T, PK> {
	
	@PersistenceContext
	protected EntityManager entityManager;
	

	private Class<T> type;
	
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
