package fr.treeptik.initjava;

public class ExerciceTrierUnTableau2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] tabInt = { 8, 5, 7, 3, 4, 10, 45 }; // nouvelle façon pour
													// initialiser un tableau

		boolean permut = false; // on crée un boolean pour savoir si on fait une
								// permutation ou pas

		do { //

			permut = false;

			for (int i = 0; i < tabInt.length-1; i++) {

				if (tabInt[i + 1] < tabInt[i]) {
					int temp = tabInt[i];
					tabInt[i] = tabInt[i + 1];
					tabInt[i + 1] = temp;

					permut = true;

				}
			}
		}

		while (permut);
		for (int i : tabInt) {
			System.out.println(i);
		}
	}

}
