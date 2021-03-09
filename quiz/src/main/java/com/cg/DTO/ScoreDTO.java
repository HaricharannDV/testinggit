package com.cg.DTO;

import java.util.List;

import com.cg.Entities.Participant;
import com.cg.Entities.Quiz;

public class ScoreDTO {

	private Integer score_id;
	private Quiz quiz_id;
	private Participant participant_id;
	private Integer score;
	private Integer rank;
	public Integer getScore_id() {
		return score_id;
	}
	public void setScore_id(Integer score_id) {
		this.score_id = score_id;
	}
	public Quiz getQuiz_id() {
		return quiz_id;
	}
	public void setQuiz_id(Quiz quiz_id) {
		this.quiz_id = quiz_id;
	}
	public Participant getParticipant_id() {
		return participant_id;
	}
	public void setParticipant_id(Participant participant_id) {
		this.participant_id = participant_id;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public Integer getRank() {
		return rank;
	}
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "ScoreDTO [score_id=" + score_id + ", quiz_id=" + quiz_id + ", participant_id=" + participant_id
				+ ", score=" + score + ", rank=" + rank + "]";
	}

	
}
