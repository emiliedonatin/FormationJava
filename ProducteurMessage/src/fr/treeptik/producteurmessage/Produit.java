package fr.treeptik.producteurmessage;

import java.io.Serializable;

public class Produit implements Serializable {


	private static final long serialVersionUID = 1L;

	private Integer id;
	private String reference;
	private String description;
	
	public Produit() {
		
	}

	public Produit(Integer id, String reference, String description) {
		super();
		this.id = id;
		this.reference = reference;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
