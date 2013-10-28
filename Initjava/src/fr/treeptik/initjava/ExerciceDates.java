package fr.treeptik.initjava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ExerciceDates {

	/**
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Date date = new Date(); // il faut bien choisir l'objet date.java.util
								// la date est égale au moment où j'exécute le
								// code
								// par exemple "Fri Jun 28 11:34:25 CEST 2013"

		System.out.println(date);

		// on peut formater la façon d'écriture des dates

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm"); // on
																				// crée SimpleDateFormat
																				// qui
																				// est
																				// un
								
		// objet
																				// qui
																				// va
																				// permettre
																				// de
																				// transformer
																				// une
																				// chaine
																				// de
																				// caractère
																				// en
																				// date
																				// et
																				// inversement

		String sDate = dateFormat.format(date); // on crée un string appelé
												// sDAte et qui va être formaté
												// grâce à l'objet dateFormat

		System.out.println(sDate); // on affiche la date formatée en
									// "dd/MM/yyyy"

		//
		// Exercice inverse
		//

		sDate = "26/12/1953 15:00"; // on transforme sDate en chaîne de
									// caractère pour faire l'exercice inverse

		Date date2 = dateFormat.parse(sDate); // parse permet de transformer une
												// chaîne de caractère en date

		System.out.println(date2); // on affiche la transformation
									// "Sat Dec 26 15:00:00 CET 1953"
	
	
		//
		// Les calendars
		//
		
		Calendar calendar = Calendar.getInstance(); // c'est la façon de créer un new Calendar car la class Calendar est une classe abstraite (qui ne peut pas être créeé)
		 
		calendar.setTime(date2); // permet de caler le calendar à une date donnée (ici c'est le 26/12/1953)
	
		calendar.add(Calendar.DATE, 7); // on choisit d'ajouter 7 jours à la date donnée
	
		date2 = calendar.getTime(); // on veut récupérer la date qui correspond à ce déplacement de 5 jours
		
		System.out.println(dateFormat.format(date2)); //on veut afficher la date formatée en dd/MM/yyyy soit 02/01/1954
		
		System.out.println(date2); // on peut afficher la date sans le formatage on aura alors Sat Jan 02 15:00:00 CET 1954
		
		
		
		
		
		calendar.add(Calendar.DATE, -15); // on choisit de retirer 14 jours à la date donnée
		
		date2 = calendar.getTime(); 
		
		System.out.println(dateFormat.format(date2));
		
		
		
		
		long seconds = TimeUnit.DAYS.toSeconds(28 * 365); // on affiche le nombre de secondes dans 28 ans
		System.out.println(seconds);
		
		long hours = TimeUnit.HOURS.toSeconds(28 * 365); // on affiche le nombre d'heure dans 28 ans
		System.out.println(hours);
		
		
		
		
		
		
		
	}

}
