package com.cg.Exceptions;


public class CreatorNotFoundException extends Exception  //this class is dedicated for Exception Handling for Questions
{
	public CreatorNotFoundException(String msg)
	{
		super(msg);  // will get the custom message written when used 
	}
}
