package dao;

import java.util.List;

import model.Answer;
import model.Question;

public interface BaseDao<T> {
	

	public List<T> findAll();
	public List<Answer> findOneById(int id);
	public void update(T item);
	public void save(T item);
	public void delete(int id);

	

}
