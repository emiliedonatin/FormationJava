package fr.treeptik.jeuxvideo;

public class Elfe extends Personnage {

	private String tailleDesOreilles;

	public Elfe(Integer nombreDeVie, Integer age, Arme armePredilection, Arme armeActive, String tailleDesOreilles) {
		super(nombreDeVie, age, armePredilection, armeActive);
		this.tailleDesOreilles = tailleDesOreilles;
		armePredilection = new Gourdin();
	}

	public Elfe() {

	}

	public String getTailleDesOreilles() {
		return tailleDesOreilles;
	}

	public void setTailleDesOreilles(String tailleDesOreilles) {
		this.tailleDesOreilles = tailleDesOreilles;
	}

}
