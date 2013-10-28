package fr.treeptik.achatenligne;

public class Livre extends Articles{
	
	
	private Integer nombrePage;
	private Integer numeroISBN;
	
	
	public Livre (){}

	
		
	

	public Livre(String titre, String auteur_compositeur, Integer nombrePage, Integer numeroISBN) {
		super(titre, auteur_compositeur);
		this.nombrePage = nombrePage;
		this.numeroISBN = numeroISBN;
	}





	public Integer getNombrePage() {
		return nombrePage;
	}

	public void setNombrePage(Integer nombrePage) {
		this.nombrePage = nombrePage;
	}

	public Integer getNumeroISBN() {
		return numeroISBN;
	}

	public void setNumeroISBN(Integer numeroISBN) {
		this.numeroISBN = numeroISBN;
	}

	
	
	}
