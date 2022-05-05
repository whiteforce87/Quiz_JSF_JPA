package model;

public class Question extends BaseEntity{
	
	
	private String text;
	
	public Question() {
		
	}
	

	public Question(int id, String text) {
		super(id);
		this.text = text;
	}


	@Override
	public String toString() {
		return text;
	}
	
	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}



}
