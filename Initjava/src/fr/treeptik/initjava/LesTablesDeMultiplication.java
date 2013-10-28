package fr.treeptik.initjava;

import java.util.Scanner;

public class LesTablesDeMultiplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i < 11; i++) {

			System.out.println("+     Table de " + i + " : ");

			for (int v = 1; v < 11; v++) {

				System.out.println(i + " * " + v + " = " + i * v);
			}

		}

		for (int i = 1; i < 11; i++) {

			System.out.println("+     Table de " + i + " : ");

			for (int v = 1; v < 11; v++) {

				int result = i + v; // il faut créer une variable car dans le
									// syso le "+" sert à faire une
									// concaténation
				System.out.println(i + " + " + v + " = " + result);
			}

		}

		//
		// Récupérer des données utilisateurs dans le terminal
		//

		Scanner scanner = new Scanner(System.in);

		String line = "";

		while (!"Q".equalsIgnoreCase(line)) { // le point d'exclamation sert à
												// apporter la négation à toutes
												// les commandes qui appellent
												// vrai ou faux

			System.out.println("+    Menu   +"); // cela sert à afficher le menu
													// pour donner les
													// instructions aux
													// utilisateurs
			System.out.println("+    Saisir 'A' pour les additions   +");
			System.out.println("+    Saisir 'M' pour les multiplications   +");
			System.out.println("+    Saisir 'Q' pour quitter   +");

			line = scanner.nextLine();

			if ("M".equalsIgnoreCase(line)) { // si il retrouve exactement la
												// lettre M dans la ligne alors
												// il exécute le code suivant

				for (int i = 1; i < 11; i++) {

					System.out.println("+     Table de " + i + " : ");

					for (int v = 1; v < 11; v++) {

						System.out.println(i + " * " + v + " = " + i * v);
					}

				}

			} else if ("A".equalsIgnoreCase(line)) {

				for (int i = 1; i < 11; i++) {

					System.out.println("+     Table de " + i + " : ");

					for (int v = 1; v < 11; v++) {

						int result = i + v;
						System.out.println(i + " + " + v + " = " + result);
					}

				}

			} else if ("Q".equalsIgnoreCase(line)) {

				System.out.println("Sortie de l'application");
			}

			else {

				System.out.println("Erreur saisie");
			}
			
			scanner.close();
		}
	}
}
