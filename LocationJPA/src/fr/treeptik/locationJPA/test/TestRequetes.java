package fr.treeptik.locationJPA.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import fr.treeptik.locationJPA.domain.Client;
import fr.treeptik.locationJPA.domain.Contrat;
import fr.treeptik.locationJPA.domain.ContratDetail;
import fr.treeptik.locationJPA.domain.Reparations;
import fr.treeptik.locationJPA.domain.Voiture;

@RunWith(JUnit4.class)
public class TestRequetes {

	private static EntityManager entityManager = Persistence.createEntityManagerFactory("location").createEntityManager();

	@Test
	@Ignore
	public void testListClientParNom() {

		TypedQuery<Client> query = entityManager.createQuery("Select c From Client c Order By c.nomCl", Client.class);

		List<Client> clients = query.getResultList();
		for (Client client : clients) {
			System.out.println("Nom du client : " + client.getNomCl());
		}
	}

	@Test
	@Ignore
	public void testListContratDate() {

		TypedQuery<Contrat> query = entityManager.createQuery("Select c From Contrat c Order by c.dateContrat DESC", Contrat.class);

		List<Contrat> contrats = query.getResultList();
		for (Contrat contrat : contrats) {
			System.out.println("Détails du contrat : " + contrat);
		}
	}

	@Test
	@Ignore
	public void testContratParClient() {

		TypedQuery<Contrat> query = entityManager.createQuery("Select c FROM Contrat c WHERE c.client.codeCl= :codecl", Contrat.class);
		query.setParameter("codecl", 6);

		List<Contrat> contrats = query.getResultList();
		for (Contrat contrat : contrats) {
			System.out.println("**Nom Client : " + contrat.getClient().getNomCl() + " **Numéro du contrat : " + contrat.getNocontrat() + " **Date contrat : " + contrat.getDateContrat());
		}
	}

	@Test
	@Ignore
	public void testVoitureDispo() {

		TypedQuery<Voiture> query = entityManager.createQuery("Select v FROM Voiture v WHERE v.disponible= :disponible", Voiture.class);
		query.setParameter("disponible", true);

		List<Voiture> voitures = query.getResultList();
		for (Voiture voiture : voitures) {
			System.out.println("Liste des voitures disponibles : " + voiture.getModele());
		}

	}

	@Test
	@Ignore
	public void testListRepaParVoiture() {

		TypedQuery<Reparations> query = entityManager.createQuery("Select r FROM Reparations r WHERE r.voiture.noImmatriculation= :noimmatriculation", Reparations.class);
		query.setParameter("noimmatriculation", "AQ-546-QQ");

		List<Reparations> reparations = query.getResultList();
		for (Reparations reparations2 : reparations) {
			System.out.println("Cumul des réparations : " + reparations2.getVoiture().getCumulReparation());
		}

	}

	@Test
	@Ignore
	public void testRepMax() {

		Query query = entityManager.createQuery("Select r FROM Reparations r WHERE r.montantRepa= (SELECT MAX(r.montantRepa) FROM r)");

		Reparations reparations = new Reparations();

		reparations = (Reparations) query.getSingleResult();

		System.out.println("Réparations la plus chère : " + reparations.getMontantRepa());

	}

	@Test
	@SuppressWarnings("unchecked")
	@Ignore
	public void testVoitureByTypeVoiture() {

		Query query = entityManager.createQuery("SELECT ty.codeType, ty.descriptionType, COUNT(v) FROM TypeVoiture ty JOIN ty.voitures v GROUP BY ty.codeType");

		List<Object[]> resultList = query.getResultList();

		for (Object[] objects : resultList) {

			System.out.println("Code Type : " + objects[0] + " ***Description Type : " + objects[1] + " ***Nombre de Voiture : " + objects[2]);
		}
	}

	@Test
	@SuppressWarnings("unchecked")
	@Ignore
	public void testRepaByVoiture() {

		Query query = entityManager.createQuery("SELECT v.noImmatriculation, v.marque, COUNT(r) FROM Voiture v LEFT JOIN v.reparations r GROUP BY v.noImmatriculation");

		List<Object[]> resultList = query.getResultList();

		for (Object[] objects : resultList) {

			System.out.println("Numéro Immatriculation : " + objects[0] + " ***Marque : " + objects[1] + " ***Nombre de Réparation : " + objects[2]);
		}

	}

	@SuppressWarnings("unchecked")
	@Test
	@Ignore
	
	public void testRepaByTypeVoiture() {

		Query query = entityManager.createQuery("SELECT t.codeType, COUNT(r) FROM TypeVoiture t LEFT JOIN t.voitures v  LEFT JOIN v.reparations r GROUP BY t.codeType");

		List<Object[]> resultList = query.getResultList();

		for (Object[] objects : resultList) {

			System.out.println("Code Type : " + objects[0] + " ***Nombre de réparations : " + objects[1]);
		}

	}

	@Test
	public void testContratDetail(){
		
	
		// dans la requête on est obligé de mettre l'adresse de la class ContratDetail car elle n'est pas annotée
		TypedQuery<ContratDetail> query = entityManager.createQuery("SELECT new fr.treeptik.locationJPA.domain.ContratDetail" +
				"(con.nocontrat, cli.nomCl, con.dateContrat, v.marque, t.descriptionType) FROM Client cli JOIN cli.contrats con LEFT JOIN con.voiture v " +
				"LEFT JOIN v.typeVoiture t", ContratDetail.class);
		
		
		List<ContratDetail> contratDetails = query.getResultList();
		System.out.println(contratDetails.size());
		for (ContratDetail contratDetail : contratDetails) {
			System.out.println(contratDetail.getCodeContrat()+ " " + contratDetail.getNomClient()+ " " + contratDetail.getMarqueVoiture());
		}
		
	}
}