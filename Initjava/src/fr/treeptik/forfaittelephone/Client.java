package fr.treeptik.forfaittelephone;

import java.util.ArrayList;

public abstract class Client {

	private String reference;
	private Adresse adresse;
	private ArrayList<Forfait> listeForfait;

	public Client(String reference, Adresse adresse, ArrayList<Forfait> listeForfait) {
		super();
		this.reference = reference;
		this.adresse = adresse;
		this.listeForfait = listeForfait;
	}

	public Client() {
		// TODO Auto-generated constructor stub
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public ArrayList<Forfait> getListeForfait() {
		return listeForfait;
	}

	public void setListeForfait(ArrayList<Forfait> listeForfait) {
		this.listeForfait = listeForfait;
	}

}
