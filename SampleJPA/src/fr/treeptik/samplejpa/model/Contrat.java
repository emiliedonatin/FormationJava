package fr.treeptik.samplejpa.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Contrat implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String refContrat; 
	
	@OneToOne (fetch=FetchType.LAZY)
	// @onetoone permet de préciser que le client à un contrat et que le contrat appartient à un seul client
	// @FetchType.LAZY permet de ne récuperer que les données sur le contrat et pas sur les autres objets dans le cas de jointures entre plusieurs tables
	// par défaut le fetchType est à EAGER ce qui signifie qu'il rappatrie toutes les infos des tables jointes
	
	@JoinColumn(name="Client_id")
	// Permet de changer le nom de la colonne de jointure entre client et contrat
	
	private Client client;

	public Contrat(Integer id, String refContrat, Client client) {
		super();
		this.id = id;
		this.refContrat = refContrat;
		this.client = client;
	}


	public Contrat() {
		// TODO Auto-generated constructor stub
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getRefContrat() {
		return refContrat;
	}


	public void setRefContrat(String refContrat) {
		this.refContrat = refContrat;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}
	
	


}
