package fr.treeptik.samplejpa.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Commande implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Temporal(TemporalType.DATE)
	private Date dateCommande;
	
	private Double tarif;
	
	@ManyToOne
	// signifie qu'il y a plusieurs (many) commandes pour un seul (to one) client
	private Client client;
	
	
	// on crée une relation N/N avec la table produit (une table de relation va alors automatiquement être générée)
	@ManyToMany
	// On peut modifier le nom de la table de relation et également le nom des différentes colonnes
	@JoinTable(name="CommandeProduit", joinColumns=@JoinColumn(name="commandeId"), inverseJoinColumns=@JoinColumn(name="prduitID"))
	private List<Produit> produits;

	
	
	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}

	public Commande(Integer id, Date dateCommande, Double tarif, Client client) {
		super();
		this.id = id;
		this.dateCommande = dateCommande;
		this.tarif = tarif;
		this.client = client;
	}

	public Commande() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public Double getTarif() {
		return tarif;
	}

	public void setTarif(Double tarif) {
		this.tarif = tarif;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	
	
	
}
