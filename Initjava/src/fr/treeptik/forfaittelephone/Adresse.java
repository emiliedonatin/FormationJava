package fr.treeptik.forfaittelephone;

public class Adresse {
	
	private String codePostal;
	private String ville;
	private String rue;
	
	
	public Adresse(String codePostal, String ville, String rue) {
		super();
		this.codePostal = codePostal;
		this.ville = ville;
		this.rue = rue;
	}
	
	public Adresse() {
		// TODO Auto-generated constructor stub
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

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	@Override
	public String toString() {
		return "Adresse [codePostal=" + codePostal + ", ville=" + ville + ", rue=" + rue + "]";
	}
	
	
	

}
