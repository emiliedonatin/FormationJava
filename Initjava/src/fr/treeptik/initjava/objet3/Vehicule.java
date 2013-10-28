package fr.treeptik.initjava.objet3;

public abstract class Vehicule implements ComportementAvancer { // on a crée une
																// classe
																// abstraite on
																// ne peut donc
																// pas créer
																// d'instance
																// Vehicule
																// (puisqu'au
																// final le
																// véhicule sera
																// obligatoirement
																// soit une
																// voiture soit
																// une moto)

	public enum Carburant {

		GPL, DIESEL, SANS_PLOMB

	}

	private Integer puissance;
	private Carburant carburant;

	private static int count;

	public Vehicule() {
	}

	public Vehicule(Integer puissance, Carburant carburant) {
		super();
		this.puissance = puissance;
		this.carburant = carburant;
		count++;
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
