package com.cg.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.Entities.Quiz;

public interface QuizRepo extends JpaRepository<Quiz, Integer> {
	
}
