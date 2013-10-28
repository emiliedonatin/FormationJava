package fr.treeptik.gestionprojet.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="EMPLOYEE")
public class Employee implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private Integer id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="SALARY")
	private BigInteger salary;
	
	@Column(name="STARTDATE")
	@Temporal(TemporalType.DATE)
	private Date startDate;
	
	@OneToOne
	@JoinColumn(name="ADDRESS_ID")
	private Address address;
	
	@ManyToOne
	@JoinColumn(name="DEPARTMENT_ID")
	private Department department;
	
	@ManyToOne
	@JoinColumn(name="MANAGER_ID")
	private Employee managerId;
	
	@OneToMany (mappedBy="employee")
	private List<Phone> phones;
	
	@ManyToMany(mappedBy= "employees")
	private List<Project> projects;
	
	

	public Employee(Integer id, String name, BigInteger salary, Date startDate, Address address, Department department, Employee managerId) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.startDate = startDate;
		this.address = address;
		this.department = department;
		this.managerId = managerId;
	}

	public Employee() {
		
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

	public BigInteger getSalary() {
		return salary;
	}

	public void setSalary(BigInteger salary) {
		this.salary = salary;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Employee getManagerId() {
		return managerId;
	}

	public void setManagerId(Employee managerId) {
		this.managerId = managerId;
	}

	

	

	
	
	
	
	
}
