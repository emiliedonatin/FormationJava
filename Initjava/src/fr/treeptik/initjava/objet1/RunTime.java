package fr.treeptik.initjava.objet1;

import fr.treeptik.initjava.objet1.Vehicule.Carburant;

public class RunTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

	Voiture v = new Voiture(150, Carburant.SANS_PLOMB, 5, true, true);
	
	System.out.println("Puissance de la voiture : " + v.getPuissance());
	
		
	Moto m = new Moto(90, Carburant.SANS_PLOMB, true);
		
	afficherInfoVehicule(v); // on appelle la méthode qu'on a crée en dessous qui sert à afficher les caractéristiques du véhicule
	afficherInfoVehicule(m);
	
	System.out.println("******AVANCER*******");
	avancerVehicule(v); // les deux lignes sont 2 façons différentes d'écrire la même chose
	m.avancer();
	
	
	System.out.println("Nombre vehicule : " + Vehicule.getCount()); // on affiche le nombre de véhicule crée qui est égal à 2 puisqu'on a créeé une voiture et une moto

	}
	
	public static void avancerVehicule (Vehicule vehicule){
		vehicule.avancer();
	}
	
	

	public static void afficherInfoVehicule (Vehicule vehicule){
		System.out.println("Vehicule : " + vehicule.getPuissance() + " Carburant : " + vehicule.getCarburant());
		
		if ( vehicule instanceof Voiture){  // on dit que si le véhicule est une voiture
			Voiture voiture = (Voiture) vehicule; // alors on veut caster le véhicule en voiture et on peut ainsi récupèrer les données sur le nombre de porte (par ex) qui n'est normalement pas accessible dans la famille véhicule
			System.out.println("Nombre de porte : " + voiture.getNbPorte());
		}
	}
	
	
	
	
}
