package fr.treeptik.locationJPA.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "contrat")
public class Contrat implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer nocontrat;

	@Column(name = "date_contrat")
	@Temporal(TemporalType.DATE)
	private Date dateContrat;

	@Column(name = "date_enlevement")
	@Temporal(TemporalType.DATE)
	private Date dateEnlevement;

	@Column(name = "date_retour")
	@Temporal(TemporalType.DATE)
	private Date dateRetour;

	@ManyToOne
	@JoinColumn(name = "codecl")
	private Client client;

	@OneToOne
	@JoinColumn(name = "noimmatriculation")
	private Voiture voiture;

	@ManyToMany
	@JoinTable(name = "prevoir", joinColumns = @JoinColumn(name = "nocontrat"), inverseJoinColumns = @JoinColumn(name = "codesupplement"))
	private List<Supplements> supplements;

	public Contrat(Integer nocontrat, Date dateContrat, Date dateEnlevement, Date dateRetour, Client client, Voiture voiture, List<Supplements> supplements) {
		super();
		this.nocontrat = nocontrat;
		this.dateContrat = dateContrat;
		this.dateEnlevement = dateEnlevement;
		this.dateRetour = dateRetour;
		this.client = client;
		this.voiture = voiture;
		this.supplements = supplements;
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

	@Override
	public String toString() {
		return "Contrat [nocontrat=" + nocontrat + ", dateContrat=" + dateContrat + ", dateEnlevement=" + dateEnlevement + ", dateRetour=" + dateRetour + ", client=" + client + ", voiture=" + voiture + ", supplements=" + supplements + "]";
	}
	
	

}
