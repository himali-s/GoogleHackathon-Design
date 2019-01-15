package com.hss;

import java.util.List;

// POJO class for team

public class Team {
	
	private int teamId;
	private List<Person> persons;
	private int numberOfMembers;
	
	public Team() {
	}
	
	// add team member to the team at once
	public Team(int teamId, List<Person> persons) {
		this.teamId = teamId;
		this.persons = persons;
		numberOfMembers = persons.size();
	}
	
	// add individual member to the team
	public boolean addTeamMember(Person person) {
		if(numberOfMembers == 3)
			return false;
		persons.add(person);
		numberOfMembers++;
		return true;
	}
	
	public int getId() {
		return teamId;
	}
	
	public int getNumberOfMembers() {
		return numberOfMembers;
	}
	
	public boolean equals(Team team) {
		return false;
	}
		
	public String toString() {
		String str = "TeamId: " + String.valueOf(teamId);
		for(Person person: persons) 
			str += "\n" + person;
		return str;
	}
}
