package fr.treeptik.initjava;

import java.util.Scanner;

public class ChaineDeCaractere {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Entrer une phrase");

		String saisie = scanner.nextLine();

		decouper(saisie);
		System.out.println(mirror(saisie));

		scanner.close();
	}

	public static void decouper(String string) {

		String[] motTab = string.split(" ");

		for (int i = 0; i < motTab.length; i++) {

			if (i % 2 == 0) {

				System.out.println(motTab[i].toUpperCase());

			}

			else if (i % 2 == 1) {

				System.out.println(motTab[i].toLowerCase());
			}

		}

	}
	
	
	public static String mirror (String saisie){
		
		String result = "";
		
		for (int i=0; i<saisie.length(); i++ ){
			
		
		char c = saisie.charAt(saisie.length()-i-1);
		
		result = result + c;
		}
		return result;
	}

	
	
	
	 
}
