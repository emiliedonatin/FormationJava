package fr.treeptik.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.ListDataModel;
import javax.faces.model.SelectItem;
import javax.inject.Inject;

import fr.treeptik.exception.ServiceException;
import fr.treeptik.model.Employe;
import fr.treeptik.service.EmployeService;

@ManagedBean(name = "employeMB")
@SessionScoped
public class EmployeManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private FacesContext facesContext;

	@Inject
	private EmployeService employeService;

	private Employe employe;

	private ListDataModel<Employe> dataModel;

	private List<SelectItem> itemEmploye = new ArrayList<>();

	@PostConstruct
	public void init() {
		setEmploye(new Employe());
	}

	public String register() throws Exception {
		
		employeService.update(employe);
		employe = new Employe();
		return "/employee/list";
		
		
		
		
		
		
//		try {
//			getEmployeService().save(getEmploye());
//			FacesMessage m = new FacesMessage(FacesMessage.SEVERITY_INFO, "Registered!", "Registration successful");
//			facesContext.addMessage(null, m);
//			init();
//		} catch (Exception e) {
//			FacesMessage m = new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getLocalizedMessage(), "Registration unsuccessful");
//			facesContext.addMessage(null, m);
//		}
	}

	public String updateEmployee() throws ServiceException {

		employe = dataModel.getRowData();

		return "/employee/create";

	}

	public String deleteEmployee() throws Exception {

		employe = dataModel.getRowData();
		getEmployeService().remove(employe);
		employe = new Employe();

		return "/employee/list";

	}

	public String listEmploye() {
		return "/employee/list";
	}

	public ListDataModel<Employe> getEmployeList() throws ServiceException {
		dataModel = new ListDataModel<Employe>(getEmployeService().findAll());
		return dataModel;

	}

	public List<SelectItem> getItemEmploye() throws ServiceException {
		List<Employe> allEmploye = getEmployeService().findAll();

		for (Employe employe : allEmploye) {

			itemEmploye.add(new SelectItem(employe.getId(), employe.getNom() + " - " + employe.getPrenom()));
		}

		return itemEmploye;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	public ListDataModel<Employe> getDataModel() {
		return dataModel;
	}

	public void setDataModel(ListDataModel<Employe> dataModel) {
		this.dataModel = dataModel;
	}

	public EmployeService getEmployeService() {
		return employeService;
	}

	public void setEmployeService(EmployeService employeService) {
		this.employeService = employeService;
	}

	public void setItemEmploye(List<SelectItem> itemEmploye) {
		this.itemEmploye = itemEmploye;
	}

}
