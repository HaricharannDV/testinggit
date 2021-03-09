package com.cg.DTO;

import org.springframework.stereotype.Component;

@Component
public class QuestionDTO {
	
	private Integer question_ID;		// declaring the variables
	private String questionStatement;
	private String option_A;
	private String option_B;
	private String option_C;
	private String option_D;
	private String correctAnswer;
	private String explanation;
	
	//Setters and Getters for the variable
	
	public Integer getQuestion_ID() {
		return question_ID;
	}
	public void setQuestion_ID(Integer question_ID) {
		this.question_ID = question_ID;
	}
	public String getQuestionStatement() {
		return questionStatement;
	}
	public void setQuestionStatement(String questionStatement) {
		this.questionStatement = questionStatement;
	}
	public String getOption_A() {
		return option_A;
	}
	public void setOption_A(String option_A) {
		this.option_A = option_A;
	}
	public String getOption_B() {
		return option_B;
	}
	public void setOption_B(String option_B) {
		this.option_B = option_B;
	}
	public String getOption_C() {
		return option_C;
	}
	public void setOption_C(String option_C) {
		this.option_C = option_C;
	}
	public String getOption_D() {
		return option_D;
	}
	public void setOption_D(String option_D) {
		this.option_D = option_D;
	}
	public String getCorrectAnswer() {
		return correctAnswer;
	}
	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	public String getExplanation() {
		return explanation;
	}
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	
	
}
