package com.cg.Service;

import java.util.List;

import com.cg.DTO.QuestionDTO;
import com.cg.Entities.Question;
import com.cg.exception.QuestionNotFoundException;

public interface QuestionSeriviceInterface {
	
	public List<QuestionDTO> getQuestion();
	
	public QuestionDTO getQuestionById(int id) throws QuestionNotFoundException;
	
	public Question deleteQuestion(int id) throws QuestionNotFoundException;
	
	public void addQuestion(QuestionDTO questiondto);
	
	public Question updateQuestion(int id,QuestionDTO questiondto) throws QuestionNotFoundException;
}
