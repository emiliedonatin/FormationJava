package fr.treeptik.amazon.dao.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.treeptik.amazon.dao.ArticlesDAO;
import fr.treeptik.amazon.domain.Articles;
import fr.treeptik.amazon.domain.Auteurs;
import fr.treeptik.amazon.domain.Categories;
import fr.treeptik.amazon.domain.Commentaires;
import fr.treeptik.amazon.exception.DAOException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class TestArticlesJDBCImpl {

	@Autowired
	private ArticlesDAO articlesDAO;

	@Test
	public void testSaveArticlesOK() throws ParseException {

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = dateFormat.parse("25/08/2012");
		ArrayList<Commentaires> listCommentaires = new ArrayList<>();

		Categories categories = new Categories(1, null, null);

		Auteurs auteurs = new Auteurs(1, null, null, null, null);

		Articles articles = new Articles(null, categories, "artTitre", "artChapeau", "artContenu", date, auteurs, true, listCommentaires);

		try {

			articles = articlesDAO.save(articles);

			Assert.assertNotNull(articles);

		} catch (DAOException e) {

			Assert.fail(e.getMessage());

		}

	}

	@Test
	public void testRemoveArticlesOk() {

		Articles articles = new Articles();
		articles.setArtId(1);

		try {
			articlesDAO.remove(articles);

		} catch (DAOException e) {

			Assert.assertTrue(e.getMessage().contains("a foreign key constraint fails"));
		}

	}

}
