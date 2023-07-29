package com.akash.spring.student;

public class Student {
	private Score scores;

	@Override
	public String toString() {
		return "Student [scores=" + scores + "]";
	}

	public Score getScores() {
		return scores;
	}

	public void setScores(Score scores) {
		this.scores = scores;
	}
	
	

}
