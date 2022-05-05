package dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import model.Answer;


@SessionScoped
public class AnswerDao implements BaseDao<Answer>, Serializable{

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		@Override
		public List<Answer> findAll() {
			
			List<Answer> answers = new ArrayList<>();

			try (Connection conn = ConnectionManager.getConnection()) {

				String query = "select * from answer";

				PreparedStatement psmt = conn.prepareStatement(query);

				ResultSet rs = psmt.executeQuery();

				while (rs.next()) {
					answers.add(new Answer(rs.getInt("id"), rs.getInt("question_id"), rs.getString("option"), rs.getString("text"), rs.getBoolean("iscorrect")));
				}

				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return answers;
	}

	
	public List<Answer> findOneById(int question_id) {
		
		List<Answer> answers =new ArrayList<Answer>();

		
		try (Connection conn = ConnectionManager.getConnection()){
			
			String query = "select * from answer where question_id=?";
			
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt.setInt(1, question_id);
			
			 ResultSet rs = psmt.executeQuery();
			 
			 
			 while(rs.next()) {
				 answers.add(new Answer(rs.getInt("id"), rs.getInt("question_id"), rs.getString("option"), rs.getString("text"), rs.getBoolean("iscorrect")));
				
				
			 }
			 
			
			 conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return answers;
		
	}

	@Override
	public void update(Answer item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(Answer item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
