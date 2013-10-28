package fr.treeptik.forfaittelephone;

import java.util.ArrayList;

public class PersonnePhysique extends Client {

	private String nom;
	private String prenom;

	public PersonnePhysique(String reference, Adresse adresse, ArrayList<Forfait> listeForfait, String nom, String prenom) {
		super(reference, adresse, listeForfait);
		this.nom = nom;
		this.prenom = prenom;
	}

	public PersonnePhysique() {
		// TODO Auto-generated constructor stub
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

	@Override
	public String toString() {
		return "PersonnePhysique [nom=" + nom + ", prenom=" + prenom + ", getReference()=" + getReference() + ", getAdresse()=" + getAdresse() + "]";
	}

	
	}


