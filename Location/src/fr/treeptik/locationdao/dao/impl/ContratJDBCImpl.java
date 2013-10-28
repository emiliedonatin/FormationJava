package fr.treeptik.locationdao.dao.impl;

import java.util.List;

import fr.treeptik.locationdao.dao.ContratDAO;
import fr.treeptik.locationdao.domain.Contrat;

public class ContratJDBCImpl implements ContratDAO{

	@Override
	public void save(Contrat contrat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Contrat contrat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Contrat findByNoContrat(Integer noContrat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contrat> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contrat> findByDate() {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public List<Contrat> findByDate() {
//		
//
//		ArrayList<Contrat> contrats = new ArrayList<>();
//		
//		
//		try {
//			Connection connection = ConnectionJDBC.getConnection();
//			PreparedStatement preparedStatement = connection.prepareStatement("Select * from contrat order by date_contrat");
//			
//			ResultSet resultSet = preparedStatement.executeQuery();
//			resultSet.next();
//			
//			while (resultSet.next()){
//				Contrat contrat = new Contrat(resultSet.getInt("nocontrat"), resultSet.getDate("date_contrat"), resultSet.getDate("date_enlevement"), resultSet.getDate("date_retour"), resultSet.getInt("codecl"), resultSet.getString(""))
//			}
//
//		
//		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
//			
//		}
//		return null;
//	}

}
