package frr.treeptik.clientservice.runtime;

import fr.treeptik.clientservice.wsimport.Employe;
import fr.treeptik.clientservice.wsimport.Exception_Exception;
import fr.treeptik.clientservice.wsimport.ManagerWebService;
import fr.treeptik.clientservice.wsimport.ManagerWebServiceService;

public class Main {

	public static void main(String[] args) {
		
		ManagerWebServiceService service = new ManagerWebServiceService();
		ManagerWebService managerWebService = service.getManagerWebServicePort();
		
		Employe e = new Employe();
		e.setLogin("LoginWebService");
		e.setNom("NomWebService");
		e.setPrenom("PrenomWebService");
		e.setPassword("PasswordWebService");
		

		try {
			managerWebService.registerEmploye(e);
		} catch (Exception_Exception e1) {
				e1.printStackTrace();
		}
		
	}

}
