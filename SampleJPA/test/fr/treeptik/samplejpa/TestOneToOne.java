package fr.treeptik.samplejpa;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import fr.treeptik.samplejpa.model.Client;
import fr.treeptik.samplejpa.model.Contrat;



@RunWith(JUnit4.class)
public class TestOneToOne {
	
	private static  EntityManager entityManager = Persistence.createEntityManagerFactory("basesamplejpa").createEntityManager();
	
	@Test
	public void testSaveContrat(){
		
		Client client = new Client(null, "nom", "prenom", new Date(), null, null);
		Contrat contrat = new Contrat(null, "refContrat", client);
		
		entityManager.getTransaction().begin();
		entityManager.persist(client);
		entityManager.persist(contrat);
		entityManager.getTransaction().commit();
		
	}

	@Test
	public void testFindContrat(){
		
		Contrat contrat = entityManager.find(Contrat.class, 1);
		
		System.out.println("Ref : Contrat " + contrat.getRefContrat());
		System.out.println("Nom Client :" + contrat.getClient().getNom());
		
	}
	
	
	@Test
	public void testFindQuery(){
		
		System.out.println("************* Find Query ****************");
		
		
		// En une seule requête on va aller chercher le contrat et le client associé (cela est possible parce que on est en fetch LAZY)
		TypedQuery<Contrat> query = entityManager.createQuery("Select c From Contrat c Join Fetch c.client cli Where c.id= :id", Contrat.class);
		query.setParameter("id", 1);
		
		Contrat contrat = query.getSingleResult();
		
		System.out.println("Ref Contrat : " + contrat.getRefContrat());
		System.out.println("Nom Client : " + contrat.getClient().getNom());
		
	}
	
}
