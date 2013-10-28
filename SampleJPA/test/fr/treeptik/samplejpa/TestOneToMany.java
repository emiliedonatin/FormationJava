package fr.treeptik.samplejpa;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import fr.treeptik.samplejpa.model.Client;
import fr.treeptik.samplejpa.model.Commande;


@RunWith (JUnit4.class)
public class TestOneToMany {
	
	private static EntityManager entityManager = Persistence.createEntityManagerFactory("basesamplejpa").createEntityManager();
	
	@Test
	public void saveCommande(){
		
		Client client = entityManager.find(Client.class, 7);
		Commande commande = new Commande(null, new Date(), 50.50, client );
		
		entityManager.getTransaction().begin();
		entityManager.persist(commande);
		entityManager.getTransaction().commit();
		
	}

	
	@Test
	public void find1(){
		
		// On doit vider le cache de l'entity manager avant de faire des requêtes pour voir les comportements par défaut
		entityManager.clear();
		
		System.out.println("********************** Find1 *********************");
		
		Client client = entityManager.find(Client.class, 7);
		
		for (Commande commande : client.getCommandes()) {
			
			System.out.println(commande.getId() + " " + commande.getTarif());
			
			// cette commande va executer 2 requêtes différentes car par défaut le find sur une liste est sur fetchType.LAZY (il ne rappatrie pas automatiquement les données des tables associées)
			
		}
		
		
	}
}
