package fr.treeptik.initjava;

import java.util.Arrays;

public class ExerciceTrierUnTableauDEntier {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] integers = new Integer[10]; 

		integers[0] = 100;
		integers[1] = 458;
		integers[2] = 41;
		integers[3] = 2;
		integers[4] = 48;
		integers[5] = 4;
		integers[6] = 40;
		integers[7] = 1000;
		integers[8] = 136;
		integers[9] = 6;

		Arrays.sort(integers); // arrays est objet qui permet de traiter de plusieurs façons différentes
	
		
		
		for (int i = 0; i < 10; i++) {

			System.out.println(integers[i]);

		
		}
	}
}