package fr.treeptik.forfaittelephone;

import java.util.ArrayList;



public class PersonneMorale extends Client {
	
	private String siret;
	private String codeAPE;
	public PersonneMorale(String reference, Adresse adresse, ArrayList<Forfait> listeForfait, String siret, String codeAPE) {
		super(reference, adresse, listeForfait);
		this.siret = siret;
		this.codeAPE = codeAPE;
	}
	
	public PersonneMorale() {
		// TODO Auto-generated constructor stub
	}

	public String getSiret() {
		return siret;
	}

	public void setSiret(String siret) {
		this.siret = siret;
	}

	public String getCodeAPE() {
		return codeAPE;
	}

	public void setCodeAPE(String codeAPE) {
		this.codeAPE = codeAPE;
	}

	@Override
	public String toString() {
		return "PersonneMorale [siret=" + siret + ", codeAPE=" + codeAPE + ", getReference()=" + getReference() + ", getAdresse()=" + getAdresse() + "]";
	}

	


	
	
	
}
