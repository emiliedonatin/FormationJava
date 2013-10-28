package fr.treeptik.achatenligne;

public class Dvd extends Articles{
	
	public enum Type {
		Action, Comédie, Spectacle
		
	}
	
	
	private String acteurs;
	private Integer durée;
	private Type type;
	
	public Dvd (){
		
	}

	

	public Dvd(String titre, String auteur_compositeur, String acteurs, Integer durée, Type type) {
		super(titre, auteur_compositeur);
		this.acteurs = acteurs;
		this.durée = durée;
		this.type = type;
	}



	public String getActeurs() {
		return acteurs;
	}

	public void setActeurs(String acteurs) {
		this.acteurs = acteurs;
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
