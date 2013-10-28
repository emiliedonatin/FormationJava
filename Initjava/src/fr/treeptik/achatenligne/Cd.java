package fr.treeptik.achatenligne;

public class Cd extends Articles{
	
	public enum Type{
		Rock, Classique, Techno
	}
	
	private Integer nombreChansons;
	private Integer durée;
	private Type type;
	
	public Cd (){
		
	}

	

	public Cd(String titre, String auteur_compositeur, Integer nombreChansons, Integer durée, Type type) {
		super(titre, auteur_compositeur);
		this.nombreChansons = nombreChansons;
		this.durée = durée;
		this.type = type;
	}


	
	

	public Integer getNombreChansons() {
		return nombreChansons;
	}

	public void setNombreChansons(Integer nombreChansons) {
		this.nombreChansons = nombreChansons;
	}

	public Integer getDurée() {
		return durée;
	}

	public void setDurée(Integer durée) {
		this.durée = durée;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	
}
