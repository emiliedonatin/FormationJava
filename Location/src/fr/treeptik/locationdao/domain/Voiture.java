package fr.treeptik.locationdao.domain;

import java.io.Serializable;

public class Voiture implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private String noImmatriculation;
	private String marque;
	private String modele;
	private String couleur;
	private Integer cumulReparation;
	private Boolean disponible;
	private TypeVoiture typeVoiture;
	
	
	public Voiture(String noImmatriculation, String marque, String modele, String couleur, Integer cumulReparation, Boolean disponible, TypeVoiture typeVoiture) {
		super();
		this.noImmatriculation = noImmatriculation;
		this.marque = marque;
		this.modele = modele;
		this.couleur = couleur;
		this.cumulReparation = cumulReparation;
		this.disponible = disponible;
		this.typeVoiture = typeVoiture;
	}
	
	
	public Voiture() {
		
	}


	public String getNoImmatriculation() {
		return noImmatriculation;
	}


	public void setNoImmatriculation(String noImmatriculation) {
		this.noImmatriculation = noImmatriculation;
	}


	public String getMarque() {
		return marque;
	}


	public void setMarque(String marque) {
		this.marque = marque;
	}


	public String getModele() {
		return modele;
	}


	public void setModele(String modele) {
		this.modele = modele;
	}


	public String getCouleur() {
		return couleur;
	}


	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}


	public Integer getCumulReparation() {
		return cumulReparation;
	}


	public void setCumulReparation(Integer cumulReparation) {
		this.cumulReparation = cumulReparation;
	}


	public Boolean getDisponible() {
		return disponible;
	}


	public void setDisponible(Boolean disponible) {
		this.disponible = disponible;
	}


	public TypeVoiture getTypeVoiture() {
		return typeVoiture;
	}


	public void setTypeVoiture(TypeVoiture typeVoiture) {
		this.typeVoiture = typeVoiture;
	}
	
	

}
