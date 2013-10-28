package fr.treeptik.gestionprojet.dao;

import java.util.List;

public interface GenericDAO <T, PK>{
	
	T save (T entite);
	void remove (T entite);
	T findById (PK id);
	List<T> findAll();

}
