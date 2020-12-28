package nongsan.webmvc.dao;

import java.util.ArrayList;
import java.util.List;

import nongsan.webmvc.model.User;

public interface UserDao {
	
	void insert(User user);

	void edit(User user);
	
	void delete(int id);

	User get(String name);

	User get(int id);
	
	ArrayList<User> getAll();
	ArrayList<User> getByName(String keyword);
}
