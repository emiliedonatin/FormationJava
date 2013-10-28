package fr.treeptik.jeuxvideo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class MapPartie {

	/**
	 * @param args
	 * @throws 
 
	 */
	public static void main(String[] args) throws IOException {
		
		
		BaguetteMagique baguetteMagique = new BaguetteMagique();
		Epee epee = new Epee();
		Gourdin gourdin = new Gourdin();
		
		
		File file = new File("FichierPersonnage.txt");

		file.createNewFile();
		
		HashMap<String, ArrayList<Personnage>> mapPartie = new HashMap<>();
		
		
		Magicien merlin = new Magicien(1000, 178, baguetteMagique, gourdin, "Royaume des Cieux");
		Elfe bidule = new Elfe(1000, 601, gourdin, gourdin, "25 cm");
		Chevalier charlemagne = new Chevalier(1000, 25, epee, epee, true);
		Magicien oz = new Magicien(1000, 1125, baguetteMagique, baguetteMagique, "Royaume des dieux");
		Elfe bidouille = new Elfe(1000, 12, gourdin, baguetteMagique, "80 cm");
		Chevalier lancelot = new Chevalier(1000, 48, epee, gourdin, false);
		
		
		

	}

}
