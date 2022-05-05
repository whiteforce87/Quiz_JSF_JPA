package model;

public class Answer extends BaseEntity{
	
	private int question_id;
	private String option;
	private String text;
	private boolean iscorrect;
	
	public Answer() {
		super();
	}

	public Answer(int id, int question_id, String option, String text, boolean iscorrect) {
		super(id);
		this.question_id = question_id;
		this.option = option;
		this.text = text;
		this.iscorrect = iscorrect;
	}

	@Override
	public String toString() {
		return "" + text;
	}
	
	public int getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public boolean isIscorrect() {
		return iscorrect;
	}

	public void setIscorrect(boolean iscorrect) {
		this.iscorrect = iscorrect;
	}
	
	

	
}
