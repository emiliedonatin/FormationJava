package fr.treeptik.initjava.objet3;

import fr.treeptik.initjava.objet3.Vehicule.Carburant;

public class RunTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Voiture v = new Voiture(150, Carburant.SANS_PLOMB, 5, true, true);

		System.out.println("Puissance de la voiture : " + v.getPuissance());

		Moto m = new Moto(90, Carburant.SANS_PLOMB, true);

		Personne personne = new Personne("TOTO", "TOTO");

		avancer(personne);
		avancer(m);
		avancer(v);

	}

	public static void avancer(ComportementAvancer comportementAvancer) {
		comportementAvancer.avancer();
	}

}
