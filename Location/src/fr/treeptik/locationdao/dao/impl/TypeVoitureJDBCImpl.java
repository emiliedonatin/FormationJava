

package fr.treeptik.locationdao.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.treeptik.locationdao.dao.TypeVoitureDAO;
import fr.treeptik.locationdao.domain.TypeVoiture;
import fr.treeptik.locationdao.exception.DAOException;
import fr.treeptik.locationdao.utils.ConnectionJDBC;

public class TypeVoitureJDBCImpl implements TypeVoitureDAO {

	@Override
	public TypeVoiture save(TypeVoiture typeVoiture) throws DAOException {

		try {
			Connection connection = ConnectionJDBC.getConnection();

			PreparedStatement prepareStatement = connection.prepareStatement("Insert into type_voiture (code_type, description_type, places, prix_jour) value (?, ?, ?, ?)");

			prepareStatement.setString(1, typeVoiture.getCodeType());
			prepareStatement.setString(2, typeVoiture.getDescriptionType());
			prepareStatement.setInt(3, typeVoiture.getPlaces());
			prepareStatement.setInt(4, typeVoiture.getPrixJour());

			prepareStatement.executeUpdate();

		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {

			throw new DAOException(e.getMessage(), e);

		}

		return typeVoiture;
	}

	@Override
	public void remove(TypeVoiture typeVoiture) throws DAOException {

		try {
			Connection connection = ConnectionJDBC.getConnection();

			PreparedStatement prepareStatement = connection.prepareStatement("Delete from type_voiture where code_type=?");

			prepareStatement.setString(1, typeVoiture.getCodeType());

			prepareStatement.executeUpdate();

		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			throw new DAOException(e.getMessage(), e);
		}
	}

	@Override
	public TypeVoiture findByCodeType(String codeType) throws DAOException {

		TypeVoiture typeVoiture = null;
		try {
			Connection connection = ConnectionJDBC.getConnection();
			PreparedStatement prepareStatement = connection.prepareStatement("Select * from type_voiture where code_type=?");

			prepareStatement.setString(1, codeType);

			ResultSet executeQuery = prepareStatement.executeQuery();
			executeQuery.next();

			typeVoiture = new TypeVoiture(executeQuery.getString("code_type"), executeQuery.getString("description_type"), executeQuery.getInt("places"), executeQuery.getInt("prix_jour"));

		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {

			throw new DAOException(e.getMessage(), e);
		}

		return typeVoiture;
	}

	@Override
	public List<TypeVoiture> findAll() throws DAOException {

		ArrayList<TypeVoiture> voitures = new ArrayList<>();

		try {
			Connection connection = ConnectionJDBC.getConnection();
			PreparedStatement prepareStatement = connection.prepareStatement("Select * from type_voiture");

			ResultSet resultSet = prepareStatement.executeQuery();

			resultSet.next();

			while (resultSet.next()) {

				TypeVoiture typeVoiture = new TypeVoiture(resultSet.getString("code_type"), resultSet.getString("description_type"), resultSet.getInt("places"), resultSet.getInt("prix_jour"));
				voitures.add(typeVoiture);

			}

		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {

			throw new DAOException(e.getMessage(), e);

		}

		return voitures;

	}
}
