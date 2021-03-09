package com.cg.Entities;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="creator")
public class Creator {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="creator_id")
	private Integer creator_id;
	
	@OneToMany
	@JoinColumn(name="contest_id")
	private Set<Contest> contest;
	
	@Column(name="email")
	private String email;
	
	@Column(name="name")
	private String name;
	
	@Column(name="paid")
	private boolean paid=false;
	
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
