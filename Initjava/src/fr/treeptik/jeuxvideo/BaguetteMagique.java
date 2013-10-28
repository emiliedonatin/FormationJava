package fr.treeptik.jeuxvideo;

public class BaguetteMagique extends Arme {

	private Integer longueur;

	public BaguetteMagique(Integer pointDegat, Integer longueur) {
		super(500);
		this.longueur = longueur;
		
	}

	public BaguetteMagique() {

	}

	public Integer getLongueur() {
		return longueur;
	}

	public void setLongueur(Integer longueur) {
		this.longueur = longueur;
	}
	
	
	
	
	@Override
	public boolean equals (Object o){
		if (o instanceof BaguetteMagique){
		return true;
		}
		return false;
		}
	
	@Override
	public int hashCode(){
		return this.getClass().getName().hashCode();
	}
	

	@Override
	public String toString(){
		return "Baguette Magique";
	}
}
