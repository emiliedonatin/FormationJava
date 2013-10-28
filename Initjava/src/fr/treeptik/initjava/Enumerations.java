package fr.treeptik.initjava;

import java.util.Scanner;


public class Enumerations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//
	// Les énumérations
	//
		
		
	// Ce sont un type de données à part entière ils peuvent donc avoir leurs propres fichiers
		
		Scanner scanner = new Scanner(System.in);
		String jourSaisie = scanner.nextLine();
		
		
		
		
		JoursOuvres jourOuvres = JoursOuvres.valueOf(jourSaisie.toUpperCase()); 
		
		afficherJour(jourOuvres);
		
		JoursOuvres [] jourOuvress	= JoursOuvres.values();
		
		for (JoursOuvres jourOuvres2 : jourOuvress){
			System.out.println(jourOuvres2.name());
		}
		
	scanner.close();
		
		
		
		}
		public static void afficherJour(JoursOuvres jourOuvres){
			
			System.out.println(jourOuvres);
		
		
		
		
		
		
		
	}

}
