package fr.treeptik.locationdao.dao;

import fr.treeptik.locationdao.dao.impl.ClientJDBCImpl;
import fr.treeptik.locationdao.dao.impl.ContratJDBCImpl;
import fr.treeptik.locationdao.dao.impl.ReparationsJDBCImpl;
import fr.treeptik.locationdao.dao.impl.SupplementsJDBCImpl;
import fr.treeptik.locationdao.dao.impl.TypeVoitureJDBCImpl;
import fr.treeptik.locationdao.dao.impl.VoitureJDBCImpl;

public class DAOFactory {

	// on créer des singletons pour être sûr que chaque classeDAO ne sera bien créée qu'une seule fois dans notre programme complet
	 

	private static ClientDAO clientDAO;
	private static ContratDAO contratDAO;
	private static ReparationsDAO reparationsDAO;
	private static SupplementsDAO supplementsDAO;
	private static TypeVoitureDAO typeVoitureDAO;
	private static VoitureDAO voitureDAO;

	public static ClientDAO getClientDAO() {

		if (clientDAO == null) {

			clientDAO = new ClientJDBCImpl();
		}

		return clientDAO;
	}

	public static ContratDAO getContratDAO() {

		if (contratDAO == null) {

			contratDAO = new ContratJDBCImpl();
		}

		return contratDAO;
	}

	public static ReparationsDAO getReparationsDAO() {

		if (reparationsDAO == null) {

			reparationsDAO = new ReparationsJDBCImpl();
		}

		return reparationsDAO;
	}

	public static SupplementsDAO getSupplementsDAO() {

		if (supplementsDAO == null) {

			supplementsDAO = new SupplementsJDBCImpl();
		}

		return supplementsDAO;
	}

	public static TypeVoitureDAO getTypeVoitureDAO() {

		if (typeVoitureDAO == null) {

			typeVoitureDAO = new TypeVoitureJDBCImpl();
		}

		return typeVoitureDAO;
	}

	public static VoitureDAO getVoitureDAO() {

		if (voitureDAO == null) {

			voitureDAO = new VoitureJDBCImpl();
		}

		return voitureDAO;
	}

}
