package fr.treeptik.locationJPA.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "supplements")
public class Supplements implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "codesupplement")
	private Integer codeSupplement;

	@Column(name = "libelle_supp")
	private String libelleSupp;

	@Column(name = "tarif_jour")
	private Integer tarifJour;

	public Supplements(Integer codeSupplement, String libelleSupp, Integer tarifJour) {
		super();
		this.codeSupplement = codeSupplement;
		this.libelleSupp = libelleSupp;
		this.tarifJour = tarifJour;
	}

	public Supplements() {

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
