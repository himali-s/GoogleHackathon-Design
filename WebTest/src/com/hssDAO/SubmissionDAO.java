package com.hssDAO;

import java.util.ArrayList;
import java.util.List;

import com.hss.Submission;
import com.hssHelper.Constants;

public class SubmissionDAO {

	List<Submission> listOfSubmissions;
	
	public static SubmissionDAO instance;
	
	// constructor
	public SubmissionDAO() {
		listOfSubmissions = new ArrayList<>();
	}

	// returns instance of the submission DAO
	public static SubmissionDAO getInstance() {
		if (instance == null)
			instance = new SubmissionDAO();
		return instance;
	}	
	
	public boolean addSubmission(Submission submission) {
		int counter = 0;
		for(Submission s: listOfSubmissions) {
			if(s.getTeamId() == submission.getTeamId())
				counter++;
		}
		if(counter < Constants.MAX_SUBMISSIONS){
			listOfSubmissions.add(submission);
			return true;
		}
		return false;
	}
}
