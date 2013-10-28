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

import fr.treeptik.amazon.dao.CommentairesDAO;
import fr.treeptik.amazon.domain.Articles;
import fr.treeptik.amazon.domain.Auteurs;
import fr.treeptik.amazon.domain.Categories;
import fr.treeptik.amazon.domain.Commentaires;
import fr.treeptik.amazon.exception.DAOException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class TestCommentairesJDBCImpl {

	@Autowired
	private CommentairesDAO commentairesDAO;

	@Test
	public void testSaveCommentairesOk() throws ParseException {

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = dateFormat.parse("26/12/2008");
		ArrayList<Commentaires> listCommentaires = new ArrayList<>();

		Categories categories = new Categories(1, null, null);

		Auteurs auteurs = new Auteurs(1, null, null, null, null);

		Articles articles = new Articles(1, categories, "artTitre", "artChapeau", "artContenu", date, auteurs, true, listCommentaires);

		Commentaires commentaires = new Commentaires(null, "comNom", "comEmail", "comTexte", date, true, articles);

		try {
			commentaires = commentairesDAO.save(commentaires);
			Assert.assertNotNull(commentaires);

		} catch (DAOException e) {

			Assert.fail(e.getMessage());

		}

	}

	@Test
	public void testRemoveCommentairesOk() {

		Commentaires commentaires = new Commentaires();
		commentaires.setComId(1);

		try {
			commentairesDAO.remove(commentaires);
		} catch (DAOException e) {

			Assert.fail(e.getMessage());
		}
	}

}
