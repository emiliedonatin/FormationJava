package fr.treeptik.initjava.objet2;

import fr.treeptik.initjava.objet2.Vehicule.Carburant;

public class RunTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

	Voiture v = new Voiture(150, Carburant.SANS_PLOMB, 5, true, true);
	
	System.out.println("Puissance de la voiture : " + v.getPuissance());
	
		
	Moto m = new Moto(90, Carburant.SANS_PLOMB, true);
		
	afficherInfoVehicule(v); 
	afficherInfoVehicule(m);
	
	System.out.println("******AVANCER*******");
	avancerVehicule(v); 
	m.avancer();
	
	
	System.out.println("Nombre vehicule : " + Vehicule.getCount()); 
	}
	
	public static void avancerVehicule (Vehicule vehicule){
		vehicule.avancer();
	}
	
	

	public static void afficherInfoVehicule (Vehicule vehicule){
		System.out.println("Vehicule : " + vehicule.getPuissance() + " Carburant : " + vehicule.getCarburant());
		
		if ( vehicule instanceof Voiture){  
			Voiture voiture = (Voiture) vehicule; 
			System.out.println("Nombre de porte : " + voiture.getNbPorte());
		}
	}
	
	
	
	
}
