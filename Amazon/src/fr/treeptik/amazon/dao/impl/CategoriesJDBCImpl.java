package fr.treeptik.amazon.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysql.jdbc.Statement;

import fr.treeptik.amazon.dao.CategoriesDAO;
import fr.treeptik.amazon.domain.Categories;
import fr.treeptik.amazon.exception.DAOException;
import fr.treeptik.amazon.util.ConnectionUtil;

@Repository
public class CategoriesJDBCImpl implements CategoriesDAO {

	@Autowired
	private ConnectionUtil connectionUtil;

	@Override
	public Categories save(Categories categories) throws DAOException {

		try {
			Connection connection = connectionUtil.getConnection();
			PreparedStatement prepareStatement = connection.prepareStatement("Insert into categories (cat_name, cat_url) values (?, ?)", Statement.RETURN_GENERATED_KEYS);

			prepareStatement.setString(1, categories.getCatName());
			prepareStatement.setString(2, categories.getCatUrl());

			prepareStatement.executeUpdate();

			ResultSet resultSet = prepareStatement.getGeneratedKeys();

			resultSet.next();

			categories.setCatId(resultSet.getInt(1));

		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {

			throw new DAOException(e.getMessage(), e);
		}

		return categories;
	}

	@Override
	public void remove(Categories categories) throws DAOException {

		try {
			Connection connection = connectionUtil.getConnection();

			PreparedStatement prepareStatement = connection.prepareStatement("Delete from categories where cat_id=?");

			prepareStatement.setInt(1, categories.getCatId());

			prepareStatement.executeUpdate();

		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {

			throw new DAOException(e.getMessage(), e);

		}

	}

	@Override
	public List<Categories> findByNoArticles() throws DAOException {

		ArrayList<Categories> list = new ArrayList<>();
		try {
			Connection connection = connectionUtil.getConnection();
			PreparedStatement prepareStatement = connection.prepareStatement("Select c.cat_id, c.cat_name, c.cat_url from categories c left join articles a on a.cat_id = c.cat_id where not exists (select * from articles where a.cat_id=cat_id)");

			ResultSet resultSet = prepareStatement.executeQuery();

			while (resultSet.next()) {

				Categories categories = new Categories(resultSet.getInt("cat_id"), resultSet.getString("cat_name"), resultSet.getString("cat_url"));

				list.add(categories);

			}
		} catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {

			throw new DAOException(e.getMessage(), e);
		}

		return list;

	}

	@Override
	public List<Categories> findByMoreArticles() throws DAOException {
		
		ArrayList<Categories> listCategories = new ArrayList<>();
		
		try {
			Connection connection = connectionUtil.getConnection();
			PreparedStatement prepareStatement = connection.prepareStatement("Select cat.cat_id, cat.cat_name , cat.cat_url, count(art.cat_id) as 'nbArticle' from categories cat left join articles art on cat.cat_id=art.cat_id group by cat.cat_name  HAVING COUNT(art.cat_id) = (Select max(t.nombrearticles) from (Select c.cat_id, count(a.cat_id) as 'nombrearticles' from categories c left join articles a on c.cat_id=a.cat_id group by c.cat_name order by (nombrearticles)) t )");
			
			ResultSet resultSet = prepareStatement.executeQuery();
			
			while(resultSet.next()){
				
				Categories categories = new Categories(resultSet.getInt("cat_id"), resultSet.getString("cat_name"), resultSet.getString("cat_url"));
				
				listCategories.add(categories);
			}
			
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
		
			throw new DAOException(e.getMessage(), e);
		}
		
		return listCategories;
	}

	@Override
	public Map<Categories, Long> findArtByCat() throws DAOException {
		
		HashMap<Categories, Long> hashMap = new HashMap<>();
		
		try {
			
			Connection connection = connectionUtil.getConnection();
			PreparedStatement prepareStatement = connection.prepareStatement("Select c.cat_id, c.cat_name, c.cat_url, count(a.cat_id) as 'nombrearticles' from categories c left join articles a on c.cat_id=a.cat_id group by c.cat_name order by (nombrearticles)");
		
			ResultSet resultSet = prepareStatement.executeQuery();
			
			while (resultSet.next()){
				
				Categories categories = new Categories(resultSet.getInt("cat_id"), resultSet.getString("cat_name"), resultSet.getString("cat_url"));
				
				hashMap.put(categories, resultSet.getLong("nombrearticles"));
			}
			
		
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			
			throw new DAOException(e.getMessage(), e);
			
		}
		
		
		return hashMap;
	}

}
