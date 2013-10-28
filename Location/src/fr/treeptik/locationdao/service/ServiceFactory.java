package fr.treeptik.locationdao.service;

import fr.treeptik.locationdao.service.impl.ClientServiceImpl;

public class ServiceFactory {
	
	private static ClientService clientService = new ClientServiceImpl();
	
	public static ClientService geClientService(){
		
		return clientService;
	}

}
