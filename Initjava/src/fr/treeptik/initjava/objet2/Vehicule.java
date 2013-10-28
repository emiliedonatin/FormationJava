package fr.treeptik.initjava.objet2;

public abstract class Vehicule {  // on a crée une classe abstraite on ne peut donc pas créer d'instance Vehicule (puisqu'au final le véhicule sera obligatoirement soit une voiture soit une moto)

	public enum Carburant { 
							
		GPL, DIESEL, SANS_PLOMB
 
	}

	private Integer puissance;
	private Carburant carburant; 
	
	private static int count;
									 

	public Vehicule() {}

	public Vehicule(Integer puissance, Carburant carburant) {
		super();
		this.puissance = puissance;
		this.carburant = carburant;
		count++;
	}

	
	public abstract void avancer (); // la méthode avancer est abstraite donc on va devoir redéfinir la méthode pour chaque type de véhicule (moto et voiture)
	
	
	
	
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
