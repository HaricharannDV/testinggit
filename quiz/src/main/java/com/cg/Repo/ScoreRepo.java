package com.cg.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.Entities.Score;

public interface ScoreRepo extends JpaRepository<Score, Integer> {

}
