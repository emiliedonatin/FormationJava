package fr.treeptik.locationdao.domain;

import java.io.Serializable;

public class Client implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private Integer codeCl;
	private String nomCl;
	private String adresse;
	private String ville;
	
	public Client(Integer codeCl, String nomCl, String adresse, String ville) {
		super();
		this.codeCl = codeCl;
		this.nomCl = nomCl;
		this.adresse = adresse;
		this.ville = ville;
	}
	
	public Client() {
		
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codeCl == null) ? 0 : codeCl.hashCode());
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
		Client other = (Client) obj;
		if (codeCl == null) {
			if (other.codeCl != null)
				return false;
		} else if (!codeCl.equals(other.codeCl))
			return false;
		return true;
	}

	public Integer getCodeCl() {
		return codeCl;
	}

	public void setCodeCl(Integer codeCl) {
		this.codeCl = codeCl;
	}

	public String getNomCl() {
		return nomCl;
	}

	public void setNomCl(String nomCl) {
		this.nomCl = nomCl;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	
	
	
	

}
