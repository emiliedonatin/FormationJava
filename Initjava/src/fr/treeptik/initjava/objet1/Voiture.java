package fr.treeptik.initjava.objet1;

public class Voiture extends Vehicule{

	
	private Integer nbPorte;
	private Boolean climatisation;
	private Boolean radio;
	
	
	public Voiture(Integer puissance, Carburant carburant, Integer nbPorte, Boolean climatisation, Boolean radio) {
		
		super(puissance, carburant);  // on appelle le constructeur de la classe véhicule qui prend 2 paramètres
		
		this.nbPorte = nbPorte;
		this.climatisation = climatisation;
		this.radio = radio;
	}
	
	
	public Voiture () {
		
	}

	@Override
	public void avancer() { // on va redéfinir la méthode avancer spécifiquement pour la classe voiture
		System.out.println("Avancer la voiture");;
	}


	public Integer getNbPorte() {
		return nbPorte;
	}


	public void setNbPorte(Integer nbPorte) {
		this.nbPorte = nbPorte;
	}


	public Boolean getClimatisation() {
		return climatisation;
	}


	public void setClimatisation(Boolean climatisation) {
		this.climatisation = climatisation;
	}


	public Boolean getRadio() {
		return radio;
	}


	public void setRadio(Boolean radio) {
		this.radio = radio;
	}
	
	
	
	
	
	
	
	
	
}
