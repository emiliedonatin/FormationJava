package fr.treeptik.tpfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FichierTexte {

	public static void main(String[] args) throws IOException {

		// Ecriture dans un fichier

		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/stagiaire/FormationJAVA/InitiationJAVA/FicherTP.txt"));

		bufferedWriter.write("Bonjour tout le monde");
		bufferedWriter.newLine();
		bufferedWriter.write("bonne journée");
		bufferedWriter.newLine();
		bufferedWriter.write("ma super chaine1");
		bufferedWriter.newLine();
		bufferedWriter.write("ma super chaine 2");

		bufferedWriter.close();

		// Lecture d'un fichier

		FileReader fileReader = new FileReader("/home/stagiaire/FormationJAVA/InitiationJAVA/FicherTP.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		while (bufferedReader.ready()) {

			System.out.println(bufferedReader.readLine());
		}

		bufferedReader.close();

		File fileOrigine = new File("/home/stagiaire/FormationJAVA/InitiationJAVA/FicherOrigine.txt");
		fileOrigine.createNewFile();

		File fileDestination = new File("/home/stagiaire/FormationJAVA/InitiationJAVA/FicherDestination.txt");
		fileDestination.createNewFile();

		copierFichier(fileOrigine, fileDestination);

		// Sérialiser un objet

		Personne personne = new Personne("Doudoux", "Jean-Michel", "06.53.85.95.78");
		File file = new File("/home/stagiaire/FormationJAVA/InitiationJAVA/FicherSerialisation2.txt");
		file.createNewFile();
		
			FileOutputStream fileOutputStream = new FileOutputStream("/home/stagiaire/FormationJAVA/InitiationJAVA/FicherSerialisation.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(personne);
			objectOutputStream.flush();
			objectOutputStream.close();
	
			
		

		// désérialiser un objet

		try {
			FileInputStream fileInputStream = new FileInputStream("/home/stagiaire/FormationJAVA/InitiationJAVA/FicherSerialisation.txt");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			Personne personne2 = (Personne) objectInputStream.readObject();
			System.out.println("Personne : ");
			System.out.println("nom : " + personne.getNom());
			System.out.println("prenom : " + personne.getPrenom());
			System.out.println("telephone : " + personne.getNumero());
			
			
			objectInputStream.close();

		}

		catch (java.io.IOException e) {
			e.printStackTrace();
		}

		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		

	}

	// méthode pour copier un fichier dans un autre en utilisant le FileChannel

	public static void copierFichier(File fileOrigine, File fileDestination) throws IOException {

		FileInputStream fileInputStream = new FileInputStream(fileOrigine);
		FileOutputStream fileOutputStream = new FileOutputStream(fileDestination);

		java.nio.channels.FileChannel channelOrigine = fileInputStream.getChannel();
		java.nio.channels.FileChannel channelDestination = fileOutputStream.getChannel();

		channelOrigine.transferTo(0, channelOrigine.size(), channelDestination);

		fileInputStream.close();
		fileOutputStream.close();

	}

}
