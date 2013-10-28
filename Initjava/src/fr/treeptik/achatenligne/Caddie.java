package fr.treeptik.achatenligne;

import java.util.ArrayList;

public class Caddie {
	
	private ArrayList<Articles> listeArticle;

	public Caddie(ArrayList<Articles> listeArticle) {
		super();
		this.listeArticle = listeArticle;
	}
	
	public Caddie() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Articles> getListeArticle() {
		return listeArticle;
	}

	public void setListeArticle(ArrayList<Articles> listeArticle) {
		this.listeArticle = listeArticle;
	}
	

}
