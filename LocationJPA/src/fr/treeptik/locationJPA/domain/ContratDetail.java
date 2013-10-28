package fr.treeptik.locationJPA.domain;

import java.io.Serializable;
import java.util.Date;

public class ContratDetail implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private Integer codeContrat;
	private String nomClient;
    private Date dateContrat;
    private String marqueVoiture;
    private String descriptionType;
	
    
    public ContratDetail( Integer codeContrat, String nomClient, Date dateContrat, String marqueVoiture, String descriptionType) {
		super();
		this.setCodeContrat(codeContrat);
		this.nomClient = nomClient;
		this.dateContrat = dateContrat;
		this.marqueVoiture = marqueVoiture;
		this.descriptionType = descriptionType;
	}
    
    public ContratDetail() {
		
	}

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public Date getDateContrat() {
		return dateContrat;
	}

	public void setDateContrat(Date dateContrat) {
		this.dateContrat = dateContrat;
	}

	public String getMarqueVoiture() {
		return marqueVoiture;
	}

	public void setMarqueVoiture(String marqueVoiture) {
		this.marqueVoiture = marqueVoiture;
	}

	public String getDescriptionType() {
		return descriptionType;
	}

	public void setDescriptionType(String descriptionType) {
		this.descriptionType = descriptionType;
	}

	public Integer getCodeContrat() {
		return codeContrat;
	}

	public void setCodeContrat(Integer codeContrat) {
		this.codeContrat = codeContrat;
	}

    
}
