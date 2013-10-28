
package fr.treeptik.forfaittelephone;




public class Materiel {
	
	public enum Type{
		Smartphone, Box, Mobile
	}
	
	private String reference;
	private Type type;
	
	public Materiel(String reference, Type type) {
		super();
		this.reference = reference;
		this.type = type;
	}
	
	public Materiel() {
		// TODO Auto-generated constructor stub
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	

}
