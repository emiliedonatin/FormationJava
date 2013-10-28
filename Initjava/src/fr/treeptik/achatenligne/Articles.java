package fr.treeptik.achatenligne;

public abstract class Articles {
	
	private String titre;
	private String auteur_compositeur;
	
	public Articles(){}

	public Articles(String titre, String auteur_compositeur) {
		super();
		this.titre = titre;
		this.auteur_compositeur = auteur_compositeur;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur_compositeur() {
		return auteur_compositeur;
	}

	public void setAuteur_compositeur(String auteur_compositeur) {
		this.auteur_compositeur = auteur_compositeur;
	}
	
	

}
