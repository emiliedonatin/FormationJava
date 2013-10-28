package fr.treeptik.initjava;

import java.util.Scanner;

public class ExerciceOccurenceLettreDansUnePhrase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in); // on ouvre un scanner pour
													// récupérer les saisies
													// utilisateur

		String saisie = scanner.nextLine(); // on nomme la saisie de
											// l'utilisateur "saisie"
		saisie = saisie.toUpperCase(); // on converti la saisie de l'utilisateur
										// en majuscule

		int[] tableau = new int[26]; // on crée un tableau qui contient 26
										// cellules comme les 26 lettres de
										// l'alphabet

		for (int i = 0; i < saisie.length(); i++) { // on parcours le tableau en
													// commencant à la cellule 0
													// jusqu'à la cellule 25

			System.out.println(saisie.charAt(i)); // on veut afficher la saisie
													// de l'utilisateur en
													// affichant une lettre par
													// ligne

			char l = saisie.charAt(i); // on récupère chaque lettre de la saisie
										// pour le transformer en char appelé
										// "l"

			if (l > 65 && l < 91) { // on lui dit qu'il ne doit prendre en compte que les caractères qui ont une valeur ASCII comprise entre 65 et 91
				
				
				int index = l - 65; // on sait que 65 correspond à la lettre A
				// d'après la table ASCII
				// on crée une variable de type int appelée
				// "index" et qui correspond à la position de la
				// cellule dans le tableau
				// par exemple pour la lettre a index = 65 - 65
				// = 0 (c'est la première cellule du tableau)

				tableau[index] += 1; // il va ajouter la valeur 1 au compteur de
					// chaque cellule pour laquelle il a trouvé
					// une lettre
					// par exemple si il trouve une lettre a =
					// il va ajouter 1 dans la cellule 65-65
					// (soit 0)

			}


		}
		for (int i = 0; i < 26; i++) { // on parcours toutes les cellules du
										// tableau en commençant à la cellule 0

			char lettre = (char) (i + 65); // On crée la variable lettre de
											// type char en forcant la
											// conversion de i (la cellule
											// du tableau) +65
											// le résultat est une lettre de
											// la table ASCII (ex: "c" est
											// bien égal à 3+65)

			if (tableau[i] > 0) { // on ne veut afficher que les lettres
									// pour lesquelles on a une valeur
									// différente de 0
									// donc si la valeur de la cellule est >
									// 0 alors on rentre dans la boucle

				System.out.println("La valeur est :" + lettre + " = " + tableau[i]); // on
																						// affiche
																						// le
																						// résultat
																						// seulement
																						// pour
																						// les
																						// lettres
																						// trouvées
			}
		}

		scanner.close();
	}

}
