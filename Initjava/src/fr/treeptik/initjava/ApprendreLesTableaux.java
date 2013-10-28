package fr.treeptik.initjava;

public class ApprendreLesTableaux {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

				//
				// Création d'un tableau
				//
		
		Integer[] tableau = new Integer [5];
		
				// Integer[] = on fabrique un tableau de Integer car les crochets signifient tableau
				// tableau = le nom qu'on donne au tableau
				// new = pour dire qu'on fabrique un nouveau tableau
				// Integer [5] = signifie que le tableau à 5 entrées (puisqu'on commence à 0) contenant des Integer
				// !!!! pour le moment le tableau est vide
				
		
				//
				// Remplissage du tableau
				//
		
		tableau[0] = 1;
		tableau[1] = 2;	
		tableau[2] = 3;
		tableau[3] = 4;	
		tableau[4] = 5;
		
		
				// tableau[0] = 1; signifie que l'entrée 0 du tableau contient la valeur 1
				// on rempli toutes les entrées du tableau de la même manière
		
		
				//
				// Affichage de toutes les entrées du tableau
				//
		
		for (Integer valeurTab : tableau){
			
				// for = sert à utiliser la fonction "pour"
				// Integer valeurTab : tableau = signifie qu'on va parcourir et extraire chaque données de type Integer (nommées valeurTab) du tableau
				// { = signifie que chaque données extraites va subir la commande à l'intérieur de la boucle
			
			
			System.out.println("La valeur est : " + valeurTab);
			
				// on veux seulement afficher "la valeur est :" et chaque donnée du tableau
		}
				
				
				
				
				
				
				
	}

}
