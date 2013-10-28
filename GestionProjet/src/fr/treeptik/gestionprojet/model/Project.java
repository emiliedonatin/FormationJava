package fr.treeptik.gestionprojet.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="DTYPE")
@Table(name="PROJECT")
public abstract class Project implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private Integer id;
	
	@Column(name="NAME")
	private String name;
	
	@ManyToMany
	@JoinTable(name= "PROJECT_EMPLOYEE", joinColumns= @JoinColumn(name= "PROJECTS_ID"), inverseJoinColumns= @JoinColumn(name= "EMPLOYEES_ID"))
	private List<Employee> employees;
	
	public Project(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Project() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
