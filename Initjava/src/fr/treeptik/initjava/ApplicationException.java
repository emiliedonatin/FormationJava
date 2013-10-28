package fr.treeptik.initjava;

public class ApplicationException extends Exception { // une classe exception ne contient pas forcément de code 
													  //Le plus important est son nom qui indique ce qui s'est passé en cas d'erreur
	public ApplicationException(String message) {
	super(message);
}
}
