package fr.treeptik.locationdao.dao;

import java.util.List;

import fr.treeptik.locationdao.domain.Contrat;

public interface ContratDAO {
	
	
	void save (Contrat contrat);
	void remove (Contrat contrat);
	Contrat findByNoContrat (Integer noContrat);
	List<Contrat> findAll();
	List<Contrat> findByDate();

}
