package com.cg.Repo;

 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.Entities.Question;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer>{

}
