package com.hssDAO;

import java.util.ArrayList;
import java.util.List;

import com.hss.Person;
import com.hss.Submission;
import com.hss.Team;
import com.hssHelper.Constants;

public class TeamDAO {
	
	// contains team id and the list of contestant
	List<Team> listOfTeams;
	
	// constructor
	public TeamDAO() {
		// demo team
		List<Person> list1 = new ArrayList<>();
		list1.add(new Person(1, "Rob", "10-10-1995"));
		listOfTeams.add(new Team(0, list1));
		
		// demo team
		List<Person> list2 = new ArrayList<>();
		list2.add(new Person(2, "Adam", "10-11-1995"));
		list2.add(new Person(3, "Eve", "10-12-1995"));
		listOfTeams.add(new Team(1, list2));
	}
	
	// create a team of size less than equal to 3
	public boolean createTeam(List<Person> persons) {
		// check if the number of team members does not exceed 3
		if(persons.size() > Constants.MAX_MEMBERS)
			return false;
		listOfTeams.add(new Team(listOfTeams.size(), persons));
		return true;
	}
	
	// add individual member to the team
	public boolean addTeamMember(int teamId, Person person) {
		for(Team team: listOfTeams) {
			// if valid team id is found
			if(team.getId() == teamId) {
				// check size of team
				if(team.getNumberOfMembers() == Constants.MAX_MEMBERS)
					return false;
				team.addTeamMember(person);
				return true;
			}
		}
		return false;
	}
	
	public boolean makeSubmission(int teamId, int submissionId, String programmingLanguage) {
		Submission submission = new Submission(teamId, submissionId, programmingLanguage);
		return SubmissionDAO.getInstance().addSubmission(submission);
	}
}
