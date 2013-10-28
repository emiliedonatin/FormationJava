package fr.treeptik.tpfile.xml;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;


public class WriteRuntime {
	
	
	public static void main(String[] args) throws DatatypeConfigurationException {
		
		
		// conversion d'une date en gregorianCalendar
		
		Date now = new Date();
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		gregorianCalendar.setTime(now);
		
		DatatypeFactory factory = DatatypeFactory.newInstance(); // la classe datatypefactory est abstraite donc on fait newInstance au lieu de new normal
		
		XMLGregorianCalendar xmlGregorianCalendar = factory.newXMLGregorianCalendar(gregorianCalendar);
		
		
		// conversion d'un gregorianCalendar en date
		
		
		Date date2 = xmlGregorianCalendar.toGregorianCalendar().getTime();
		
		
		
		
		

		
//		Personne personne = new Personne();
//		personne.setNom("Doudoux");
//		personne.setPrenom("Jean-Michel");
//		
//		Date dateNaissance = new Date();
//		
//		
//		GregorianCalendar gregorianCalendar = new GregorianCalendar();
//		gregorianCalendar.setTime(dateNaissance);
//		
//		DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
//		
//		
//		XMLGregorianCalendar xmlGregorianCalendar = datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
//		
//		personne.setDateNaissance(xmlGregorianCalendar);
		
		
		
	}
	
	

	}


