package com.cg.Controllers;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cg.exception.QuestionNotFoundException;

@RestControllerAdvice   //  global exception handling , application level
public class ExceptionController 
{
	
	@SuppressWarnings({ "rawtypes", "unchecked" })      //Exception for Question not found
	@ExceptionHandler(QuestionNotFoundException.class)
	public ResponseEntity handleQuestionNotFoundException(QuestionNotFoundException ex) 
	{
		return new ResponseEntity(ex.getMessage(),HttpStatus.OK);
	}
	

	@SuppressWarnings({ "unchecked", "rawtypes" })      //Parent for all in-built Exceptions
	@ExceptionHandler(Exception.class)
	public ResponseEntity handleException(Exception ex) 
	{
		return new ResponseEntity("Operation can not be perfomed" ,HttpStatus.BAD_REQUEST);	
	}

}
