package fr.treeptik.jeuxvideo;

public class Gourdin extends Arme {
	
	
	private Integer poids;

	public Gourdin(Integer pointDegat, Integer poids) {
		super(100);
		this.poids = poids;
		
	}
	
	public Gourdin() {
		
	}

	public Integer getPoids() {
		return poids;
	}

	public void setPoids(Integer poids) {
		this.poids = poids;
	}
	
	@Override
	public boolean equals (Object o){
		if (o instanceof Gourdin){
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
		return "Gourdin";
	}

}
