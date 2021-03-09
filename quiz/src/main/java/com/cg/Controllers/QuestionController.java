package com.cg.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.Entities.Question;
import com.cg.exception.QuestionNotFoundException;
import com.cg.DTO.QuestionDTO;
import com.cg.Service.QuestionSeriviceInterface;

@RestController      
public class QuestionController {
	@Autowired
	QuestionSeriviceInterface service;
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@GetMapping(value="question/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity getQuestion()				//Method to get the list of Questions
	{
		List<QuestionDTO> qlist = service.getQuestion();
		return  new ResponseEntity(qlist, HttpStatus.OK);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@GetMapping(value="question/getID/{qid}")
	public ResponseEntity getQuestionId(@PathVariable("qid")int qid) throws QuestionNotFoundException
	{																//Method to get a Question by question_ID
		QuestionDTO q=service.getQuestionById(qid);
		return new ResponseEntity(q, HttpStatus.OK);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@DeleteMapping(value="question/deleteID/{qid}")
	public ResponseEntity deleteQuestionbyId(@PathVariable("qid")int qid) throws QuestionNotFoundException
	{														//Method to delete a Question by question_ID
		Question q=service.deleteQuestion(qid);
		return new ResponseEntity(q, HttpStatus.OK);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@PostMapping(value="question/add") 
	public ResponseEntity addQuestion(@RequestBody QuestionDTO questiondto)
	{														//Method to add a Question
		service.addQuestion(questiondto);
		return new ResponseEntity("question added successfully!", HttpStatus.OK);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@PutMapping(value="question/updateID/{qid}")
	public ResponseEntity updateQuestionbyId(@PathVariable("qid")int qid,@RequestBody QuestionDTO questiondto) throws QuestionNotFoundException
	{														//Method to update a Question by question_ID
		Question q=service.updateQuestion(qid,questiondto);
		return new ResponseEntity(q, HttpStatus.OK);
	}
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@ExceptionHandler(QuestionNotFoundException.class) 					//to handle exception at controller level
	public ResponseEntity<String> handleQuestionNotFoundException(QuestionNotFoundException ex) 
	{
		return new ResponseEntity("Question Not Found Exception",HttpStatus.OK);
	}	
	
}

