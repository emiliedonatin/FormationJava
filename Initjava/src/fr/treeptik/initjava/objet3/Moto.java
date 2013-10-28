package fr.treeptik.initjava.objet3;

public class Moto extends Vehicule {

	private Boolean sideCar;

	public Moto() {

	}

	public Moto(Integer puissance, Carburant carburant, Boolean sideCar) {
		super(puissance, carburant);
		this.sideCar = sideCar;
	}

	@Override
	public void avancer() { // on redéfini la méthode qui était abstraite dans
							// la classe véhicule

		System.out.println("Avancer la moto ");

	}

	public Boolean getSideCar() {
		return sideCar;
	}

	public void setSideCar(Boolean sideCar) {
		this.sideCar = sideCar;
	}

}
