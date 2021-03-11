package bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import model.Questions;
import service.QuizServiceImp;

@Configuration 
public class QuizConfig 
{
	@Bean
	public QuizServiceImp quizServiceImp()
	{
		QuizServiceImp quizServiceImp=new QuizServiceImp();
		return quizServiceImp;
	}
	@Bean
	@Scope("prototype")
	public Questions quiz()
	{
		Questions quiz=new Questions();
		quiz.setQues("What are the concept in java");
		quiz.setOptA("Inheritance");
		quiz.setOptB("Polymorphism");
		quiz.setOptC("Abstraction");
		quiz.setOptD("All the above");
		quiz.setAns("All the above");
		return quiz;
	}
}
