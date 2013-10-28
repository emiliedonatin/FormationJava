package fr.treeptik.initjava;

import java.util.Scanner;

public class MinEtMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner saisie = new Scanner(System.in);

		System.out.println("Entrer la valeur 1:");
		Integer valeur = saisie.nextInt();

		System.out.println("Entrer la valeur 2:");
		Integer valeur2 = saisie.nextInt();

		max(valeur, valeur2);
		min(valeur, valeur2);
		
		saisie.close();
	}

	public static void max(Integer integer, Integer integer2) {

		if (integer < integer2) {

			System.out.println("La valeur max est : " + integer2);
		}

		else if (integer > integer2) {
			System.out.println("La valeur max est : " + integer);

		}

		else {

			System.out.println("Les valeurs sont égales");
		}

	}

	public static void min(Integer integer, Integer integer2) {

		if (integer < integer2) {

			System.out.println("La valeur min est : " + integer);
		}

		else if (integer > integer2) {
			System.out.println("La valeur min est : " + integer2);

		}

		else {

			System.out.println("Les valeurs sont égales");
		}
	}
}
