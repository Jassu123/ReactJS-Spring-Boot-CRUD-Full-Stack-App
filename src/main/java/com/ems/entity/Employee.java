/**
 * 
 */
package com.ems.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author siva
 *
 */

@Entity
@Table(name = "EMPLOYEE_TB")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String firstName;

	private String lastName;

	private String emailId;

	public Employee() {

	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param emailId
	 */
	public Employee(String firstName, String lastName, String emailId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}
