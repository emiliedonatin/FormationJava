package fr.treeptik.initjava;

import java.util.Scanner;

public class JeuneOuVieux {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int age;
		age = 0;

		System.out.println("Saisir votre âge :");

		age = scanner.nextInt();

		if (age < 20) {

			System.out.println("Vous êtes jeunes");

		}

		else if (age > 60) {
			System.out.println("Vous êtes vieux");
		}

		else if (age >= 20 && age < 30) {

			System.out.println("Vous n'êtes plus tout jeune et pas complètement vieux");
		}

		scanner.close();
	}

}
