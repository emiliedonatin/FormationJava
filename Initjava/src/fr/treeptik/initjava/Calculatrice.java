package fr.treeptik.initjava;

import java.util.Scanner;

public class Calculatrice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		System.out.println("Entrez une valeur : ");
		
		Scanner scanner = new Scanner(System.in);
	
		int i = scanner.nextInt();
		

		System.out.println("Entrez une valeur : ");
		
		
		int j = scanner.nextInt();
		
		System.out.println("La somme est : " + (i+j));
		
		scanner.close();
	}

}
