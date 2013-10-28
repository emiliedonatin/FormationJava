package fr.treeptik.adresse;

import java.util.Comparator;

public class PersonneComparator implements Comparator<Personne>{

	@Override
	public int compare(Personne personne1, Personne personne2) {
		// TODO Auto-generated method stub
		return personne1.getNom().compareToIgnoreCase(personne2.getNom());
	}

	
	
	

}
