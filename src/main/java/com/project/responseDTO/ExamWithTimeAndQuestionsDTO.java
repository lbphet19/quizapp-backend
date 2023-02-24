package com.project.responseDTO;

import java.util.List;

import com.project.entity.Question;

public class ExamWithTimeAndQuestionsDTO {
	private int attemptId;
	private long countdown;
	private List<Question> questions;
	public long getCountdown() {
		return countdown;
	}
	public void setCountdown(long countdown) {
		this.countdown = countdown;
	}
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	
	public int getAttemptId() {
		return attemptId;
	}
	public void setAttemptId(int attemptId) {
		this.attemptId = attemptId;
	}
	public ExamWithTimeAndQuestionsDTO(int attemptId, long countdown, List<Question> questions) {
		super();
		this.attemptId = attemptId;
		this.countdown = countdown;
		this.questions = questions;
	}
	
	
}
