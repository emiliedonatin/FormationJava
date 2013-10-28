package fr.treeptik.initjava.objet3;

public class Voiture extends Vehicule {

	private Integer nbPorte;
	private Boolean climatisation;
	private Boolean radio;

	public Voiture(Integer puissance, Carburant carburant, Integer nbPorte, Boolean climatisation, Boolean radio) {

		super(puissance, carburant);

		this.nbPorte = nbPorte;
		this.climatisation = climatisation;
		this.radio = radio;
	}

	public Voiture() {

	}

	@Override
	public void avancer() {
		System.out.println("Avancer la voiture");
		;
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
