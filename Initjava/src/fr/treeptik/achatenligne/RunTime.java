package fr.treeptik.achatenligne;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

import fr.treeptik.forfaittelephone.Adresse;
import fr.treeptik.forfaittelephone.Forfait;
import fr.treeptik.forfaittelephone.ForfaitFixe;
import fr.treeptik.forfaittelephone.ForfaitMobile;
import fr.treeptik.forfaittelephone.PersonneMorale;
import fr.treeptik.forfaittelephone.PersonnePhysique;

public class RunTime {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// Gestion du fichier client
		
		File fichierClient = new File("fichierClient.txt");
		fichierClient.createNewFile();

		Adresse adresse1 = new Adresse("13120", "gardanne", "rue blanche");
		Date dateDebut1 = new Date();
		Date dateFin1 = new Date();
		Forfait forfait1 = new ForfaitMobile("54845", dateDebut1, dateFin1, "0658694712", "2 heures", "illimite");
		Forfait forfait11 = new ForfaitMobile("6548", dateDebut1, dateFin1, "06654688", "5 heures", "150");
		ArrayList<Forfait> listeForfaits1 = new ArrayList<>();
		listeForfaits1.add(forfait1);
		listeForfaits1.add(forfait11);

		PersonnePhysique personnePhysique1 = new PersonnePhysique("12345", adresse1, listeForfaits1, "Mouse", "Mickey");

		Adresse adresse2 = new Adresse("13120", "gardanne", "rue verte");
		Date dateDebut2 = new Date();
		Date dateFin2 = new Date();
		Forfait forfait2 = new ForfaitMobile("54846", dateDebut2, dateFin2, "0658694713", "2 heures", "illimite");
		Forfait forfait22 = new ForfaitMobile("6548", dateDebut2, dateFin2, "06648988", "5 heures", "150");
		ArrayList<Forfait> listeForfaits2 = new ArrayList<>();
		listeForfaits2.add(forfait2);
		listeForfaits2.add(forfait22);

		PersonnePhysique personnePhysique2 = new PersonnePhysique("48747", adresse2, listeForfaits2, "Mouse", "Minnie");

		Adresse adresse3 = new Adresse("13120", "gardanne", "rue rouge");
		Date dateDebut3 = new Date();
		Date dateFin3 = new Date();
		Forfait forfait3 = new ForfaitFixe("468745", dateDebut3, dateFin3, "0647951523", adresse3);
		Forfait forfait33 = new ForfaitMobile("484", dateDebut3, dateFin3, "0664555358988", "illimite", "illimite");
		ArrayList<Forfait> listeForfaits3 = new ArrayList<>();
		listeForfaits3.add(forfait3);
		listeForfaits3.add(forfait33);

		PersonneMorale personneMorale3 = new PersonneMorale("54668", adresse3, listeForfaits3, "564684", "644897");

		System.out.println("Client 3 : " + personneMorale3.getListeForfait());

		Scanner scanner = new Scanner(System.in);

		System.out.println("******* Bienvenue chez Treeptik Telecom ***********");

		System.out.println("Saisir rue :");
		String saisieRue = scanner.nextLine();
		System.out.println("Saisir ville :");
		String saisieVille = scanner.nextLine();
		System.out.println("Saisir CP :");
		String saisieCP = scanner.nextLine();
		System.out.println("Saisir reference client :");
		String saisieRefClient = scanner.nextLine();
		System.out.println("Saisir type forfait :");
		String saisieTypeForfait = scanner.nextLine();
		System.out.println("Saisir type personne :");
		String saisieTypePersonne = scanner.nextLine();

		Adresse adresseClient1 = new Adresse(saisieCP, saisieVille, saisieRue);
		String stringAdresse = adresseClient1.getRue() + ":" + adresseClient1.getVille() + ":" + adresseClient1.getCodePostal();

		ArrayList<Forfait> listeForfait = null;

		PersonneMorale morale = new PersonneMorale();
		PersonnePhysique physique = new PersonnePhysique();

		if (saisieTypePersonne.equalsIgnoreCase("morale")) {
			System.out.println("Saisir SIIRET");
			String saisieSIRET = scanner.nextLine();
			System.out.println("Saisir Code APE");
			String saisieAPE = scanner.nextLine();

			morale.setAdresse(adresseClient1);
			morale.setCodeAPE(saisieAPE);
			morale.setSiret(saisieSIRET);
			morale.setReference(saisieRefClient);
			System.out.println(morale);

			String stringMorale = "M:" + morale.getReference() + ":" + morale.getSiret() + ":" + morale.getCodeAPE() + ":" + stringAdresse;
			ecrireFichier(stringMorale, fichierClient);

		} else if (saisieTypePersonne.equalsIgnoreCase("physique")) {
			System.out.println("Saisir nom");
			String saisieNom = scanner.nextLine();
			System.out.println("Saisir prenom");
			String saisiePrenom = scanner.nextLine();

			physique.setAdresse(adresseClient1);
			physique.setListeForfait(listeForfait);
			physique.setNom(saisieNom);
			physique.setPrenom(saisiePrenom);
			physique.setReference(saisieRefClient);
			System.out.println(physique);

			String stringPhysique = "P:" + physique.getReference() + ":" + physique.getNom() + ":" + physique.getPrenom() + ":" + stringAdresse;
			ecrireFichier(stringPhysique, fichierClient);
		}

		
		FileReader lireFichier = new FileReader(fichierClient);
		BufferedReader bufferedReader = new BufferedReader(lireFichier);
		
		String lecture = new String();
		
		while (bufferedReader.ready()){
			
			lecture = bufferedReader.readLine();
			
			String[] stringTab = lecture.split(":");
			
			String typePersonne = stringTab[0];
			
			ArrayList lite = new ArrayList<>(Arrays.asList(stringTab));
			
			Adresse adresseLecture = new Adresse();
			adresseLecture.setCodePostal(stringTab[4]);
			adresseLecture.setVille(stringTab[5]);
			adresseLecture.setRue(stringTab[6]);
			
			if("M".equalsIgnoreCase(typePersonne)){
				
				PersonneMorale personneMorale = new PersonneMorale();
				personneMorale.setReference(stringTab[1]);
				personneMorale.setSiret(stringTab[2]);
				personneMorale.setCodeAPE(stringTab[3]);
				personneMorale.setAdresse(adresseLecture);
				
				System.out.println(personneMorale);
				
			}else if("P".equalsIgnoreCase(typePersonne)){
				
				PersonnePhysique personnePhysique = new PersonnePhysique();
				personnePhysique.setReference(stringTab[1]);
				personnePhysique.setNom(stringTab[2]);
				personnePhysique.setPrenom(stringTab[3]);
				personnePhysique.setAdresse(adresseLecture);
				
				System.out.println(personnePhysique);
				
			}
			
			
			
		}
		
		
		bufferedReader.close();
	}

	
	public static void ecrireFichier(String string, File file) throws IOException {
		

			FileWriter listing = new FileWriter(file, true);
			String retourLigne = System.getProperty("line.separator");
			listing.write(string + retourLigne);
			listing.close();

		}
		
	
		
	}
	
	


