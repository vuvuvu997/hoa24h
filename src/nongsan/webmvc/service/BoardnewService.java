package nongsan.webmvc.service;

import java.util.ArrayList;
import java.util.List;

import nongsan.webmvc.model.Boardnew;
import nongsan.webmvc.model.Review;

public interface BoardnewService {
	void insert(Boardnew boardnew);

	void edit(Boardnew boardnew);

	void delete(int id);

	Boardnew get(int id);
	
	Boardnew get(String name);

	ArrayList<Boardnew> getAll();
	
	ArrayList<Boardnew> searchByName(String boardName);

}
