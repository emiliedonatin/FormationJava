package fr.treeptik.amazon.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Articles implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private Integer artId;
	private Categories categories;
	private String artTitre;
	private String artChapeau;
	private String artContenu;
	private Date artDate;
	private Auteurs auteurs;
	private Boolean artEnLigne;
	private List<Commentaires> listCommentaires;
	
	
	

	public Articles(Integer artId, Categories categories, String artTitre, String artChapeau, String artContenu, Date artDate, Auteurs auteurs, Boolean artEnLigne, List<Commentaires> listCommentaires) {
		super();
		this.artId = artId;
		this.categories = categories;
		this.artTitre = artTitre;
		this.artChapeau = artChapeau;
		this.artContenu = artContenu;
		this.artDate = artDate;
		this.auteurs = auteurs;
		this.artEnLigne = artEnLigne;
		this.setListCommentaires(listCommentaires);
	}

	public Articles() {
		
	}

	public Integer getArtId() {
		return artId;
	}

	public void setArtId(Integer artId) {
		this.artId = artId;
	}

	public Categories getCategories() {
		return categories;
	}

	public void setCategories(Categories categories) {
		this.categories = categories;
	}

	public String getArtTitre() {
		return artTitre;
	}

	public void setArtTitre(String artTitre) {
		this.artTitre = artTitre;
	}

	public String getArtChapeau() {
		return artChapeau;
	}

	public void setArtChapeau(String artChapeau) {
		this.artChapeau = artChapeau;
	}

	public String getArtContenu() {
		return artContenu;
	}

	public void setArtContenu(String artContenu) {
		this.artContenu = artContenu;
	}

	public Date getArtDate() {
		return artDate;
	}

	public void setArtDate(Date artDate) {
		this.artDate = artDate;
	}

	public Auteurs getAuteurs() {
		return auteurs;
	}

	public void setAuteurs(Auteurs auteurs) {
		this.auteurs = auteurs;
	}

	public Boolean getArtEnLigne() {
		return artEnLigne;
	}

	public void setArtEnLigne(Boolean artEnLigne) {
		this.artEnLigne = artEnLigne;
	}

	
	public List<Commentaires> getListCommentaires() {
		return listCommentaires;
	}

	public void setListCommentaires(List<Commentaires> listCommentaires) {
		this.listCommentaires = listCommentaires;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((artId == null) ? 0 : artId.hashCode());
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
		Articles other = (Articles) obj;
		if (artId == null) {
			if (other.artId != null)
				return false;
		} else if (!artId.equals(other.artId))
			return false;
		return true;
	}
	

	
	
	

}
