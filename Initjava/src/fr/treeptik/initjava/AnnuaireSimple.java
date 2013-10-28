package fr.treeptik.initjava;

import java.util.ArrayList;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class AnnuaireSimple {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		String saisie = "";

		TreeMap<String, ArrayList<String>> annuaire = new TreeMap<String, ArrayList<String>>();

		while (!"Q".equalsIgnoreCase(saisie)) {

			System.out.println("+    Menu   +");
			System.out.println("+    Taper 'P' pour enregistrer un nouveau contact   +");
			System.out.println("+    Taper 'N' pour enregistrer un numéro de téléphone   +");
			System.out.println("+    Taper 'T' pour afficher la liste des contacts   +");
			System.out.println("+    Taper 'R' pour afficher la liste inversée des contacts   +");
			System.out.println("+    Taper 'Q' pour quitter l'application   +");

			saisie = scanner.nextLine();

			switch (saisie.toUpperCase()) {
			case "P":

				System.out.println(" Saisir le nom : ");
				String nom = scanner.nextLine();
				annuaire.put(nom, new ArrayList<String>());

				break;

			case "N":

				System.out.println(" Saisir le nom : ");
				nom = scanner.nextLine();

				System.out.println(" Saisir le numéro : ");
				String num = scanner.nextLine();

				ArrayList<String> list = annuaire.get(nom);
				if (list != null) {
					list.add(num);
				}

				else {
					list = new ArrayList<>();
					list.add(num);
					annuaire.put(nom, list);
				}
				break;

			case "T":
				System.out.println(" Liste des personnes : ");

				Set<String> keySet = annuaire.keySet();

				afficherAnnuaire(annuaire, keySet);

				break;

			case "R":

				NavigableSet<String> descendingKeysSet = annuaire.descendingKeySet();

				afficherAnnuaire(annuaire, descendingKeysSet);

				break;

			case "Q":

				System.out.println("Sortie de l'application : ");

				break;

			default:
				break;
			}

		}
		scanner.close();
	}

	public static void afficherAnnuaire(Map<String, ArrayList<String>> annuaire, Set<String> keys) {

		for (String nomContact : keys) {

			System.out.println("Contact : " + nomContact);

			ArrayList<String> list = annuaire.get(nomContact);

			for (String numeros : list) {

				System.out.println(numeros + " : ");

			}
			System.out.println(" ");
		}

	}
}
