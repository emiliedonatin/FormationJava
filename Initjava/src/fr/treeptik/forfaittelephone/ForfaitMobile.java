package fr.treeptik.forfaittelephone;

import java.util.Date;

public class ForfaitMobile extends Forfait{
	
	private String dureeAppel;
	private String nombreSMS;
	
	public ForfaitMobile(String reference, Date dateDebut, Date dateFin, String numero, String dureeAppel, String nombreSMS) {
		super(reference, dateDebut, dateFin, numero);
		this.dureeAppel = dureeAppel;
		this.nombreSMS = nombreSMS;
	}
	
	public ForfaitMobile() {
		// TODO Auto-generated constructor stub
	}

	public String getDureeAppel() {
		return dureeAppel;
	}

	public void setDureeAppel(String dureeAppel) {
		this.dureeAppel = dureeAppel;
	}

	public String getNombreSMS() {
		return nombreSMS;
	}

	public void setNombreSMS(String nombreSMS) {
		this.nombreSMS = nombreSMS;
	}

	@Override
	public String toString() {
		return "ForfaitMobile [dureeAppel=" + dureeAppel + ", nombreSMS=" + nombreSMS + ", reference=" + reference + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", numero=" + numero + "]";
	}
	
	

}
