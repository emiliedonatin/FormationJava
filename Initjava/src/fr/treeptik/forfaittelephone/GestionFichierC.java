package fr.treeptik.forfaittelephone;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GestionFichierC {

	public static void main(String[] args) throws IOException {

		// Test des classes en pré enregistrant des contacts:

		// Date date = new Date();
		// SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		// Adresse adresse1 = new Adresse("13000", "Marseille", "Rue Paradis");
		// Adresse adresse2 = new Adresse("94210", "Saint Maur",
		// "Rue du Succès");
		// Adresse adresse3 = new Adresse("75008", "Paris", "Rue de la paix");
		//
		// ForfaitFixe fixe1 = new ForfaitFixe("654321", date, date,
		// "0612457896", adresse1);
		// ForfaitFixe fixe2 = new ForfaitFixe("666666", date, date,
		// "0665986321", adresse2);
		//
		// ForfaitMobile mobile1 = new ForfaitMobile("896523", date, date,
		// "016352419", "120", "100");
		// ForfaitMobile mobile2 = new ForfaitMobile("741252", date, date,
		// "049156324", "200", "Illimité");
		// ArrayList<Forfait> listForfait1 = new ArrayList<>();
		//
		// listForfait1.add(fixe1);
		// listForfait1.add(mobile1);
		//
		// ArrayList<Forfait> listForfait2 = new ArrayList<>();
		// listForfait2.add(mobile2);
		//
		// for (Forfait forfait : listForfait1) {
		// System.out.println(forfait);
		//
		// }
		//
		// for (Forfait forfait : listForfait2) {
		// System.out.println(forfait);
		// }
		//
		// PersPhysique persPhysique1 = new PersPhysique("000", adresse1,
		// listForfait1, "TOTO", "Toto");
		// PersPhysique persPhysique2 = new PersPhysique("111", adresse2,
		// listForfait2, "TITI", "Titi");
		//
		// PersMorale persMorale1 = new PersMorale("222", adresse3,
		// listForfait1, "99887766A", "777B");

		
		
		
		// Manipulation des saisies utilisateurs


		File fichierC = new File("FichierClient.txt");
		fichierC.createNewFile();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Saisir la rue : ");
		String saisieRue = scanner.nextLine();

		System.out.println("Saisir le code postal : ");
		String saisieCP = scanner.nextLine();

		System.out.println("Saisir la ville : ");
		String saisieVille = scanner.nextLine();

		System.out.println("Saisir la référence client : ");
		String saisieRefClient = scanner.nextLine();

		System.out.println("Taper A si c'est un particulier, Taper B si c'est une entreprise : ");
		String saisieClient = scanner.nextLine();

		Adresse adresseClient1 = new Adresse(saisieCP, saisieVille, saisieRue);

		ArrayList<Forfait> listForfait = null;

		String stringAdresse = adresseClient1.getCodePostal() + ":" + adresseClient1.getVille() + ":" + adresseClient1.getRue();

		PersonneMorale morale = new PersonneMorale();
		PersonnePhysique physique = new PersonnePhysique();

		if (saisieClient.equalsIgnoreCase("B")) {
			System.out.println("Saisir numéro de SIRET : ");
			String saisieSiret = scanner.nextLine();
			System.out.println("Saisir code APE : ");
			String saisieApe = scanner.nextLine();

			morale.setAdresse(adresseClient1);
			morale.setCodeAPE(saisieApe);
			morale.setListeForfait(listForfait);
			morale.setReference(saisieRefClient);
			morale.setSiret(saisieSiret);

			String stringMorale = "M:" + morale.getReference() + ":" + morale.getSiret() + ":" + morale.getCodeAPE() + ":" + stringAdresse;
			ecrireFichier(stringMorale, fichierC);

		} else if (saisieClient.equalsIgnoreCase("A")) {
			System.out.println("Saisir nom :");
			String saisieNom = scanner.nextLine();
			System.out.println("Saisir prénom :");
			String saisiePrenom = scanner.nextLine();

			physique.setAdresse(adresseClient1);
			physique.setListeForfait(listForfait);
			physique.setNom(saisieNom);
			physique.setPrenom(saisiePrenom);
			physique.setReference(saisieRefClient);

			String stringPhysique = "P:" + physique.getReference() + ":" + physique.getNom() + ":" + physique.getPrenom() + ":" + stringAdresse;
			ecrireFichier(stringPhysique, fichierC);
		}

		scanner.close();
		
		
		//Lecture du fichier

		
		ArrayList<String> listLigne = lireFichier(fichierC);
		
		ArrayList<Client> clients = getClientsFromString(listLigne);
		
		for (Client client : clients) {
			System.out.println(client);
		}

		
		//Création fichier Forfait
		
		File fichierF = new File ("FichierForfait.txt");
		fichierF.createNewFile();
		
		Scanner scanner1 = new Scanner(System.in);

		System.out.println("Saisir la référence client : ");
		String saisieRefC = scanner1.nextLine();

		System.out.println("Saisir le type de forfait : ");
		String saisieRefF = scanner1.nextLine();

		System.out.println("Saisir la durée du forfait en minute : ");
		String saisieDuree = scanner1.nextLine();


		System.out.println("Taper A si c'est un forfait mobile, Taper B si c'est un forfait fixe : ");
		String saisieTypeforfait = scanner1.nextLine();

		
	}

	public static void ecrireFichier(String string, File file) throws IOException {

		FileWriter listing = new FileWriter(file, true);
		String retourLigne = System.getProperty("line.separator");

		listing.write(string + retourLigne);

		listing.close();

	}

	public static ArrayList<String> lireFichier(File file) throws IOException {

		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String lecture = "";
		ArrayList<String> liste = new ArrayList<>();
		while (bufferedReader.ready()) {
			
			lecture = bufferedReader.readLine();
			liste.add(lecture);

			
		}
		
		bufferedReader.close();
		return liste;
	}
	
	public static ArrayList<Client> getClientsFromString(ArrayList<String> listParam){
		
		
		ArrayList<Client> clients = new ArrayList<>();
		
		for (String string : listParam) {
			
			String[] param = string.split(":");
			String type = param[0];
			if (type.equalsIgnoreCase("P")){
				PersonnePhysique personnePhysique = new PersonnePhysique();
				personnePhysique.setReference(param[1]);
				personnePhysique.setNom(param[2]);
				personnePhysique.setPrenom(param[3]);
				
				Adresse adresse = new Adresse();
				
				adresse.setCodePostal(param[4]);
				adresse.setVille(param[5]);
				adresse.setRue(param[6]);
				
				personnePhysique.setAdresse(adresse);
				
				clients.add(personnePhysique);
				
				
			}else if (type.equalsIgnoreCase("M")){
				
				PersonneMorale personneMorale  = new PersonneMorale();
				personneMorale.setReference(param[1]);
				personneMorale.setSiret(param[2]);
				personneMorale.setCodeAPE(param[3]);
				
				Adresse adresse = new Adresse();
				
				adresse.setCodePostal(param[4]);
				adresse.setVille(param[5]);
				adresse.setRue(param[6]);
				
				personneMorale.setAdresse(adresse);
				
				clients.add(personneMorale);
				
			}
		}
		
		return clients;
		
	}
	
}