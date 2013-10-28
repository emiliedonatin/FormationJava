package fr.treeptik.forfaittelephone;

import java.util.Date;

public class ForfaitFixe extends Forfait {
	
	private Adresse adresse;

	public ForfaitFixe(String reference, Date dateDebut, Date dateFin, String numero, Adresse adresse) {
		super(reference, dateDebut, dateFin, numero);
		this.adresse = adresse;
	}
	
	public ForfaitFixe() {
		// TODO Auto-generated constructor stub
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "ForfaitFixe [adresse=" + adresse + ", reference=" + reference + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", numero=" + numero + "]";
	}
	
	

}
