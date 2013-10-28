package fr.treeptik.locationJPA.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@DiscriminatorValue(value = "Voiture")
@Table(name = "voiture")
public class Voiture extends Vehicule implements Serializable {

	private static final long serialVersionUID = 1L;

	

	@Column(name = "cumul_reparation")
	private Integer cumulReparation;

	private Boolean disponible;

	@ManyToOne
	@JoinColumn(name = "code_type")
	private TypeVoiture typeVoiture;
	
	@OneToMany (mappedBy="voiture")
	private List<Reparations> reparations;
	
	@ElementCollection
	@CollectionTable(name="tableOpt")
	private List<String> options;

	public Voiture() {

	}

	public Voiture(String noImmatriculation, Integer cumulReparation, Boolean disponible, TypeVoiture typeVoiture, List<Reparations> reparations, List<String> options) {
		super();
		
		this.cumulReparation = cumulReparation;
		this.disponible = disponible;
		this.typeVoiture = typeVoiture;
		this.reparations = reparations;
		this.options = options;
	}
	

	public Integer getCumulReparation() {
		return cumulReparation;
	}

	public void setCumulReparation(Integer cumulReparation) {
		this.cumulReparation = cumulReparation;
	}

	public Boolean getDisponible() {
		return disponible;
	}

	public void setDisponible(Boolean disponible) {
		this.disponible = disponible;
	}

	public TypeVoiture getTypeVoiture() {
		return typeVoiture;
	}

	public void setTypeVoiture(TypeVoiture typeVoiture) {
		this.typeVoiture = typeVoiture;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((cumulReparation == null) ? 0 : cumulReparation.hashCode());
		result = prime * result + ((disponible == null) ? 0 : disponible.hashCode());
		
		
		result = prime * result + ((typeVoiture == null) ? 0 : typeVoiture.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Voiture [cumulReparation=" + cumulReparation + ", disponible=" + disponible + ", typeVoiture=" + typeVoiture + "]";
	}

	public List<String> getOptions() {
		return options;
	}

	public void setOptions(List<String> options) {
		this.options = options;
	}

	

	
	
	
}
