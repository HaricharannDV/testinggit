package com.cg.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.Entities.Participant;

public interface ParticipantRepo extends JpaRepository<Participant, Integer> {

}
