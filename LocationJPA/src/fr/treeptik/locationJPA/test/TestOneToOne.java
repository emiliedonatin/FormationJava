package fr.treeptik.locationJPA.test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import fr.treeptik.locationJPA.domain.Client;

@RunWith(JUnit4.class)
public class TestOneToOne {

	private static EntityManager entityManager = Persistence.createEntityManagerFactory("location").createEntityManager();

	@Test
	public void testSaveClientOk() {

		Client client = new Client(null, "nomCl", "adresse", "ville");

		entityManager.getTransaction().begin();
		entityManager.persist(client);
		entityManager.getTransaction().commit();

	}

}
