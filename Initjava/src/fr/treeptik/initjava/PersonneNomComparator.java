package fr.treeptik.initjava;

import java.util.Comparator;

public class PersonneNomComparator implements Comparator<Personne>{ // cette classe va avoir la responsabilité de comparer 2 personnes

																	// cette classe implemente une interface
	

	@Override
	public int compare(Personne personne1, Personne personne2) {
		// TODO Auto-generated method stub
		return personne1.getNom().compareToIgnoreCase(personne2.getNom()); // ce code ne sert qu'à faire des comparaisons entre les différents noms de la liste
	}

	
	 
	
	
}
