package fr.treeptik.initjava;

import java.util.Scanner;

public class ApprendreLesEtoiles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
		// Faire un triangle d'étoiles
		//

		// Récupérer la saisie utilisateur

		System.out.println("Saisir la taille du triangle : ");

		// On affiche un menu pour proposer une saisie à l'utilisateur

		Scanner scanner = new Scanner(System.in);

		// Scanner scanner = signifie qu'on utilise la fonction Scanner qu'on
		// nomme scannner
		// new Scanner = on crée un nouveau scanner
		// System.in = signifie que les saisies sont collectées au niveau des
		// saisies du terminal

		int size = Integer.valueOf(scanner.nextLine());

		// on transforme la saisie utilisateur apelée size ( qui est un string)
		// en interger grâce à la fonction valueOf
		// scanner.next.line = signifie qu'on récupère la valeur saisie sur la
		// ligne suivant le menu

		//
		// Création du triangle d'étoile
		//

		String étoile = "*";

		// on crée la variable appelée étoile et qui est égale à *

		for (int i = 0; i <= size; i++) {

			// ici i représente le numéro de la ligne. Il commence à 0
			// i<=size signifie que la boucle va s'effectuer tant que i est <= à
			// la saisie de l'utilisateur
			// i++ signifie qu'il ajoute une nouvelle ligne à chaque nouvelle
			// boucle

			System.out.println(étoile);

			// on affiche une étoile par ligne

			étoile += "*";

			// signifie qu'on ajoute une nouvelle étoile à chaque nouvelle ligne
			// (donc chaque nouvelle boucle)

		}

		scanner.close();

	}

}
