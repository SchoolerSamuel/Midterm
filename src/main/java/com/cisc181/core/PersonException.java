package com.cisc181.core;


public class PersonException extends Exception {
	private Person Person;
	
	public Person getPerson() {
		return Person;
	}

	public PersonException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonException(String arg0, Person person) {
		super();
		this.Person = person;
	}

	
	
	
	
	
	
	
}
