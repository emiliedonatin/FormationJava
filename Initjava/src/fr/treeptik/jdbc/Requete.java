package fr.treeptik.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;

public class Requete {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver").newInstance();

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_manager", "root", "root");

		// on rentre dans la transaction pour enregistrer un employé et son
		// adresse
		connection.setAutoCommit(false);

		// on commence par enregistrer son adresse pour générer automatiquement
		// la clef primaire qui correspond à l'adresse_id
		PreparedStatement prepareStatement = connection.prepareStatement("insert into address (city) values (?)", Statement.RETURN_GENERATED_KEYS);

		prepareStatement.setString(1, "marseille");

		prepareStatement.executeUpdate();

		// on récupère la clef primaire générée pour l'adresse_id
		ResultSet keys = prepareStatement.getGeneratedKeys();

		keys.next();
		int key = keys.getInt(1);

		// on enregistre ensuite la personne en utilisant l'adresse_id
		// auto-générée au dessus
		java.sql.PreparedStatement prepareStatement2 = connection.prepareStatement("Insert into employee (name, adresse_id) values (?,?)");

		prepareStatement2.setString(1, "Doudoux");
		prepareStatement2.setInt(2, key);

		prepareStatement2.executeUpdate();

		// on sort de la transaction
		connection.commit();

		// on entre dans la transaction pour afficher les employés par leur nom
		// avec le détail des employés
		connection.setAutoCommit(false);

		// on demande à choisir toutes les colonnes de la table employee et on
		// veut un classement des noms par ordre alphabétique
		PreparedStatement preparedStatement3 = connection.prepareStatement("Select * From employee ORDER BY name");

		ResultSet resultSet = preparedStatement3.executeQuery();

		// on lui dit que tant que tu as des infos à lire tu exécutes les
		// commandes suivantes
		while (resultSet.next()) {

			System.out.println("ID : " + resultSet.getInt("id_employee"));
			System.out.println("Nom : " + resultSet.getString("name"));
			System.out.println("Salaire : " + resultSet.getInt("salary"));
			System.out.println("Date de début : " + resultSet.getDate("startdate"));

			System.out.println("***********************************************************");

			// on sort de la transaction
			connection.commit();

			
			
			
			connection.setAutoCommit(false);
			
			PreparedStatement preparedStatement5= connection.prepareStatement("select count(id_employee), adresse_id from employee WHERE adresse_id=10");
			
		
			ResultSet resultSet2 =preparedStatement5.executeQuery();
			resultSet2.next();
			System.out.println( resultSet2.getLong(1));

		
			PreparedStatement prepareStatement4 = connection.prepareStatement("delete employee, address from employee,address where employee.adresse_id=address.id and id_employee=8");

			prepareStatement4.executeUpdate();

			
			connection.commit();
			
			
			
			connection.setAutoCommit(false);
			
			PreparedStatement preparedStatement6 = connection.prepareStatement("update employee set id_manager=3 where id_employee=1");
			preparedStatement6.executeUpdate();
			
			connection.commit();

		}

	}
}
