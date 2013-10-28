package fr.treeptik.achatenligne;

public class Client {
	
	private String nom;
	private String prénom;
	private String numéroClient;
	private Caddie caddie;
	public Client(String nom, String prénom, String numéroClient, Caddie caddie) {
		super();
		this.nom = nom;
		this.prénom = prénom;
		this.numéroClient = numéroClient;
		this.caddie = caddie;
	}
	
	public Client() {
		// TODO Auto-generated constructor stub
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrénom() {
		return prénom;
	}

	public void setPrénom(String prénom) {
		this.prénom = prénom;
	}

	public String getNuméroClient() {
		return numéroClient;
	}

	public void setNuméroClient(String numéroClient) {
		this.numéroClient = numéroClient;
	}

	public Caddie getCaddie() {
		return caddie;
	}

	public void setCaddie(Caddie caddie) {
		this.caddie = caddie;
	}
	

}
