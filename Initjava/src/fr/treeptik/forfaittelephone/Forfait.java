package fr.treeptik.forfaittelephone;

import java.util.Date;

public abstract class Forfait {
	
	protected String reference;
	protected Date dateDebut;
	protected Date dateFin;
	protected String numero;
	
	public Forfait(String reference, Date dateDebut, Date dateFin, String numero) {
		super();
		this.reference = reference;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.numero = numero;
	}
	
	public Forfait() {
		// TODO Auto-generated constructor stub
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
	

}
