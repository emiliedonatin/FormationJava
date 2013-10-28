package fr.treeptik.jeuxvideo;

public class Epee extends Arme {

	public enum Metal {

		ARGENT, OR, BRONZE, ETAIN
	}

	private Metal metal;

	public Epee(Integer pointDegat, Metal metal) {
		super(300);
		this.metal = metal;
		
	}

	public Epee() {
		
	}

	public Metal getMetal() {
		return metal;
	}

	public void setMetal(Metal metal) {
		this.metal = metal;
	}
	
	
	
	

	@Override
	public boolean equals (Object o){
		if (o instanceof Epee){
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
		return "Epee";
	}

}
