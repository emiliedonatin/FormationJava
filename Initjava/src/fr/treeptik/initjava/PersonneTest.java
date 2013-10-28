package fr.treeptik.initjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

public class PersonneTest {
	
	public static void main(String[] args){
		

	Personne james = new Personne();
	james.setNom("Gosling");
	james.setPrenom("James");
	james.setDateNaissance(new Date());
	
	Personne linus = new Personne("Torval", "Linus", new Date());
	Personne gavin = new Personne("King", "Gavin", new Date());
	
	System.out.println(james.getNom());
	System.out.println(james.getPrenom());
	
	System.out.println(linus);
	
	
	//
	// Liste de personne
	//
	
	
	ArrayList<Personne> personnes = new ArrayList<>();
	
	personnes.add(james);
	personnes.add(linus);
	personnes.add(gavin);
	
	
	Collections.sort(personnes, new PersonneNomComparator()); // c'est à ce moment là qu'on trie la liste grâce aux données du personneNomComparator
														      // on peut aussi trier en ordre inversé en utilisant (personnes, Collections.reverseOrder(new...)		 
	for (Personne personne : personnes){
		System.out.println(personne);
	}
	
	Personne linus2 = new Personne("Torval", "Linus", new Date());
	
	System.out.println("+- Equals : " + linus.equals(linus2));
	System.out.println("+- Contains : " + personnes.contains(linus2));
	
	
	//
	// Les Map de personne
	//
	
	HashMap<Personne, Integer> mapPersonne = new HashMap<>();
	
	mapPersonne.put(linus, 1);
	mapPersonne.put(gavin, 1);
	mapPersonne.put(james, 1);
	
	mapPersonne.put(linus2, 2);   
	mapPersonne.put(gavin, 2);
	mapPersonne.put(james, 2);  
	
	
	Set<Personne> keySet = mapPersonne.keySet();
	System.out.println("Taille map :" + keySet.size()); // normalement à ce moment là on ne devrait avoir que 3 personnes dans notre map
	
	System.out.println("containsKey : " + mapPersonne.containsKey(linus2)); // on ne parvient pas à verifier l'égalité du contenu de la map car la map n'utilise pas la méthode equals mais la méthode hashCode
	
	}
	

}
