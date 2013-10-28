package fr.treeptik.adresse;

import java.util.Date;

public class Personne {

	private String nom;

	private String prenom;

	private Date dateNaissance;

	public Personne(String nom, String prenom, Date dateNaissance) { // on créé
																		// un
																		// constructeur
																		// avec
																		// différents
																		// paramètres

		this.nom = nom; // le premier nom est la donnée membre et le deuxième
						// nom est le paramètre constructeur
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
	}

	public Personne() { // on crée un deuxième constructeur sans paramètres ce
						// qui permettra par la suite de créer un objet personne
						// sans y ajouter de paramètres

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

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	@Override
	// on est en train de modifier le comportement d'une méthode qui a été
	// définie dans une classe mère (ici la classe mère est la classe objet)
	// ces modifications ne vont pas affecter la méthode de la classe mère (ici
	// les modifs ne concernent que la classe personne)
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nom == null) ? 0 : nom.toUpperCase().hashCode()); // il faut penser à rajouter le .toUpperCase car Eclipse ne le génére pas automatiquement
		result = prime * result + ((prenom == null) ? 0 : prenom.toUpperCase().hashCode()); //idem
		return result;
	}

	@Override      // on redéfini la méthode equals
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personne other = (Personne) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equalsIgnoreCase(other.nom)) // par défaut eclipse
														// demande un equals
														// simple, il faut
														// penser à modifier en un
														// equalsIgnoreCase
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equalsIgnoreCase(other.prenom)) // par défaut eclipse
															// demande un equals
															// simple, il faut
															// penser à modifier en
															// un
															// equalsIgnoreCase
			return false;
		return true;
	}

}

