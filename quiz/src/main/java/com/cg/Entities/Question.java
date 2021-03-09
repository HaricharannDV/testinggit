package com.cg.Entities;

import javax.persistence.*;


@Entity
@Table(name = "Questions_Table") // creating a table 

public class Question 
{
	@Id													//setting primary key 
	@GeneratedValue(strategy = GenerationType.AUTO)		//primary key will be automatically incremented
	private Integer question_ID;
	
	@Column(name= "QuestionStatement" , nullable = false)  //can not be null
	private String questionStatement;
	@Column( nullable = false)
	private String option_A;
	@Column( nullable = false)
	private String option_B;
	@Column( nullable = false)
	private String option_C;
	@Column( nullable = false)
	private String option_D;
	@Column( nullable = false)
	private String correctAnswer;
	@Column( nullable = false)
	private String explanation;
	
	/*@ManyToOne
    @JoinColumn(name = "creator_ID" ) 
    private QuizCreator q_creator_ID;
    */
	
	//Getters and Setters for all the variables
	
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
	
	@Override
	public String toString() {
		return "Question [question_ID=" + question_ID + ", questionStatement=" + questionStatement + ", option_A="
				+ option_A + ", option_B=" + option_B + ", option_C=" + option_C + ", option_D=" + option_D
				+ ", correctAnswer=" + correctAnswer + ", explanation=" + explanation + "]";
	}
	

}
