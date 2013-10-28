package fr.treeptik.initjava;

public class TableauValeurMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Integer[] integers = new Integer [10];
	
	
	integers[0] = 100;
	integers[1] = 458;
	integers[2] = 41;
	integers[3] = 2;
	integers[4] = 48;
	integers[5] = 4;	
	integers[6] = 40;
	integers[7] = 100;
	integers[8] = 136;
	integers[9] = 6;
		
	
	System.out.println(integers[3]);
		
	Integer valeurMax = integers[0];

	for (Integer valeurTableau : integers){
		
		System.out.println(valeurTableau);
	
		
	if (valeurMax<valeurTableau){
		
		valeurMax = valeurTableau;
	}
	}
	System.out.println("La valeur maximale est : " + valeurMax);
	
	
}
}
