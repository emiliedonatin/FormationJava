package fr.treeptik.amazon.domain;

import java.io.Serializable;

public class Auteurs implements Serializable {

	
	private static final long serialVersionUID = 1L;

	private Integer autId;
	private String autNom;
	private String autPrenom;
	private String url;
	private String autEmail;
	
	public Auteurs(Integer autId, String autNom, String autPrenom, String url, String autEmail) {
		super();
		this.autId = autId;
		this.autNom = autNom;
		this.autPrenom = autPrenom;
		this.url = url;
		this.autEmail = autEmail;
	}
	
	public Auteurs() {
		// TODO Auto-generated constructor stub
	}

	public Integer getAutId() {
		return autId;
	}

	public void setAutId(Integer autId) {
		this.autId = autId;
	}

	public String getAutNom() {
		return autNom;
	}

	public void setAutNom(String autNom) {
		this.autNom = autNom;
	}

	public String getAutPrenom() {
		return autPrenom;
	}

	public void setAutPrenom(String autPrenom) {
		this.autPrenom = autPrenom;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getAutEmail() {
		return autEmail;
	}

	public void setAutEmail(String autEmail) {
		this.autEmail = autEmail;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autId == null) ? 0 : autId.hashCode());
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
		Auteurs other = (Auteurs) obj;
		if (autId == null) {
			if (other.autId != null)
				return false;
		} else if (!autId.equals(other.autId))
			return false;
		return true;
	}

}
