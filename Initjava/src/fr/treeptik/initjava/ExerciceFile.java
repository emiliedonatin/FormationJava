
package fr.treeptik.initjava; 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExerciceFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		

		File root = new File("/home/stagiaire/FormationJAVA/InitiationJAVA/Repertoire1");
		afficherRepertoire(root);
		
		
		//
		// Pour écrire dans un fichier
		//
		
		File fileToWrite = new File("/home/stagiaire/FormationJAVA/InitiationJAVA/Repertoire1/File1.txt"); // on assigne notre fichier existant File1.txt au nouveau nom fileToWriter
		
		FileWriter fileWriter = new FileWriter(fileToWrite, true); // on ouvre un objet qui va nous permettre d'écrire dans le fichier fileToWrite (qui est le fichier File1.txt)
																   // le true sert à écrire à la suite à chaque nouvelle exécution de l'appli (les anciennes données ne vont pas être écrasées)
		
		String retourLigne = System.getProperty("line.separator"); // permet d'aller récupèrer le caractère "retour à la ligne" qui est différent pour chaque système d'exploitation
		
		fileWriter.write("Super ligne 1" + retourLigne); // on va écrire dans le fichier
		fileWriter.write("Super ligne 2" + retourLigne);
		fileWriter.write("Super ligne 3" + retourLigne);
		
		
		fileWriter.close(); // on libère le fichier
		
		FileReader fileReader = new FileReader(fileToWrite);
		BufferedReader bufferedReader = new BufferedReader(fileReader); // permet de lire le fichier en intégrant la notion de ligne
		
		while (bufferedReader.ready()){ // tant que le bufferedReader a encore des lignes à lire
		
		System.out.println(bufferedReader.readLine());} // on lui dit d'afficher les lignes suivantes
		
		
		bufferedReader.close();

	}

	public static void afficherRepertoire(File root) {
		for (File file : root.listFiles()) {

			if (file.isDirectory()) {

				System.out.println(" ++ Repertoire : " + file);
				afficherRepertoire(file);
			} else {
				System.out.println(" ++ Fichier : " + file);
			}
		}
	}
}
