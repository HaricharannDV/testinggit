package com.cg.DTO;

import java.util.Set;

import com.cg.Entities.Contest;

public class ParticipantDTO {

	private Integer participant_id;
	private String name;
	private String email;
	private Set<Contest> contest;
	public Integer getParticipant_id() {
		return participant_id;
	}
	public void setParticipant_id(Integer participant_id) {
		this.participant_id = participant_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Set<Contest> getContest() {
		return contest;
	}
	public void setContest(Set<Contest> contest) {
		this.contest = contest;
	}

	
}
