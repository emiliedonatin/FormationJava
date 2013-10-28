package fr.treeptik.locationJPA.domain;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="Moto")
public class Moto extends Vehicule implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Moto() {
		super();
		
	}

	public Moto(String marque, String modele, String couleur) {
		super(marque, modele, couleur);
		
	}
	
	

}
