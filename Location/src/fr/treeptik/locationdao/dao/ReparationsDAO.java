package fr.treeptik.locationdao.dao;

import java.util.List;

import fr.treeptik.locationdao.domain.Reparations;

public interface ReparationsDAO {
	
	void save (Reparations reparations);
	void remove (Reparations reparations);
	Reparations findByNumRep (Integer numRep);
	List<Reparations> findAll();


}
