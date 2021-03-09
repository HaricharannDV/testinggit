package com.cg.DTO;

import java.util.Set;

import com.cg.Entities.Contest;
import com.cg.Entities.Quiz;
import com.cg.Entities.Room;

public class CreatorDTO {

	private Integer creator_id;
	private Set<Contest> contest;
	private Integer email;
	private boolean paid=false;
	private String name;
	
	public Integer getCreator_id() {
		return creator_id;
	}
	public void setCreator_id(Integer creator_id) {
		this.creator_id = creator_id;
	}
	public Set<Contest> getContest() {
		return contest;
	}
	public void setContest(Set<Contest> contest) {
		this.contest = contest;
	}
	public Integer getEmail() {
		return email;
	}
	public void setEmail(Integer email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public boolean isPaid() {
		return paid;
	}
	public void setPaid(boolean paid) {
		this.paid = paid;
	}

	
	
}
