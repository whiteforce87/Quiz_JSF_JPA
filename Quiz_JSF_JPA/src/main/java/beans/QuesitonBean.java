package beans;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import dao.AnswerDao;
import dao.QestionDao;
import model.Answer;
import model.Question;
import java.io.Serializable;


@Named
@SessionScoped
public class QuesitonBean implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Question> questions =  new ArrayList<Question>();
	private List<Answer> answers =  new ArrayList<Answer>();
	
	private String givenAnswer ="1";
	private int amount =1;

	
	@Inject private QestionDao questionDao;
	@Inject private AnswerDao answerDao;
	
	
	Random rnd = new Random();
	
	
	@PostConstruct
	public void init() {
		
		questions = questionDao.findAll();
		answers = answerDao.findAll();
	
		
		
		
	}
	/*
	public String selectQuestion() {
		
		selectedQuestionNumber = rnd.nextInt(10);
		question = questions.get(selectedQuestionNumber);
		
		this.answers = answerDao.findOneById(selectedQuestionNumber+1);
		for (Answer answer : answers) {
			selectedQuestionAnswers.add(answer);
			System.out.println(answer.isIscorrect());
			if(answer.isIscorrect() == true) {
				
				this.correctAnswer= answer;
				System.out.println(correctAnswer);
			}
			
		}
		
				
		return "quiz";
	}
	
	
	public String saveAnswer() {
		
		for (Answer answer : answers) {
			selectedQuestionAnswers.add(answer);
			System.out.println(answer.isIscorrect());
			
			
		}
		
		
		System.out.println(correctAnswer.getText());
		System.out.println(givenAnswer);
		if(correctAnswer.getText().equals(givenAnswer)){
			correctAnserCount++;
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		return "question2";
		
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Answer getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(Answer correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public int getCorrectAnserCount() {
		return correctAnserCount;
	}

	public void setCorrectAnserCount(int correctAnserCount) {
		this.correctAnserCount = correctAnserCount;
	}

	public int getSelectedQuestionNumber() {
		return selectedQuestionNumber;
	}

	public void setSelectedQuestionNumber(int selectedQuestionNumber) {
		this.selectedQuestionNumber = selectedQuestionNumber;
	}

	/*public List<String> getSelectedQuestionAnswers() {
		return selectedQuestionAnswers;
	}

	public void setSelectedQuestionAnswers(List<String> selectedQuestionAnswers) {
		this.selectedQuestionAnswers = selectedQuestionAnswers;
	}

	public QestionDao getQuestionDao() {
		return questionDao;
	}

	public List<Answer> getSelectedQuestionAnswers() {
		return selectedQuestionAnswers;
	}

	public void setSelectedQuestionAnswers(List<Answer> selectedQuestionAnswers) {
		this.selectedQuestionAnswers = selectedQuestionAnswers;
	}

	public void setQuestionDao(QestionDao questionDao) {
		this.questionDao = questionDao;
	}

	public AnswerDao getAnswerDao() {
		return answerDao;
	}

	public void setAnswerDao(AnswerDao answerDao) {
		this.answerDao = answerDao;
	}*/

	public String getGivenAnswer() {
		return givenAnswer;
	}

	public void setGivenAnswer(String givenAnswer) {
		this.givenAnswer = givenAnswer;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	
	
	
	
	
	


	

}
