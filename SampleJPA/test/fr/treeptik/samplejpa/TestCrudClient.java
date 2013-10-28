package fr.treeptik.samplejpa;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import fr.treeptik.samplejpa.model.Client;

@RunWith(JUnit4.class)
public class TestCrudClient {

	private static EntityManager entityManager = Persistence.createEntityManagerFactory("basesamplejpa").createEntityManager();

	@Test
	
	public void testSaveClientOk() {

		Client client = new Client(null, "nom", "prenom", new Date(), null, null);

		// l'entity manager va rendre persistant l'objet client (c'est à dire qu'il va créer l'objet client)
		// l'entity manager n'existe que pour jpa (pour hibernate on parle de session)

		entityManager.getTransaction().begin();
		entityManager.persist(client);
		entityManager.getTransaction().commit();

	}

	@Test
	@Ignore
	public void testRemoveClientOK() {
		// cette requête ne permet de supprimer qu'un seul objet en fonction de la clé primaire

		Client client = entityManager.find(Client.class, 1);

		entityManager.getTransaction().begin();
		entityManager.remove(client);
		entityManager.getTransaction().commit();
	}

	@Test
	@Ignore
	public void testUpdateOk() {

		Client client = entityManager.find(Client.class, 2);

		entityManager.getTransaction().begin();

		client.setNom("New nom");
		client.setPrenom("New prenom");

		// Merge est la méthode qui sert à faire des mises à jour

		entityManager.merge(client);

		entityManager.getTransaction().commit();

	}

	@Test
	@Ignore
	public void testMerge() {

		// la fonction merge est capable de faire un update sur un objet qu'elle ne connait pas et également sur une clé primaire qui existe déjà
		// on peut faire merge sur une clé primaire qu'elle ne connaît pas et alors la fonction merge va insérer le nouveau client

		Client client = new Client(null, "nom2", "prenom2", new Date(), null, null);

		entityManager.getTransaction().begin();
		entityManager.merge(client);
		entityManager.getTransaction().commit();
	}

	@Test
	public void testQuery() {
		
		System.out.println("************** Find all ****************");

		TypedQuery<Client> query = entityManager.createQuery("Select c from Client c", Client.class);

		List<Client> clients = query.getResultList();
		for (Client client : clients) {
			System.out.println(client.getNom());
		}

	}

	@Test
	public void testQuery2() {
		
		System.out.println("************** Find by name ****************");

		TypedQuery<Client> query = entityManager.createQuery("Select c FROM Client c WHERE c.nom = :nom ", Client.class);
		query.setParameter("nom", "Client2");

		List<Client> clients = query.getResultList();
		for (Client client : clients) {
			System.out.println(client.getNom());
		}

	}
	
	
	// Lorsqu'on ne peut pas faire de typedQuery on ajoute une annotation @SuppressWarnings
	@SuppressWarnings("unchecked")
	@Test
	public void testQuery3() {
		
		System.out.println("************** Find by name and id ****************");

		Query query = entityManager.createQuery("Select c.id, c.nom From Client c Where c.nom = :nom ");
		query.setParameter("nom", "Client2");

		List<Object[]> resultList = query.getResultList();
		
		for (Object[] objects : resultList) {
			
		
			System.out.println("ID : " + objects[0] + "Nom : " + objects[1]);
		}
		}



	@Test
	@Ignore
	public void testQuery4() {
		
		System.out.println("************** Single result ****************");

		TypedQuery<Client> query = entityManager.createQuery("Select c From Client c Where c.id = :id ", Client.class);
		query.setParameter("id", 2);
		
		
		// On peut limiter le nombre de résultats affichés
		query.setFirstResult(0);
		query.setMaxResults(10);

		
		// le test getSingleResult doit obligatoirement retourner un résultat sinon il va déclencher une exception (une runtime exception)
		Client client = query.getSingleResult();
		
			System.out.println(client.getNom());
		

	}

	@Test
	@Ignore
	public void testQuery5() {
		
		System.out.println("************** Update ****************");

		Query query = entityManager.createQuery("Update Client c SET c.prenom= :prenom where c.nom= :nom");
		query.setParameter("prenom", "PRENOM");
		query.setParameter("nom", "Client2");

		entityManager.getTransaction().begin();
		query.executeUpdate();
		entityManager.getTransaction().commit();
		
		}
	
	
	@Test
	public void testQuery6() {
		
		System.out.println("************** Delete ****************");
		
		// Cette requête permet de supprimer plusieurs objets à la fois contrairement au remove
		// Cela permet aussi de supprimer des objets qui ne sont pas attachés sans être obligé de passer par une requête find

		Query query = entityManager.createQuery("Delete Client c where c.nom= :nom");
	
		query.setParameter("nom", "Client2");

		entityManager.getTransaction().begin();
		query.executeUpdate();
		entityManager.getTransaction().commit();
		
		}
}
