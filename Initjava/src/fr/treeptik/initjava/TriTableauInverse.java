package fr.treeptik.initjava;

import java.util.Arrays;
import java.util.Collections;

public class TriTableauInverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Integer [] tabInt = {25,65,7,1325,20,2,19,78,46,3,1459};
	
	
		
	Arrays.sort(tabInt, Collections.reverseOrder());
	
	
	for (int i=0; i<tabInt.length; i++ ){
	
	System.out.println(tabInt[i]);
		
		
	}
	}

}
