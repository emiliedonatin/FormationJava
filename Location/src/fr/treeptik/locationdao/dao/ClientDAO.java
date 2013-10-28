package fr.treeptik.locationdao.dao;

import java.util.ArrayList;
import java.util.List;

import fr.treeptik.locationdao.domain.Client;
import fr.treeptik.locationdao.exception.DAOException;

public interface ClientDAO {

	Client save(Client client) throws DAOException;

	void remove(Client client) throws DAOException;

	Client findByCodeCl(Integer codeCl) throws DAOException;

	List<Client> findAll() throws DAOException;

	ArrayList<Client> findbynom() throws DAOException;

}
