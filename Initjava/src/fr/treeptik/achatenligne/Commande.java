package fr.treeptik.achatenligne;

import java.util.ArrayList;

public class Commande {
	
	private Client client;
	private ArrayList<Articles> listeArticle;
	public Commande(Client client, ArrayList<Articles> listeArticle) {
		super();
		this.client = client; 
		this.listeArticle = listeArticle;
	}
	
	public Commande() {
		
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public ArrayList<Articles> getListeArticle() {
		return listeArticle;
	}

	public void setListeArticle(ArrayList<Articles> listeArticle) {
		this.listeArticle = listeArticle;
	}
	

}
