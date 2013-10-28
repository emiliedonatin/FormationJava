package fr.treeptik.amazon.domain;

import java.io.Serializable;
import java.util.Date;

public class Commentaires implements Serializable{

	
	private static final long serialVersionUID = 1L;

	private Integer comId;
	
	private String comNom;
	private String comEmail;
	private String comTexte;
	private Date comDate;
	private Boolean comValidation;
	private Articles articles;
	public Commentaires(Integer comId, String comNom, String comEmail, String comTexte, Date comDate, Boolean comValidation,
			Articles articles) {
		super();
		this.comId = comId;
		
		this.comNom = comNom;
		this.comEmail = comEmail;
		this.comTexte = comTexte;
		this.comDate = comDate;
		this.comValidation = comValidation;
		this.articles = articles;
	}
	
	public Commentaires() {
		// TODO Auto-generated constructor stub
	}

	public Integer getComId() {
		return comId;
	}

	public void setComId(Integer comId) {
		this.comId = comId;
	}

	

	public String getComNom() {
		return comNom;
	}

	public void setComNom(String comNom) {
		this.comNom = comNom;
	}

	public String getComEmail() {
		return comEmail;
	}

	public void setComEmail(String comEmail) {
		this.comEmail = comEmail;
	}

	public String getComTexte() {
		return comTexte;
	}

	public void setComTexte(String comTexte) {
		this.comTexte = comTexte;
	}

	public Date getComDate() {
		return comDate;
	}

	public void setComDate(Date comDate) {
		this.comDate = comDate;
	}

	public Boolean getComValidation() {
		return comValidation;
	}

	public void setComValidation(Boolean comValidation) {
		this.comValidation = comValidation;
	}

	public Articles getArticles() {
		return articles;
	}

	public void setArticles(Articles articles) {
		this.articles = articles;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comId == null) ? 0 : comId.hashCode());
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
		Commentaires other = (Commentaires) obj;
		if (comId == null) {
			if (other.comId != null)
				return false;
		} else if (!comId.equals(other.comId))
			return false;
		return true;
	}

	
}
