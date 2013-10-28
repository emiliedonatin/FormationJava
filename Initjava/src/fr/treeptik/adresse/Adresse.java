package fr.treeptik.adresse;

public class Adresse {

	private String adresse;

	private String codePostal;

	private String ville;

	public Adresse(String adresse, String codePostal, String ville) {

		this.adresse = adresse;

		this.codePostal = codePostal;

		this.ville = ville;

	}

	public Adresse() {

	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "Adresse [adresse=" + adresse + ", codePostal=" + codePostal + ", ville=" + ville + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adresse == null) ? 0 : adresse.toUpperCase().hashCode());
		result = prime * result + ((codePostal == null) ? 0 : codePostal.hashCode());
		result = prime * result + ((ville == null) ? 0 : ville.toUpperCase().hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Adresse other = (Adresse) obj;
		if (adresse == null) {
			if (other.adresse != null)
				return false;
		} else if (!adresse.equalsIgnoreCase(other.adresse))
			return false;
		if (codePostal == null) {
			if (other.codePostal != null)
				return false;
		} else if (!codePostal.equals(other.codePostal))
			return false;
		if (ville == null) {
			if (other.ville != null)
				return false;
		} else if (!ville.equalsIgnoreCase(other.ville))
			return false;
		return true;
	}

}
