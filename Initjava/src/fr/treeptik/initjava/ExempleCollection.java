package fr.treeptik.initjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ExempleCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		//
		// Les listes (il faut toujours typer une liste en précisant le type
		// contenu dans la liste)
		//

		ArrayList<String> list = new ArrayList<>(); // on crée une nouvelle liste en précisant qu'elle contient des string
															

		list.add("Bonjour"); // on ajoute des données dans la liste (dans notre exemple on ne peut ajouter que des string)
		list.add("tout");
		list.add("le monde");

		System.out.println("Taille : " + list.size()); // on affiche la taille de la liste
		 

		for (String string : list) {
			System.out.println(string); // on parcours le tableau et on affiche
										// les chaînes de caractères (le
										// raccourci "ctrl espace" nous permet
										// d'avoir un "for" adapté à nos
										// varaibles
		}

		String string = list.get(1); // on récupère la valeur qui est au niveau
										// de la liste 1 (on commence à 0 comme
										// les tableaux)
		
		System.out.println(string); // on affiche cette valeur

		
		
		System.out.println(list.contains("Bonjour")); // est ce que notre liste contient "Bonjour"? --> vrai ou faux (ici c'est vrai)
		
		
		String[] tabString = new String[list.size()]; // on crée un tableau vide qui a la même taille que notre liste
													  // on peut aussi donner une taille de "1" et la méthode s'adaptera automatiquement si la liste est plus grande
		
		list.toArray(tabString); // on transfère la list dans le nouveau tableau qui a la bonne taille
		
		System.out.println(tabString[1]); // on affiche la cellule 1 de notre nouveau tableau qui est "tout"
		
		List<String> maSuperList = Arrays.asList("Mot1", "mot2", "mot3");  // pour générer une liste (on peut faire ctrl 1 pour avoir toutes les possibilités de la méthode)
		
		list.remove(0); // on va supprimer l'élément de la liste qui se trouve à l'index 0
		
		list.ensureCapacity(100); // permet d'augmenter la capacité de la liste de 100 éléments de plus (par exemple)
		
		list.trimToSize(); // permet de réduire la taille de la liste en supprimant les éléments vides
		
		for (String string2 : maSuperList) { // pour parcourir les listes (possible uniquement si la liste est typée)
			System.out.println(string2);
			
		}
		
		Iterator<String> iterator = list.iterator(); // les iterators servent à parcours les listes mais on préfère utiliser le "for each"
		for (int i = 0; i < list.size()-2; i+=2) { // ici on parcours la liste en incrémentant de 2 à chaque boucle
			
			System.out.println(iterator.next());
			
		}
		
	//
	// Les linked list
	//
		
		LinkedList<String> linkedList = new LinkedList<>(); // on manipule les linkedlist de la même manière que les arraylist
		linkedList.add("DD");
		linkedList.add("AA");
		linkedList.add("CC");
		linkedList.add("EE");
		linkedList.add("RR");
		
		// linkedList.descendingIterator(); pour parcourir la liste en partant de la fin (il faut faire un for juste après)
		
		Collections.sort(linkedList); // permet d'ordonner une liste. 
		
		Collections.reverse(linkedList); // on peut également trier en ordre inverse
		
		
		for (String string2 : linkedList) {
			System.out.println(linkedList);
		}
		
		
		
	
	//
	// Les sets (c'est comme une liste avec un type d'élément à l'intérieur mais il ne peut pas y avoir de doublons dans les entrées)
	//
	
	
		HashSet<String> hashSet = new HashSet<>(); // c'est le type de set le plus utilisé (c'est l'équivalent des arraylist)
		hashSet.add("chaine 1");
		hashSet.add("chaine 2");
		hashSet.add("chaine 3");
		hashSet.add("chaine 1");
		
		System.out.println(hashSet.size()); // on veut connaître la taille du set. ici ça sera 3 puisque le hashset va gérer automatiquement les doublons
		
		hashSet.addAll(list); // permet de transformer notre arraylist en hashset et ainsi supprimer tous les doublons
		
		//
		
		TreeSet<String> treeSet = new TreeSet<>();
		
		treeSet.add("b");
		treeSet.add("c");
		treeSet.add("z");
		treeSet.add("a");
		treeSet.add("t");
		treeSet.add("r");
		
		for (String string3 : treeSet) {
			System.out.println(string3); // il va afficher le treeset en rangeant automatiquement les string par ordre alphabétique
			
		}
		
		
	//
	// Les MAP (c'est une famille d'objet)
	//
		
		
		HashMap<Character,Integer> map1 = new HashMap<Character, Integer>(); // il faut toujours typer une MAP
																			// ici on créé une nouvelle Map avec des Keys qui seront des character et les Values des Integer
		
		
		map1.put('A', 0);
		map1.put('B', 0);
		map1.put('C', 0);
		map1.put('D', 0);
	
	
	
		String saisie = "AABBBBCCCCCDD";
		
		for (int i = 0; i < saisie.length(); i++) {
			char c = saisie.charAt(i);
			int nbC = map1.get(c);
			
			map1.put(c, nbC+1);
			
			
		}
	       System.out.println("Nb A : " + map1.get('A'));
	       System.out.println("Nb B : " + map1.get('B'));
	       System.out.println("Nb C : " + map1.get('C'));
	       System.out.println("Nb D : " + map1.get('D'));
	
	
	
	// pour parcourir une MAP on parcours le KeySet de la MAP qui est une liste dont les entrées sont uniques
	       
	       
	       Set<Character> keySet = map1.keySet();
	       for (Character character : keySet) {
	    	   System.out.println("Nb de " + character + " : " + map1.get(character));
			
		}
	
	// pour trier des MAP (le tri se fait par défaut par ordre alphanumérique)
	       
	       TreeMap<String, Integer> treeMap = new TreeMap<>();	
	       
	       treeMap.put("D", 12);
	       treeMap.put("A", 1);
	       treeMap.put("C", 17);
	       treeMap.put("E", 2);
	       treeMap.put("a", 3);
	       
	       
	       
	       Set<String> keySet2 = treeMap.keySet();
	       for (String string2 : keySet2){
	    	   System.out.println("Key : " + string2);
			
		}
	       
	
	
	}

}
