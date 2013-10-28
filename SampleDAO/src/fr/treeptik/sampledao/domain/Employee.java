package fr.treeptik.sampledao.domain;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	private String firstName;
	private String lastName;
	private Date birthday;
	private Integer id;

	public Employee(String firstName, String lastName, Date birthday, Integer id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
		this.id = id;
	}


	public Employee() {

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
}
