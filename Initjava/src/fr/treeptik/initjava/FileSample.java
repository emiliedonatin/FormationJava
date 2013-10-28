package fr.treeptik.initjava;

import java.io.File;
import java.io.IOException;

public class FileSample {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		File file = new File("monSuperFichier.txt"); // on crée un nouveau fichier 
		
		System.out.println("Exist ? : " + file.exists()); // pour le moment le fichier n'existe pas sur la machine donc la réponse est False
		
		file.createNewFile();
		
		System.out.println("Exist ? : " + file.exists()); // cette fois ci la réponse est vraie puisque le fichier a bien été crée
		
		
		System.out.println("Absolute Path : " + file.getAbsolutePath()); // permet d'afficher le chemin vers le fichier
		System.out.println("Canonical Path : " + file.getCanonicalPath()); // permet d'afficher le chemin en enlevant les "." et ".." qui ne servent à rien
		
		
		System.out.println("Parent : " + file.getParent()); // permet de donner le nom du fichier parent (mais ce nom de fichier parent doit être renseigné lors de la création du files sinon la réponse sera Null)
															// la réponse est juste une chaîne de caractères
		
		
		File parentFile = file.getParentFile(); // permet de créer l'objet parentFile qui permet d'utiliser d'autre méthodes que lorsqu'on a juste un string
		//System.out.println("Parent : " + parentFile.getCanonicalPath());
		
		
		System.out.println("Path Separator : " + File.pathSeparator);
		System.out.println("File Separator : " + File.separator);
		
		
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
