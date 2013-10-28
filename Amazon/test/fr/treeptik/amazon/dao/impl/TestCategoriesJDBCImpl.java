package fr.treeptik.amazon.dao.impl;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.treeptik.amazon.dao.CategoriesDAO;
import fr.treeptik.amazon.domain.Categories;
import fr.treeptik.amazon.exception.DAOException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class TestCategoriesJDBCImpl {

	@Autowired
	private CategoriesDAO categoriesDAO;

	@Test
	@Ignore
	public void testSaveCategoriesOk() {

		Categories categories = new Categories(null, "catName", "catUrl");

		try {
			categoriesDAO.save(categories);
			Assert.assertNotNull(categories);

		} catch (DAOException e) {
			Assert.fail(e.getMessage());
		}
	}

	@Test
	@Ignore
	public void testRemoveCategoriesOk() {

		Categories categories = new Categories();
		categories.setCatId(1);

		try {
			categoriesDAO.remove(categories);
		} catch (DAOException e) {

			Assert.assertTrue(e.getMessage().contains("a foreign key constraint fails"));

		}

	}

	@Test
	@Ignore
	public void testFindByNoArticlesOk() {

		try {
			List<Categories> list = categoriesDAO.findByNoArticles();

			Assert.assertNotNull(list);

		} catch (DAOException e) {

			Assert.fail(e.getMessage());

		}
	}

	@Test
	@Ignore
	public void testFindByMoreArticlesOk() {

		try {
			List<Categories> findByMoreArticles = categoriesDAO.findByMoreArticles();

			Assert.assertNotNull(findByMoreArticles);

		} catch (DAOException e) {
			Assert.fail(e.getMessage());
		}
	}

	@Test
	public void testFindArtByCatOk() throws DAOException {

		try {

			Map<Categories, Long> hashMap =  categoriesDAO.findArtByCat();
			Assert.assertNotNull(hashMap);

			Set<Categories> keyset = hashMap.keySet();
			Assert.assertNotNull(keyset);
			
			for (Categories categories : keyset) {
				System.out.println(categories + " " + hashMap.get(categories));
			}
			
			
		} catch (DAOException e) {

			Assert.fail(e.getMessage());

		}

	}

}






