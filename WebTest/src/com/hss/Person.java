package com.hss;

// POJO class for person/contestant

public class Person {

	private int id;
	private String name;
	private String dob;

	public Person() {
	}
	
	public int getId() {
		return id;
	}

	public Person(int id, String name, String dob) {
		this.id = id;
		this.name = name;
		this.dob = dob;
	}

	public boolean equals(Person person) {
		return (this.name == person.name) && (this.dob == person.dob);
	}
	
	public String toString() {
		return "Id: " + id + ", Name: " + name + ", Dob: " + dob;
	}
}
