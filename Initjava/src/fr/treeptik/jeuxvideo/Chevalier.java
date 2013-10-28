package fr.treeptik.jeuxvideo;

public class Chevalier extends Personnage{

	
	private boolean cheval;

	public Chevalier(Integer nombreDeVie, Integer age, Arme armePredilection, Arme armeActive, boolean cheval) {
		super(nombreDeVie, age, armePredilection, armeActive);
		this.cheval = cheval;
		armePredilection = new Epee();
	}
	
	public Chevalier() {
		
	}

	public boolean isCheval() {
		return cheval;
	}

	public void setCheval(boolean cheval) {
		this.cheval = cheval;
	}
	
	
}
