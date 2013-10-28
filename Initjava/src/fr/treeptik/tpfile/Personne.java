package fr.treeptik.tpfile;

public class Personne implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nom;
	private String prenom;
	private String numero;
	public Personne(String nom, String prenom, String numero) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.numero = numero;
	}
	
	public Personne() {
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
	
}
