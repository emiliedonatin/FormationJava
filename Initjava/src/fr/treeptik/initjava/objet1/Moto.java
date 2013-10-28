package fr.treeptik.initjava.objet1;

public class Moto extends Vehicule{
	
	
	private Boolean sideCar;

	
	public Moto(){
		
	}

	
	
	
	
	


	public Moto(Integer puissance, Carburant carburant, Boolean sideCar) {
		super(puissance, carburant);
		this.sideCar = sideCar;
	}





	public Boolean getSideCar() {
		return sideCar;
	}


	public void setSideCar(Boolean sideCar) {
		this.sideCar = sideCar;
	}
	
	

}
