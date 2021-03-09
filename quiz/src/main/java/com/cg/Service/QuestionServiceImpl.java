package com.cg.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.Entities.Question;
import com.cg.exception.QuestionNotFoundException;
import com.cg.DTO.QuestionDTO;
import com.cg.Repo.QuestionRepo;
import com.cg.JpaUtils.QuestionUtil;


@Service  // to mention it is Service component where business logic is written.
public class QuestionServiceImpl implements QuestionSeriviceInterface {

	@Autowired  // Autowiring annotation feature of spring framework enables you to inject the object dependency implicitly.
	QuestionRepo repo;
	
	
	// Method to get all the Questions
	public List<QuestionDTO> getQuestion()    
	{	
		List<Question> qlist= repo.findAll();     // findAll() return all the records
		List<QuestionDTO>dtolist = QuestionUtil.convertToQuestionDtoList(qlist);
		System.out.println("service list size "+qlist.size());
		return dtolist;
	}
	
	
	//Method to get a Question by question_ID
	public QuestionDTO getQuestionById(int id) throws QuestionNotFoundException 
	{
		Optional<Question> optional= repo.findById(id);   // Optional is feature of Java 8 , if the value is present it gets stored
								  // findById is a method to find values by primary key
		if(optional.isPresent())
		{
			Question question= optional.get();
			return QuestionUtil.convertToQuestionDTO(question);
		}
		else 
		{
			throw new QuestionNotFoundException("Question not found for the given id");	
		}	
	}
	
	
	//Method to delete a Question by question_ID
	public Question deleteQuestion(int id) throws QuestionNotFoundException 
	{
		Optional<Question> q = repo.findById(id);  
		Question question=null;
		if(q.isPresent()) 
		{
			 question= q.get();
		}
		else
		{
			throw new QuestionNotFoundException("Question not available , wrong delete operation");	
		}	
		repo.delete(question);
		return question;
	}
	
	
	//Mehtod to add Questions
	public void addQuestion(QuestionDTO questiondto) 
	{
		repo.saveAndFlush(QuestionUtil.convertToQuestion(questiondto));
	}
	
	
	//Mehtod to update the Question
	public Question updateQuestion(int id,QuestionDTO questiondto) throws QuestionNotFoundException
	{
		Optional<Question> q = repo.findById(id);  
		Question question=null;
		if(q.isPresent()) 
		{
			question= q.get();
			question.setQuestion_ID(questiondto.getQuestion_ID());
			question.setQuestionStatement(questiondto.getQuestionStatement());
			question.setOption_A(questiondto.getOption_A());
			question.setOption_B(questiondto.getOption_B());
			question.setOption_C(questiondto.getOption_C());
			question.setOption_D(questiondto.getOption_D());
			question.setCorrectAnswer(questiondto.getCorrectAnswer());
			question.setExplanation(questiondto.getExplanation());			 
		}
		else
		{
			throw new QuestionNotFoundException("Question not available , wrong update operation");	
		}
		repo.flush();
		return question;
	}
}
