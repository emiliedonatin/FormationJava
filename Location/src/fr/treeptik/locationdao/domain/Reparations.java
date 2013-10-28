package fr.treeptik.locationdao.domain;

import java.io.Serializable;
import java.util.Date;

public class Reparations implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer numRep;
	private Date dateRep;
	private String descriptionPanne;
	private Integer montantRepa;
	private String noImmatriculation;
	
	public Reparations(Integer numRep, Date dateRep, String descriptionPanne, Integer montantRepa, String noImmatriculation) {
		super();
		this.numRep = numRep;
		this.dateRep = dateRep;
		this.descriptionPanne = descriptionPanne;
		this.montantRepa = montantRepa;
		this.noImmatriculation = noImmatriculation;
	}
	
	public Reparations() {
		
	}

	public Integer getNumRep() {
		return numRep;
	}

	public void setNumRep(Integer numRep) {
		this.numRep = numRep;
	}

	public Date getDateRep() {
		return dateRep;
	}

	public void setDateRep(Date dateRep) {
		this.dateRep = dateRep;
	}

	public String getDescriptionPanne() {
		return descriptionPanne;
	}

	public void setDescriptionPanne(String descriptionPanne) {
		this.descriptionPanne = descriptionPanne;
	}

	public Integer getMontantRepa() {
		return montantRepa;
	}

	public void setMontantRepa(Integer montantRepa) {
		this.montantRepa = montantRepa;
	}

	public String getNoImmatriculation() {
		return noImmatriculation;
	}

	public void setNoImmatriculation(String noImmatriculation) {
		this.noImmatriculation = noImmatriculation;
	}
	
	

}
