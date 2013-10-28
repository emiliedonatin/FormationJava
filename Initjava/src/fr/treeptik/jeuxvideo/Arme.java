package fr.treeptik.jeuxvideo;

public abstract class Arme {

	private Integer pointDegat;

	public Arme(Integer pointDegat) {
		super();
		this.pointDegat = pointDegat;
	}

	public Arme() {

	}

	public Integer getPointDegat() {
		return pointDegat;
	}

	public void setPointDegat(Integer pointDegat) {
		this.pointDegat = pointDegat;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pointDegat == null) ? 0 : pointDegat.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Arme other = (Arme) obj;
		if (pointDegat == null) {
			if (other.pointDegat != null)
				return false;
		} else if (!pointDegat.equals(other.pointDegat))
			return false;
		return true;
	}
	
	

}
