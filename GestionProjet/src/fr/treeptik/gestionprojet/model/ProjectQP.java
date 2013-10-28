package fr.treeptik.gestionprojet.model;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value= "QP")
public class ProjectQP extends Project implements Serializable{

	
	private static final long serialVersionUID = 1L;

	public ProjectQP() {
		
	}

	
	
	
	
}
