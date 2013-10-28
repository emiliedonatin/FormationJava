package fr.treeptik.initjava;

import java.util.Scanner;

public class LePerroquet {

	/**
	 * @param args
	 * @param "Quit"
	 */
	public static void main(String[] args) {

		Scanner saisie = new Scanner(System.in);

		System.out.println("Taper un mot:");
		System.out.println("Taper Q pour sortir de l'application");

		while (saisie.hasNext()) {

			String mot = saisie.nextLine();

			System.out.println(mot);

			if (mot.equalsIgnoreCase("Q")) {

				System.out.println("Fin");
				break;
			}
		}
		saisie.close();
	}
}
