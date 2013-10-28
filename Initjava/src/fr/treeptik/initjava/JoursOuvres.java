package fr.treeptik.initjava;

public enum JoursOuvres { // ce n'est pas une classe mais une énumération
	
	LUNDI(1), MARDI(2), MERCREDI(3), JEUDI(4), VENDREDI(5); // Les valeurs de l'énumération doivent être par convention en majuscules
															// les chiffres entre parenthèse font référence au constructeur
	int numerosJour;
	
	private JoursOuvres(int num) {
		numerosJour = num;
	}
	
	
}
