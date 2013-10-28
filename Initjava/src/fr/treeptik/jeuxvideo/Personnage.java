package fr.treeptik.jeuxvideo;

public abstract class Personnage {

	private Integer nombreDeVie;
	private Integer age;
	private Arme armePredilection;
	private Arme armeActive;

	public Personnage(Integer nombreDeVie, Integer age, Arme armePredilection, Arme armeActive) {
		super();
		this.nombreDeVie = nombreDeVie;
		this.age = age;
		this.armePredilection = armePredilection;
		this.armeActive = armeActive;
	}

	public Personnage() {

	}

	public Integer getNombreDeVie() {
		return nombreDeVie;
	}

	public void setNombreDeVie(Integer nombreDeVie) {
		this.nombreDeVie = nombreDeVie;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Arme getArmePredilection() {
		return armePredilection;
	}

	public void setArmePredilection(Arme armePredilection) {
		this.armePredilection = armePredilection;
	}

	public Arme getArmeActive() {
		return armeActive;
	}

	public void setArmeActive(Arme armeActive) {
		this.armeActive = armeActive;
	}

	public Integer attaquer(Personnage personnage) {
		if (armeActive.equals(armePredilection)) {
			System.out.println(personnage);
			System.out.println(personnage.getNombreDeVie());
			System.out.println( armeActive.getPointDegat());
			
			personnage.setNombreDeVie(personnage.getNombreDeVie() - armeActive.getPointDegat());
		} else {
			personnage.setNombreDeVie(personnage.getNombreDeVie() - (armeActive.getPointDegat() / 2));
		}

		return personnage.getNombreDeVie();
	}

}
