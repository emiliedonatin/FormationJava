package fr.treeptik.locationJPA.DAOImpl;

import fr.treeptik.locationJPA.DAO.ClientDAO;
import fr.treeptik.locationJPA.domain.Client;

public class ClientDAOImpl extends GenericDAOImpl<Client, Integer> implements ClientDAO{
	

	public ClientDAOImpl(){
		
		super(Client.class);
	}
	
	
}
