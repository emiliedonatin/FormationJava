package fr.treeptik.locationdao.domain;

import java.io.Serializable;

public class Supplements implements Serializable {


	private static final long serialVersionUID = 1L;
	
	private Integer codeSupplement;
	private String libelleSupp;
	private Integer tarifJour;
	
	public Supplements(Integer codeSupplement, String libelleSupp, Integer tarifJour) {
		super();
		this.codeSupplement = codeSupplement;
		this.libelleSupp = libelleSupp;
		this.tarifJour = tarifJour;
	}
	
	public Supplements() {
		// TODO Auto-generated constructor stub
	}

	public Integer getCodeSupplement() {
		return codeSupplement;
	}

	public void setCodeSupplement(Integer codeSupplement) {
		this.codeSupplement = codeSupplement;
	}

	public String getLibelleSupp() {
		return libelleSupp;
	}

	public void setLibelleSupp(String libelleSupp) {
		this.libelleSupp = libelleSupp;
	}

	public Integer getTarifJour() {
		return tarifJour;
	}

	public void setTarifJour(Integer tarifJour) {
		this.tarifJour = tarifJour;
	}
	
	
	
	

}
