package fr.treeptik.adresse;

import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import java.util.TreeMap;

public class AdresseTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Personne linus = new Personne("Torval", "Linus", new Date());
		Personne gavin = new Personne("King", "Gavin", new Date());
		Personne james = new Personne("Gosling", "James", new Date());
		
		Adresse linusAdresse = new Adresse("7 rue du Maréchal Foch", "23125", "Grenoble");
		Adresse linusAdresse2 = new Adresse("8 rue du Maréchal Foch", "23125", "Grenoble");
		Adresse gavinAdresse = new Adresse("9 rue des Généraux Mangin", "54300", "Xermamenil");
		Adresse gavinAdresse2 = new Adresse("10 rue des Généraux Mangin", "54300", "Xermamenil");
		Adresse jamesAdresse = new Adresse("775 chemin du moulin du fort", "13120", "Gardanne");
		Adresse jamesAdresse2 = new Adresse("776 chemin du moulin du fort", "13120", "Gardanne");
		
		
		ArrayList<Adresse> listeAdresseLinus = new ArrayList<>();
		listeAdresseLinus.add(linusAdresse);
		listeAdresseLinus.add(linusAdresse2);
		
		ArrayList<Adresse> listeAdresseGavin = new ArrayList<>();
		listeAdresseGavin.add(gavinAdresse);
		listeAdresseGavin.add(gavinAdresse2);
		
		ArrayList<Adresse> listeAdresseJames = new ArrayList<>();
		listeAdresseJames.add(jamesAdresse);
		listeAdresseJames.add(jamesAdresse2);
		
		TreeMap<Personne, ArrayList<Adresse>> annuaire = new TreeMap<>(new PersonneComparator()); // on ajoute le PersonneComparator pour préciser à la TreeMap la façon dont elle doit trier les données
		
		annuaire.put(linus, listeAdresseLinus);
		annuaire.put(gavin, listeAdresseGavin);
		annuaire.put(james, listeAdresseJames);
		
		
		Set<Personne> keyset = annuaire.keySet();
		for (Personne personne: keyset){
			System.out.println(personne + " " + annuaire.get(personne));
		}
		
	}

}
