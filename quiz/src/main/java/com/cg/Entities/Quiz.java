package com.cg.Entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "quiz")
public class Quiz {
	
	@Id
	@Column(name = "quiz_id")
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private Integer quizId;
	
	@Column(name="total_questions")
	private Integer total_participants;
	
	@Column(name="neg marking")
	private Boolean negative_marking=false;
	
	@Column(name="skip")
	private Boolean skip=false;
	
	@OneToMany(mappedBy="quiz")
	private Set<Question> Questions;

	public Integer getQuizId() {
		return quizId;
	}

	public void setQuizId(Integer quizId) {
		this.quizId = quizId;
	}

	public Integer getTotal_participants() {
		return total_participants;
	}

	public void setTotal_participants(Integer total_participants) {
		this.total_participants = total_participants;
	}

	public Boolean getNegative_marking() {
		return negative_marking;
	}

	public void setNegative_marking(Boolean negative_marking) {
		this.negative_marking = negative_marking;
	}

	public Boolean getSkip() {
		return skip;
	}

	public void setSkip(Boolean skip) {
		this.skip = skip;
	}

	public Set<Question> getQuestions() {
		return Questions;
	}

	public void setQuestions(Set<Question> questions) {
		Questions = questions;
	}

	@Override
	public String toString() {
		return "Quiz [quizId=" + quizId + ", total_participants=" + total_participants + ", negative_marking="
				+ negative_marking + ", skip=" + skip + ", Questions=" + Questions + "]";
	}

	
	
}
