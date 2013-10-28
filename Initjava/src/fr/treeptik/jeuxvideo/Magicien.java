package fr.treeptik.jeuxvideo;

public class Magicien extends Personnage {

	private String royaume;

	public Magicien(Integer nombreDeVie, Integer age, Arme armePredilection, Arme armeActive, String royaume) {
		super(nombreDeVie, age, armePredilection, armeActive);
		this.royaume = royaume;
		armePredilection = new BaguetteMagique();
	}

	public Magicien() {

	}

	public String getRoyaume() {
		return royaume;
	}

	public void setRoyaume(String royaume) {
		this.royaume = royaume;
	}

}
