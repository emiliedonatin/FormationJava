package fr.treeptik.initjava;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestJDBC {


	public static void main(String[] args) throws Exception {


		
 // pour établir la connection avec la db
		
		connection.setAutoCommit(false); // Porte d'entrée dans la transaction (permet de garantir que tout ce qui est entre les 2 commit est executable avant que les modifs soient enregistrées)
		
		
		PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO personne " + "(nom, prenom, datenaissance) Values (?, ?, ?)"); // on veut ajouter une personne dans notre db
		
		
	
		java.util.Date dateNaissance = new java.util.Date(); // on doit d'abord créer une date java.util.date avant de pouvoir utiliser une date mysql
		
		
		preparedStatement.setString(1, "PersonneNom1BIS"); // on va ajouter cette personne dans la base de données
		preparedStatement.setString(2, "PersonnePrenom1BIS");
		preparedStatement.setDate(3, new Date(dateNaissance.getTime())); // on utilise java.sql.date uniquement pour faire des requêtes mysql (sinon on utilise java.util.date)
		
		
		preparedStatement.executeUpdate(); // envoie la commande pour une modification des données (sinon on peut faire une requête query qui sert à faire des recherches)
	
	
		preparedStatement = connection.prepareStatement("Select * From personne Where nom=?");
		preparedStatement.setString(1, "Torval");
		
		ResultSet resultSet = preparedStatement.executeQuery(); // cette commande permet de faire une recherche. Le resultset est un pointeur sur la db qui va permettre d'extraire les données
																// le resultset ne garde pas les données en mémoire
	
	
		while (resultSet.next()){ // tant que resultSet trouve des résultat il passe à la donnée suivante
			
			
			System.out.println("ID : " + resultSet.getInt("id"));
			System.out.println("Nom : " + resultSet.getString("Nom"));
			System.out.println("Prenom : " + resultSet.getString("Prenom"));
			System.out.println("Date naissance : " + resultSet.getDate("datenaissance"));
			
			System.out.println("***********************************************************");
			
		
		connection.commit(); // cette commande permet de sortir de la transaction
		
		}
	
	
	}
	
	
	

}
