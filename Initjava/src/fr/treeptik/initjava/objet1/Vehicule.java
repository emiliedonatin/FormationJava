package fr.treeptik.initjava.objet1;

public class Vehicule {

	public enum Carburant { // on peut créer une énumération dans une classe si cette énumération est vraiment spécifique à cette classe
							
		GPL, DIESEL, SANS_PLOMB

	}

	private Integer puissance;
	private Carburant carburant; // on fait appel à l'enum qu'on a créé au dessus
	
	private static int count; // cette donnée est static donc elle appartient à la classe et pas aux instances ==> le compteur va bien être incrémenté à chaque création d'un nouveau véhicule

									 

	public Vehicule() {
	}

	public Vehicule(Integer puissance, Carburant carburant) {
		super();
		this.puissance = puissance;
		this.carburant = carburant;
		count++;
	}

	
	public void avancer (){
		System.out.println("Avancer Vehicule ");
	}
	
	
	
	
	public Integer getPuissance() {
		return puissance;
	}

	public void setPuissance(Integer puissance) {
		this.puissance = puissance;
	}

	public Carburant getCarburant() {
		return carburant;
	}

	public void setCarburant(Carburant carburant) {
		this.carburant = carburant;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Vehicule.count = count;
	}

	

}
