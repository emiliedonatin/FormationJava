package fr.treeptik.initjava.objet3;

public class Personne implements ComportementAvancer {

	private String nom;
	private String prénom;

	public Personne() {

	}

	public Personne(String nom, String prénom) {
		super();
		this.nom = nom;
		this.prénom = prénom;
	}

	@Override
	public void avancer() {

		System.out.println("Personne avancer");

	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrénom() {
		return prénom;
	}

	public void setPrénom(String prénom) {
		this.prénom = prénom;
	}

}
