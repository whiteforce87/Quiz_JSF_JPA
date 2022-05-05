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
import model.Question;

@SessionScoped
public class QestionDao implements BaseDao<Question>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public List<Question> findAll() {
		
		List<Question> questions = new ArrayList<>();

		try (Connection conn = ConnectionManager.getConnection()) {

			String query = "select * from question";

			PreparedStatement psmt = conn.prepareStatement(query);

			ResultSet rs = psmt.executeQuery();

			while (rs.next()) {
				questions.add(new Question(rs.getInt("id"), rs.getString("text")));
			}

			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return questions;
	}


	@Override
	public void update(Question item) {
		// TODO Auto-generated method stub

	}

	@Override
	public void save(Question item) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Answer> findOneById(int id) {
		// TODO Auto-generated method stub
		return null;
	}



}
