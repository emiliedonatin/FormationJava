package fr.treeptik.webservice;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;

import fr.treeptik.model.Employe;
import fr.treeptik.service.EmployeService;

@Stateless
@WebService
public class ManagerWebService {
	
	@Inject
	private EmployeService employeService;
	
	public void registerEmploye(Employe employe) throws Exception{
		
		employeService.save(employe);
		
	}

}
