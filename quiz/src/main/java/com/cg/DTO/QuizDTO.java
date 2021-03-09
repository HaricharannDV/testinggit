package com.cg.DTO;

import java.util.Set;

import com.cg.DTO.QuestionDTO;
import com.cg.Entities.Question;

public class QuizDTO {
	
	private Integer quizId;
	private Integer total_participants;
	private Boolean negative_marking=false;
	private Boolean skip=false;
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

	
}
