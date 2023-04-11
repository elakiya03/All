package com.java.springboot;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data //equivalent to code, setter, getter, requiredargsconstructor, tostring and  equalsandhashcode
@Entity
@Table(name = "employees")
public class Employee {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id;
	
	@Column(name ="email_id")
	@Email
	@NotNull(message ="email cannot be null")
	private String emailId;
	
	@NotNull(message ="first name cannot be null")
	@Size(message =" size should be minimun of 3 letter")
	@Column(name ="first_name", nullable =false)
	private String firstName;
	
	@NotNull(message ="last name cannot be null")
	@Size(message =" size should be minimun of 3 letter")
	@Column(name ="last_name")
	private String lastName;

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
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
	
	
}
	
	
	

