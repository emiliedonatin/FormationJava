package fr.treeptik.initjava;

import java.util.Arrays;

public class TestTypeSimple {

	public static void main(String[] args) {

	

		//
		// Types primitifs int
		//

		
		int valeurInt = 2;

		System.out.println(valeurInt);

		
		valeurInt = 3;

		System.out.println(valeurInt);

		
		int newInt = 4;

		int result = valeurInt + newInt;

		System.out.println(result);

		
		
		valeurInt++; // valeurInt = valeurInt + 1
		++valeurInt; // valeurInt = valeurInt +1

		System.out.println(valeurInt++);

		
		
		
		//
		// Types primitifs 
		//

		byte n = 127; // les bytes vont jusqu'à 127 maxi
		byte b1 = 127; // pas de message d'erreur

		short s = 32767; // c'est le maxi pour les valeurs short

		long l = 339949849849849848L; // c'est la plus grosse capacité pour les
										// valeurs numériques

		double d = 12.2;
		float f = 12.548246854F; // on peut mettre plus de chiffres après la
									// virgule mais il faut penser à mettre un F
									// à la fin pour ne pas qu'il y ai d'erreur

		double result1 = newInt + d; // le résultat de l'addition d'un int avec
										// un double sera toujours un double
										// puisqu'il y a une virgule

		//
		// Type primitif char
		//

		char a = 'A'; // c'est un seul caractère et pas une chaîne de caractère.
						// Ca peut aussi être une valeur numérique qui
						// représente un caractère dans la table ASCII
		char c = 54; // c'est la lettre D dans la table. On ne met pas de ''
						// pour les valeurs numériques

		System.out.println(c);

	
		
		
		//
		// Type primitif boolean
		//

		boolean vrai = true;
		boolean faux = false;

		
		
		
		
		//
		// Type objet simple (les objets commencent toujours par une majuscule)
		//

		Integer integer = 1;
		Byte byte1 = 127;
		Short short1 = 3;
		Long long1 = 246845168465684L;
		Double double1 = 1.4;
		Float float1 = 12.5754848484F;
		Character character = 'A';
		Boolean boolean1 = false;

		System.out.println(boolean1);

		// on peut utiliser la commande null dans les objets pour obtenir un
		// résultat "pas de valeur"

		
		
		
		
		
		//
		// String (chaîne de caractère)
		//

		String string1 = "Ma super chaîne "; // Une chaîne de caractère est
												// toujours entre ""
		String string2 = string1 + "qui tue ";
		string2 += 2;

		System.out.println(string2); // le résultat est
										// "Ma super chaîne qui tue 2"

		System.out.println(string2.charAt(1)); // le résultat est "a" puisqu'on
												// voulait savoir quel caractère
												// est en 2ème position (la
												// numérotation commence à 0)

		System.out.println(string2.length()); // le résultat est le nombre de
												// caractère dans la chaîne

		System.out.println(string2.substring(9, 15)); // le résultat est qu'on a
														// extrait les
														// caractères de la
														// position 9 incluse à
														// la position 15 exclue

		String s1 = "AA";
		String s2 = "AA";
		System.out.println(s1 == s2); // == sert à vérifier l'égalité entre les
										// deux variables au niveau de l'adresse
										// mémoire (ici le résultat est true car
										// les 2 variables sont égales)
		System.out.println(s1.equals(s2)); // cette fonction est plus adaptée à
											// la comparaison d'objet

		
		
		
		String s3 = "BB";
		String s4 = "Bb";
		System.out.println(s3.equalsIgnoreCase(s4)); // dans ce cas la
														// comparaison ne prend
														// pas en compte les
														// majuscules

		String chaine2 = string2.substring(string2.indexOf("chaîne"),
				string2.indexOf("chaîne") + 6);

		System.out.println(chaine2); // le résultat est l'extraction du mot
										// chaîne alors qu'on ne connaissait pas
										// la position exacte du mot dans la
										// chaîne de caractères

		string2 = "   ";
		System.out.println(string2.length()); // le résultat est le nombre de
												// caractères entre les "" ici
												// c'est 3 car on a des espaces

		string2 = string2.trim();
		System.out.println(string2.length()); // le résultat est le nombre de
												// caractères entre le "" mais
												// en supprimant les espaces
												// inutiles ici c'est 0

		
		
		
		//
		// String Builder / String Buffer (c'est la même chose mais le 2ème est
		// plus vieux et moins utilisé)
		// Pour faire des concaténations de string importantes
		//

		
		
		StringBuilder stringBuilder = new StringBuilder(); // new sert à dire
															// qu'on va creér un
															// nouvel objet ici
															// on creer un
															// stringbuilder
															// on ne met rien
															// entre les
															// parenthèses car
															// on impose pas de
															// critères

		stringBuilder.append("Ma").append(" ").append("Chaîne").append(" ")
				.append(1);

		String string = stringBuilder.toString(); // permet de transformer mon
													// stringbuilder en chaîne
													// de caractère

		System.out.println(string); // le résultat est bien "Ma chaîne 1"

		//
		// Les tableaux (c'est un objet qui contient d'autres objets ou d'autres
		// types primitifs, il ne peut contenir qu'un seul type d'objet)
		//

		Integer[] integers = new Integer[5]; // le 5 signifie que le tableau a 5
												// entrées vides

		System.out.println(integers.length); // le résultat est 5 puisqu'on a
												// bien 5 entrées dans le
												// tableau

		integers[0] = 1;
		integers[1] = 2;
		integers[2] = 3;
		integers[3] = 4;
		integers[4] = 5;

		System.out.println(integers[2]); // le résultat est 3 car on demande
											// d'afficher la valeur de la
											// cellule 2

		Integer[] newIntegers = new Integer[10];

		// la taille du tableau est fixe, si on veut vraiment ajouter des
		// données on peut faire

		System.arraycopy(integers, 0, newIntegers, 0, 5); // on a copié le 1er
															// tableau dans le
															// 2ème. on copie de
															// la position 0 du
															// 1er tableau à la
															// position 0 du
															// 2ème tableau

		System.out.println(newIntegers[2]); // le résultat est 3 car on demande
											// d'afficher la valeur de la
											// cellule 2 qui est toujours la
											// même que dans le tableau 1

		//
		// Copie de tableau
		//

		Integer[] newTabInteger = Arrays.copyOf(integers, 10); // On vient de
																// créer plus
																// rapidement un
																// nouveau
																// tableau mais
																// on doit
																// obligatoirement
																// copier
																// l'ancien
																// tableau au
																// niveau de
																// l'entrée 0 du
																// nouveau
																// tableau

		System.out.println("lenght : " + newTabInteger.length); // on affiche
																// lenght : 10 .
																// C'est la
																// longueur du
																// nouveau
																// tableau
		System.out.println("tab[2] : " + newTabInteger[2]); // on affiche tab[2]
															// : 3 puisque c'est
															// la valeur
															// contenue dans la
															// colonne 2

		//
		// Création de matrices (tableau à 2 dimensions)
		//

		String[][] matrice = new String[3][4]; // on créer une matrice avec 4
												// entrées horizontales et 3
												// entrées verticales

		matrice[0][0] = "11";
		matrice[0][1] = "12";
		matrice[0][2] = "13";
		matrice[0][3] = "14";

		matrice[1][0] = "21";
		matrice[1][1] = "22";
		matrice[1][2] = "23";
		matrice[1][3] = "24";

		System.out.println("Matrice[1][2] :" + matrice[1][2]); // on demande
																// d'afficher la
																// valeur en
																// position 1-2
																// et le
																// résultat est
																// 23

		//
		// Pour insérer des chaînes de caractères dans un tableau
		//

		String bonjour = "Bonjour tout le monde";

		String[] bonjourTab = bonjour.split(" "); // on va séparer les mots de
													// la phrase dans chaque
													// cellule en fonction des
													// espaces. on peut utiliser
													// n'importe quel séparateur

		System.out.println("Taille tableau : " + bonjourTab.length); // pour
																		// afficher
																		// la
																		// taille
																		// du
																		// tableau.
																		// on
																		// aura
																		// 4
																		// entrée
																		// car
																		// il y
																		// a 4
																		// mots
																		// dans
																		// la
																		// phrase
		System.out.println("Tab[1] : " + bonjourTab[1]); // on veut afficher la
															// valeur qui est
															// dans la cellule 1
															// et c'est le mot
															// "tout"

		//
		// Pour parcourir tout le tableau plus facilement (on fabrique une
		// itération ou une boucle)
		// Rq: les itérations doivent toujours être inséreés dans un nouveau
		// bloc de code (entourées pas des { })
		//

		for (String mot : bonjourTab) {
			System.out.println(mot); // fonction "for each" l'action va être
										// exécutée en boucle sur chaque entrée
										// du tableau avec un retour à la ligne
										// entre chaque entrée
										// il va donc afficher à la suite
										// Bonjour tout le monde
										// c'est la méthode la plus adaptée pour
										// parcourir un tableau
			
			
			System.out.println("Taille du mot : " + mot.length()); // on affiche
																	// chaque
																	// mot puis
																	// sa
																	// longueur

		}

		for (int i = 0; i < bonjourTab.length; i++) { // on fait la même chose
														// qu'au dessus (i++
														// sert à incrémenter de
														// 1 à chaque boucle)

			String mot = bonjourTab[i];
			System.out.println(mot);
			System.out.println("Taille du mot : " + mot.length());

		}

		int i = 0;
		while (i < bonjourTab.length) { // la boucle va tourner tant que la
										// valeur i est inférieure à la longueur
										// du tableau (la boucle tourne tant que
										// ce qui est entre parenthèses est
										// vrai)

			String mot = bonjourTab[i];
			System.out.println(mot);
			i++;
		}

		i = 0; // ici on va d'abord exécuter la méthode "do" au moins une fois
				// (même si il n'est pas en accord avec la commande "while") et
				// ensuite passer à la commande "while"
		do {
			String mot = bonjourTab[i];
			System.out.println(mot);
			i++;

		} while (i < bonjourTab.length);

		//
		// Les tests conditionnels (pour vérifier des valeurs et faire des
		// traitements de ces valeurs)
		//

		String saisie = "Menu 1";

		if (saisie.equalsIgnoreCase("Menu 1")) {
			System.out.println("Saisie utilisateur : Menu 1"); // Si
																// l'utilisateur
																// saisi le menu
																// 1 on va
																// afficher le
																// message
																// "Saisie utilisateur..."
		}

		else if (saisie.equalsIgnoreCase("Menu 2")) { // Si l'utilisateur n'a
														// pas saisi le menu 1
														// on arrive sur la
														// commande "else if"
														// (sinon si) et on
														// repose une nouvelle
														// question

			System.out.println("Saisie utilisateur : Menu 2");
		}

		else { // c'est le dernier recours si les conditions du dessus ne sont
				// pas vraies

			System.out.println("Erreur de saisie");
		}

	}

}
