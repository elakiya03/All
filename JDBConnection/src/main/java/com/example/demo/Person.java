package com.example.demo;

public class Person {
	
	private int id;
	private String first_name;
	private String last_name;
	private String email_id;
	
	protected Person(int id,String firstname, String lastname, String email) {
		super();
		this.id= id;
		this.first_name = firstname;
		this.last_name = lastname;
		this.email_id = email;
	}
	
	protected Person() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return first_name;
	}

	public void setFirstname(String firstname) {
		this.first_name = firstname;
	}

	public String getLastname() {
		return last_name;
	}

	public void setLastname(String lastname) {
		this.last_name = lastname;
	}

	public String getEmail() {
		return email_id;
	}

	public void setEmail(String email) {
		this.email_id = email;
	}
	
//	@Override
//	public String toString() {
//		return first_name + " " + last_name + " :" + email_id;
//	}

}
