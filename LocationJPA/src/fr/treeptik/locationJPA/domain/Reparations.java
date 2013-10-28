package fr.treeptik.locationJPA.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "reparations")
public class Reparations implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "num_rep")
	private Integer numRep;

	@Column(name = "date_rep")
	@Temporal(TemporalType.DATE)
	private Date dateRep;

	@Column(name = "description_panne")
	private String descriptionPanne;

	@Column(name = "montant_repa")
	private Integer montantRepa;

	@ManyToOne
	@JoinColumn(name = "noimmatriculation")
	private Voiture voiture;

	public Reparations(Integer numRep, Date dateRep, String descriptionPanne, Integer montantRepa, Voiture voiture) {
		super();
		this.numRep = numRep;
		this.dateRep = dateRep;
		this.descriptionPanne = descriptionPanne;
		this.montantRepa = montantRepa;
		this.setVoiture(voiture);
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

	public Voiture getVoiture() {
		return voiture;
	}

	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateRep == null) ? 0 : dateRep.hashCode());
		result = prime * result + ((descriptionPanne == null) ? 0 : descriptionPanne.hashCode());
		result = prime * result + ((montantRepa == null) ? 0 : montantRepa.hashCode());
		result = prime * result + ((numRep == null) ? 0 : numRep.hashCode());
		result = prime * result + ((voiture == null) ? 0 : voiture.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Reparations [numRep=" + numRep + ", dateRep=" + dateRep + ", descriptionPanne=" + descriptionPanne + ", montantRepa=" + montantRepa + ", voiture=" + voiture + "]";
	}

	

	
	
	
}
