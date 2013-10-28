package fr.treeptik.locationdao.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Contrat implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private Integer nocontrat;
	private Date dateContrat;
	private Date dateEnlevement;
	private Date dateRetour;
	private Client client;
	private Voiture voiture;
	private List<Supplements> supplements;
	
	public Contrat(Integer nocontrat, Date dateContrat, Date dateEnlevement, Date dateRetour, Client client, Voiture voiture) {
		super();
		this.nocontrat = nocontrat;
		this.dateContrat = dateContrat;
		this.dateEnlevement = dateEnlevement;
		this.dateRetour = dateRetour;
		this.client = client;
		this.voiture = voiture;
	}
	

	public Contrat() {
	
}


	public Integer getNocontrat() {
		return nocontrat;
	}


	public void setNocontrat(Integer nocontrat) {
		this.nocontrat = nocontrat;
	}


	public Date getDateContrat() {
		return dateContrat;
	}


	public void setDateContrat(Date dateContrat) {
		this.dateContrat = dateContrat;
	}


	public Date getDateEnlevement() {
		return dateEnlevement;
	}


	public void setDateEnlevement(Date dateEnlevement) {
		this.dateEnlevement = dateEnlevement;
	}


	public Date getDateRetour() {
		return dateRetour;
	}


	public void setDateRetour(Date dateRetour) {
		this.dateRetour = dateRetour;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	public Voiture getVoiture() {
		return voiture;
	}


	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}


	public List<Supplements> getSupplements() {
		return supplements;
	}


	public void setSupplements(List<Supplements> supplements) {
		this.supplements = supplements;
	}

	

}
