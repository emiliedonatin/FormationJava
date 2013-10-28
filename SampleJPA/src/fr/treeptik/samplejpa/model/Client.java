package fr.treeptik.samplejpa.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


// !!! il faut toujours choisir l'entity javax.persistence qui va servir à mapper une classe sur une table avec l'annotation @Entity
// on peut choisir le nom de la table avec l'annotation @Table
@Entity
@Table(name="T_Client")
public class Client implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	
	// il est obligatoire de préciser une clé primaire lorsqu'on fait du jpa/hibernate (ici la clé primaire sera l'id)
	// on doit également préciser que cette clé primaire est auto generée
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="client_id")
	private Integer id;
	
	// on peut préciser la taille du varchar dans la base de données (ici 50)
	@Column(name="client_nom", length=50)
	private String nom;
	
	@Column(name="client_prenom", length=50)
	private String prenom;
	
	// l'annotation @Temporal permet de formater la date au format souhaité (par défaut la date est sous la forme date + heure min sec)
	@Column(name="client_date")
	@Temporal(TemporalType.DATE)
	private Date dateContrat;
	
	// on précise ici qu'il s'agit de la liaison inverse qui se trouve dans le POJO contrat (mais on parle bien de la même liaison)
	// on a creé une relation bi-directionelle ou relation inverse
	// la clé reste du côté du contrat
	@OneToOne(mappedBy="client")
	private Contrat contrat;
	
	// on a crée la relation inverse avec le POJO Commande (il s'agit d'une relation 1/N)
	@OneToMany(mappedBy="client")
	private List<Commande> commandes;
	
	
	public Client(Integer id, String nom, String prenom, Date dateContrat, Contrat contrat, List<Commande> commandes) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateContrat = dateContrat;
		this.contrat = contrat;
		this.commandes = commandes;
	}

	public Client() {
		
	}

	public List<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateContrat() {
		return dateContrat;
	}

	public void setDateContrat(Date dateContrat) {
		this.dateContrat = dateContrat;
	}

	public Contrat getContrat() {
		return contrat;
	}

	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}
	
	
	
	
}
