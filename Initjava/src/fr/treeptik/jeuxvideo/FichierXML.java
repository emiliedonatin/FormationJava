package fr.treeptik.jeuxvideo;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import fr.treeptik.initjava.jeurole.xml.Arme;
import fr.treeptik.initjava.jeurole.xml.ListPersonnage;
import fr.treeptik.initjava.jeurole.xml.Personnage;

public class FichierXML {

	
	public static void main(String[] args) throws JAXBException {
		
		// pour écrire un fichier
		
		JAXBContext context = JAXBContext.newInstance("fr.treeptik.initjava.jeurole.xml");
		
		Unmarshaller unmarshaller = context.createUnmarshaller();
		ListPersonnage listPersonnage = (ListPersonnage) unmarshaller.unmarshal(new File("personnages.xml"));
	
		System.out.println("Nb personnage :" + listPersonnage.getPersonnage().size());

		
//		pour lire un fichier on fait l'inverse :
		
		
		Personnage personnage = new Personnage();
		personnage.setType("M");
		personnage.setNbVie(100);
		
		fr.treeptik.initjava.jeurole.xml.Arme arme =new Arme();
		arme.setPoint(10);
		arme.setType("G");
		
		personnage.setArme(arme);
		
		listPersonnage.getPersonnage().add(personnage);
		
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(listPersonnage, new File("New personnage.xml"));
		
		
		
		
		
		
	}

}
