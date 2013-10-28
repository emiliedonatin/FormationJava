package fr.treeptik.initjava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExceptionSample {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception { // le throws
																// permet de
																// sortir
																// complétement
																// en cas
																// d'exception
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String sDate = scanner.nextLine();

		try {
			parseDate(sDate);
		} catch (ParseException | NumberFormatException e) { // permet de faire
																// le même bout
																// de code pour
																// 2 exceptions
																// différentes
			e.printStackTrace(); // permet d'afficher le message d'erreur dans
								 // le terminal quand l'appli plante

			throw new Exception(e.getMessage()); // permet de sortir de la
												 // boucle en remontant une
												 // erreur
										       	

		} catch (Exception e) {
			e.printStackTrace();
		} finally { // cette étape sera toujours exécutée quoi qu'il arrive
			System.out.println("   Fin try   ");
		}

		scanner.close();
	}

	public static Date parseDate(String stringDate) throws ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

		return simpleDateFormat.parse(stringDate);
	}

	public static Integer parseInt(String stringInt) throws NumberFormatException {
		return Integer.valueOf(stringInt);
	}

}
