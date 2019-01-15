package com.hssDAO;

import java.util.ArrayList;
import java.util.List;

import com.hss.Person;

public class PersonDAO {

	// list of all the contestants
	List<Person> listOfPersons;

	// instance of PersonDAO
	public static PersonDAO instance;

	// constructor
	public PersonDAO() {
		listOfPersons = new ArrayList<>();
		listOfPersons.add(new Person(1, "Rob", "10-10-1995"));
		listOfPersons.add(new Person(2, "Adam", "10-11-1995"));
		listOfPersons.add(new Person(3, "Eve", "10-12-1995"));
		listOfPersons.add(new Person(4, "Mark", "11-12-1995"));
	}

	public static PersonDAO getInstance() {
		if (instance == null)
			instance = new PersonDAO();
		return instance;
	}

	public List<Person> getAllPersons() {
		return listOfPersons;
	}
	// Add or save a person or a new registration

	public boolean savePerson(Person newPerson) {
		List<Person> personList = getAllPersons();
		for (Person person : personList) {
			if (person.equals(newPerson))
				return false;
		}
		personList.add(newPerson);
		return true;
	}
	// delete a person
	public boolean deletePerson(int id) {
		List<Person> personList = getAllPersons();
		for (Person person : personList) {
			if (person.getId() == id) {
				int index = personList.indexOf(person);
				personList.remove(index);
				return true;
			}
		}
		return false;
	}
	// update a person
	public boolean updateUser(Person updatedPerson) {
		List<Person> personList = getAllPersons();
		for (Person person : personList) {
			if (person.getId() == updatedPerson.getId()) {
				int index = personList.indexOf(person);
				personList.set(index, updatedPerson);
				return true;
			}
		}
		return false;
	}

	public Person getPerson(int personId) {
		for (Person person : listOfPersons) {
			if (person.getId() == personId)
				return person;
		}
		return null;
	}
}
