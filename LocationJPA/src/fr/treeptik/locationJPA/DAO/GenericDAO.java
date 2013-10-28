package fr.treeptik.locationJPA.DAO;

import java.util.List;

public interface GenericDAO <T, PK>{
	
	
	T save (T entite);
	void remove (T entite);
	T findById(PK id);
	List<T> findAll();

}
