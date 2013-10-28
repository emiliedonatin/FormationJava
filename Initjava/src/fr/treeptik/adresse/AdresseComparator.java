package fr.treeptik.adresse;

import java.util.Comparator;

public class AdresseComparator implements Comparator<Adresse> {

	@Override
	public int compare(Adresse adresse1, Adresse adresse2) {
		// TODO Auto-generated method stub
		return adresse1.getCodePostal().compareToIgnoreCase(adresse2.getCodePostal());
	}
	
	

}
