package fr.treeptik.locationJPA.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "type_voiture")
public class TypeVoiture implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "code_type")
	private String codeType;

	@Column(name = "description_type")
	private String descriptionType;

	private Integer places;

	@Column(name = "prix_jour")
	private Integer prixJour;
	
	@OneToMany(mappedBy="typeVoiture")
	private List<Voiture> voitures;

	public TypeVoiture(String codeType, String descriptionType, Integer places, Integer prixJour) {
		super();
		this.codeType = codeType;
		this.descriptionType = descriptionType;
		this.places = places;
		this.prixJour = prixJour;
	}

	public TypeVoiture() {

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
