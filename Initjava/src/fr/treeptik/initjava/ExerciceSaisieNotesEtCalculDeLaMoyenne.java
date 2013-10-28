package fr.treeptik.initjava;

import java.util.Arrays;
import java.util.Scanner;

public class ExerciceSaisieNotesEtCalculDeLaMoyenne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in); // on ouvre un scanner pour
													// récupérer les données
													// utilsateur

		String note = ""; // on dit que la note ne doit pas être nulle donc on
							// l'initialise à " "

		Integer[] tableau = new Integer[10]; // on crée un tableau avec 10
												// entrées (pour ne pas être
												// limité en taille il faudra
												// faire une copie de tableau)

		int nombreDeNotes = 0; // on crée la variable nombreDeNotes qui est
								// égale à 0 au départ puisqu'on part de la
								// position 0 du tableau

		while (!"Q".equalsIgnoreCase(note)) { // tant que la saisie n'est pas
												// égale à Q alors on rentre
												// dans la boucle

			System.out.println("+  Menu  +"); // on propose un menu à
												// l'utilisateur
			System.out.println("Saisir N pour entrer une note : ");
			System.out.println("Saisir Q pour quitter l'application ");

			note = scanner.nextLine(); // on récupère la donnée de l'utilisateur
										// qui sera N ou Q

			if ("N".equalsIgnoreCase(note)) { // si la saisie est égale à N
												// alors on rentre dans la
												// boucle

				if (nombreDeNotes > tableau.length - 1) { // si on saisi plus de
															// 10 notes alors
															// on veut créer un
															// nouveau tableau
															// (c'est la même
															// chose si on saisi
															// 20 notes on crée
															// à nouveau un
															// tableau)

					Integer[] newTableau = Arrays.copyOf(tableau, tableau.length + 10); // on
																						// lui
																						// dit
																						// de
																						// copier
																						// notre
																						// ancien
																						// tableau
																						// dans
																						// un
																						// nouveau
																						// plus
																						// grand
																						// de
																						// 10
																						// cellules

					tableau = newTableau; // on renomme le nouveau tableau crée
				}

				note = scanner.nextLine(); // on récupère alors la saisie
											// utilisateur qui correspond à la
											// note

				Integer notes = Integer.valueOf(note); // on transforme la
														// saisie qui est un
														// string en Integer
														// qu'on appelle "notes"

				tableau[nombreDeNotes] = notes; // on lui dit de placer la
												// variable "notes" dans la 1ère
												// cellule du tableau

				nombreDeNotes++; // la cellule remplie va se déplacer de 1 à
									// chaque boucle

			}

			else if ("Q".equalsIgnoreCase(note)) { // ou sinon, si la saisie est
													// égale à Q alors on rentre
													// dans cette boucle

				int addition = 0; // on crée une variable addition qui est égale
									// à la somme des notes, au départ elle est
									// égale à 0
				int moyenne = 0; // on crée une variable moyenne qui correspond
									// à la moyenne de toutes les notes, au
									// départ elle est égale à 0

				for (int i = 0; i < nombreDeNotes; i++) { // on va parcourir le
															// tableau pour
															// calculer la
															// moyenne si
															// l'utilisateur
															// tape Q
															// on part de la
															// cellule 0 (int i
															// =0)
															// on veut que i
															// soit toujours
															// inférieur au
															// nombrde notes
															// saisies
															// i++ signifie
															// qu'on passe à la
															// cellule suivante
															// tant que i<nombre
															// de notes saisies

					addition += tableau[i]; // on va faire l'addition de toutes
											// les entrées du tableau sans
											// prendre en compte les cellules
											// vides

				} // il faut sortir de la boucle avant de faire le calcul de la
					// moyenne

				moyenne = addition / nombreDeNotes; // on calcul la moyenne en
													// faisant l'addition des
													// notes / par le nombre de
													// notes

				System.out.println("La moyenne des notes est :" + moyenne); // on
																			// lui
																			// demande
																			// d'afficher
																			// la
																			// moyenne

			}

		}
		scanner.close();
	}
}
