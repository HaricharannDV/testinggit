package service;

import java.util.ArrayList;

import model.Questions;

public class QuizServiceImp implements QuizService
{
	ArrayList<Questions> qlist=new ArrayList<Questions>();

	@Override
	public void addQuiz(Questions quiz) {
		qlist.add(quiz);
		System.out.println(qlist);
	}

	@Override
	public void deleteQuiz(Questions quiz) {
		int n=qlist.indexOf(quiz);
		qlist.remove(n);
		System.out.println(qlist);
	}
}
