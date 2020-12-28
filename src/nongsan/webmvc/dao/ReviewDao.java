package nongsan.webmvc.dao;

import java.util.ArrayList;
import java.util.List;

import nongsan.webmvc.model.Product;
import nongsan.webmvc.model.Review;

public interface ReviewDao {
	void insert(Review review);

	void edit(Review review);

	void delete(int id);

	Review get(int id);
	
	Review get(String name);

	ArrayList<Review> getAll();
	
	ArrayList<Review> getReviewById(int id);
	
	ArrayList<Review> searchByName(String reviewName);
}
