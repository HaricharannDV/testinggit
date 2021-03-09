package com.cg.JpaUtils;

import com.cg.Entities.Question;
import com.cg.DTO.QuestionDTO;
import java.util.*;
import java.util.List;


public class QuestionUtil 
{
	//code to get list of questiondto
	public static List<QuestionDTO> convertToQuestionDtoList(List<Question> list)
	{
		List<QuestionDTO> dtolist = new ArrayList<QuestionDTO>();
		for(Question question : list) 
			dtolist.add(convertToQuestionDTO(question));
		return dtolist;
	}
	
	//Code to get as set
	public static Set<QuestionDTO> onvertToQuestionDtoSet(List<Question> list)
	{
		Set<QuestionDTO> dtolist = new HashSet<QuestionDTO>();
		for(Question question : list) 
			dtolist.add(convertToQuestionDTO(question));
		return dtolist;
	}
	
	//code to convert questiondto to question
	public static Question convertToQuestion(QuestionDTO questiondto) 
	{
		Question question = new Question();
		question.setQuestion_ID(questiondto.getQuestion_ID());
		question.setQuestionStatement(questiondto.getQuestionStatement());
		question.setOption_A(questiondto.getOption_A());
		question.setOption_B(questiondto.getOption_B());
		question.setOption_C(questiondto.getOption_C());
		question.setOption_D(questiondto.getOption_D());
		question.setCorrectAnswer(questiondto.getCorrectAnswer());
		question.setExplanation(questiondto.getExplanation());
		return question;
	}
	
	//code to convert question to questiondto
	public static QuestionDTO convertToQuestionDTO(Question question)
	{
		QuestionDTO questiondto = new QuestionDTO();
		questiondto.setQuestion_ID(question.getQuestion_ID());
		questiondto.setQuestionStatement(question.getQuestionStatement());
		questiondto.setOption_A(question.getOption_A());
		questiondto.setOption_B(question.getOption_B());
		questiondto.setOption_C(question.getOption_C());
		questiondto.setOption_D(question.getOption_D());
		questiondto.setCorrectAnswer(question.getCorrectAnswer());
		questiondto.setExplanation(question.getExplanation());
		return questiondto;
	}
	
}
