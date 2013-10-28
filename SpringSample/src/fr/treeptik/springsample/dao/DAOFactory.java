package fr.treeptik.springsample.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.treeptik.springsample.dao.impl.ClientMemoryDAO;


// permet de reprendre la main sur les DAO Factory
@Configuration
public class DAOFactory {

	
	@Bean
	public ClientDAO getClientDAO(){
		
		//
		// Il faut écrire du code
		// par exemple pour lire dans un fichier de properties
		// Lecture en bases de données...
		//
		
		return new ClientMemoryDAO();
		
	}
	

}
