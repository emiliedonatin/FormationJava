package fr.treeptik.producteurmessage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.TextMessage;
import javax.naming.InitialContext;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import fr.treeptik.producteurmessage.xml.ListProduit;
import fr.treeptik.producteurmessage.xml.Produit;

public class Producteur {

	public static void main(String[] args) throws Exception {
		
		// InitialContext est l'objet qui permet de faire des recherches dans l'annuaire JNDI du serveur
		InitialContext context = new InitialContext();
		
		//	context.lookup(name) permet de rechercher vraiment dans l'annuaire JNDI
		Queue queue = (Queue) context.lookup("queue/test");

		//	la factory permet de récuperer la connection avec la queue
		QueueConnectionFactory factory = (QueueConnectionFactory) context.lookup("ConnectionFactory");
		QueueConnection connection = factory.createQueueConnection();
		QueueSession session = connection.createQueueSession(false, QueueSession.AUTO_ACKNOWLEDGE);
		//	c'est le sender qui va envoyer des messages
		QueueSender sender = session.createSender(queue);

//		ici on envoie un message texte
//		TextMessage message = session.createTextMessage("Hello JMS");
//		sender.send(message);

         //	ici on envoie un objet serialisable
		
//		 Produit produit = new Produit(1, "Produit1", "Super produit 1");
//		 ObjectMessage message = session.createObjectMessage(produit);
//		 sender.send(message);
		
		//	Pour l'envoi de fichier xml
		JAXBContext jaxbContext = JAXBContext.newInstance("fr.treeptik.producteurmessage.xml");
		
		ListProduit listProduit = new ListProduit();
		Produit produit = new Produit();
		produit.setDescription("Huile d'olive");
		produit.setReference("123456");
		listProduit.getProduit().add(produit);
		
		produit = new Produit();
		produit.setDescription("Savon de Marseille");
		produit.setReference("2165431");
		listProduit.getProduit().add(produit);
		
		produit = new Produit();
		produit.setDescription("Navettes");
		produit.setReference("54654");
		listProduit.getProduit().add(produit);
		
		//	Création du fichier produits.xml
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.marshal(produit, new File("produits.xml"));
		
		File fileLecture = new File("produits.xml");
		StringBuffer line = new StringBuffer();
		BufferedReader bufferedReader = new BufferedReader(new FileReader(fileLecture));
		while(bufferedReader.ready()){
			line.append(bufferedReader.readLine());
		}
		
		System.out.println(line.toString());
		bufferedReader.close();
		
		TextMessage textMessage = session.createTextMessage(line.toString());
		sender.send(textMessage);
		

		session.close();
		connection.close();
		System.out.println("Message envoyé");

	}

}
