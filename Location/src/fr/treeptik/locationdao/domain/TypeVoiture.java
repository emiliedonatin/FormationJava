package fr.treeptik.locationdao.domain;

import java.io.Serializable;

public class TypeVoiture implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private String codeType;
	private String descriptionType;
	private Integer places;
	private Integer prixJour;
	
	public TypeVoiture(String codeType, String descriptionType, Integer places, Integer prixJour) {
		super();
		this.codeType = codeType;
		this.descriptionType = descriptionType;
		this.places = places;
		this.prixJour = prixJour;
	}
	
	public TypeVoiture() {
		// TODO Auto-generated constructor stub
	}

	public String getCodeType() {
		return codeType;
	}

	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	public String getDescriptionType() {
		return descriptionType;
	}

	public void setDescriptionType(String descriptionType) {
		this.descriptionType = descriptionType;
	}

	public Integer getPlaces() {
		return places;
	}

	public void setPlaces(Integer places) {
		this.places = places;
	}

	public Integer getPrixJour() {
		return prixJour;
	}

	public void setPrixJour(Integer prixJour) {
		this.prixJour = prixJour;
	}
	
	
	
	

}
