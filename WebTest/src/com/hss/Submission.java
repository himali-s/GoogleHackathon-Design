package com.hss;

public class Submission {
	
	int teamId;
	int submissionId;
	String programmingLanguage;

	// constructor
	public Submission() {
	}
	
	// constructor
	public Submission(int teamId, int submissionId, String programmingLanguage) {
		this.teamId = teamId;
		this.submissionId = submissionId;
		this.programmingLanguage = programmingLanguage;
	}
	
	// checks if two submissions are equal
	public boolean equals(Submission submission) {
		return this.submissionId == submission.submissionId;
	}
	
	// submission details
	public String toString() {
		return "Team Id: " + teamId + ", Submission  Id:" + submissionId + ", ProgrammingLanguage" + programmingLanguage;
	}

	public int getTeamId() {
		return teamId;
	}
}
