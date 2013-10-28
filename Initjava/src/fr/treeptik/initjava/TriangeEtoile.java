package fr.treeptik.initjava;

import java.util.Scanner;

public class TriangeEtoile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Faire un triangle d'étoiles
		
		
		
		System.out.println("Saisir la taille du triangle : ");
		
		Scanner scanner = new Scanner(System.in); // on récupère la saisie de l'utilisateur
		
		int size = Integer.valueOf(scanner.nextLine()); // on transforme la saisie utilisateur (un string) en interger (grâce à valueOf)
		
		String etoile = "*"; //on créeé la valeur etoile qui est égale à *
		
		for (int i=0; i<size; i++){
			System.out.println(etoile); // on affiche une étoile par ligne
			etoile += "*"; // on rajoute une étoile à chaque arrivée sur cette ligne (tant qu'on est inférieur à la saisie de l'utilisateur)
			
			
			
		}
		
		
		//scanner.close(); // c'est pour fermer le scanner et libèrer des ressources (le scanner est normalement branché sur un flux de donnée)
	
	
		// Faire une pyramide d'étoiles
		
		
		System.out.println("Saisir la taille du triangle : ");
		
		//scanner = new Scanner(System.in);
		
		int hauteur = Integer.valueOf(scanner.nextLine());
		
		int longBase = hauteur * 2 - 1;
		
		int i=1;
		
		
		while(i<=hauteur){
			for(int j=0;j<=longBase/2-i; j++ ){
				System.out.print(" ");
			}
		
			for (int j=0;j<i*2-1;j++){
				System.out.print("*");
				
			}
		System.out.println("");
		
		i++;
		
		}
		 
			scanner.close();
			
		}
		
		
		// on peut faire aussi
	
	
//		int hauteur = 5;
//	 
//		for (int i=0; i<hauteur; i++){
//		 
//		for (int j = 0; j<hauteur-1-i; i++) {
//			System.out.print(" ");
//		}
//	
//		for (int j=0; j<i*2+1; j++){
//			System.out.print("*");
//			
//		}
//		System.out.println(" ");
//		
		}
		
		
	
	
	

