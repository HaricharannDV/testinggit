package client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import bean.QuizConfig;
import model.Questions;
import service.QuizServiceImp;

//checking for pull

public class QuizTest {
	@Autowired
	QuizServiceImp quizServiceImp;
	public void calService() {
		AnnotationConfigApplicationContext conobj= 
				new AnnotationConfigApplicationContext(QuizConfig.class);
		Questions quiz1=(Questions)conobj.getBean("quiz");
		QuizServiceImp quizServiceImp=(QuizServiceImp)conobj.getBean("quizServiceImp");
		quizServiceImp.addQuiz(quiz1);
		
		Questions quiz2=(Questions)conobj.getBean("quiz");
		quiz2.setQues("What are not the concept in java");
		quiz2.setOptA("Inheritance");
		quiz2.setOptB("Polymorphism");
		quiz2.setOptC("Abstraction");
		quiz2.setOptD("None of the above");
		quiz2.setAns("None of the above");
		quizServiceImp.addQuiz(quiz2);
	}
	
	public static void main(String[] args) 
	{	QuizTest test=new QuizTest();
		test.calService();
	}
}
