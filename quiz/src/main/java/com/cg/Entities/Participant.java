package com.cg.Entities;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="participant")
public class Participant {

	@Id
	@Column(name="participant_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer participant_id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@OneToMany
	@JoinColumn(name="contest")
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

	@Override
	public String toString() {
		return "Participant [participant_id=" + participant_id + ", name=" + name + ", email=" + email + ", contest="
				+ contest + "]";
	}
	
	
	
}
