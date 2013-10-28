package fr.treeptik.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Contrat implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String numeroContrat;
	
	@Temporal(TemporalType.DATE)
	private Date dateDebutContrat;
	
	@Temporal(TemporalType.DATE)
	private Date dateFinContrat;
	
	private Boolean cdi;
	
	private String typeContrat;
	
	@OneToOne
	@JoinColumn(name="nom")
	private Employe employe;
	
	public Contrat() {
		
	}

	public Contrat(Integer id, String numeroContrat, Date dateDebutContrat, Date dateFinContrat, Boolean cdi, String typeContrat, Employe employe) {
		super();
		this.id = id;
		this.numeroContrat = numeroContrat;
		this.dateDebutContrat = dateDebutContrat;
		this.dateFinContrat = dateFinContrat;
		this.cdi = cdi;
		this.typeContrat = typeContrat;
		this.employe = employe;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumeroContrat() {
		return numeroContrat;
	}

	public void setNumeroContrat(String numeroContrat) {
		this.numeroContrat = numeroContrat;
	}

	public Date getDateDebutContrat() {
		return dateDebutContrat;
	}

	public void setDateDebutContrat(Date dateDebutContrat) {
		this.dateDebutContrat = dateDebutContrat;
	}

	public Date getDateFinContrat() {
		return dateFinContrat;
	}

	public void setDateFinContrat(Date dateFinContrat) {
		this.dateFinContrat = dateFinContrat;
	}

	public Boolean getCdi() {
		return cdi;
	}

	public void setAssurance(Boolean cdi) {
		this.cdi = cdi;
	}

	public String getTypeContrat() {
		return typeContrat;
	}

	public void setTypeContrat(String typeContrat) {
		this.typeContrat = typeContrat;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	
	
	
	
	
	
	
	
	
	

	
	


}
