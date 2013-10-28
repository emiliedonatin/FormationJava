package fr.treeptik.jeuxvideo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class) // permet de tester avec jUnit et de charger toutes les classes associées à jUnit

public class TestPersonnage {
	
	@Test(expected=NullPointerException.class)  // précise à jUnit qu'il s'agit d'un test de méthode
	                                            // permet également de préciser que notre méthode va déclencher une exception
	public void testAttaquerParamNull(){
		
		Magicien magicien = new Magicien(10, 458, new BaguetteMagique(), new BaguetteMagique(), "royaume");
		
		magicien.attaquer(null);
		
		
	}

	@Test
	
	public void testAttaquerOk(){
		

		Magicien magicien = new Magicien(10, 458, new BaguetteMagique(), new BaguetteMagique(), "royaume");
		Chevalier chevalier = new Chevalier(10, 58, new Epee(), new Epee(), true);
		
		int nbVie = magicien.attaquer(chevalier);
		
		Assert.assertEquals(0, nbVie);
		Assert.assertEquals(0, chevalier.getNombreDeVie().intValue());
		
	}
	
	
	
	
}
