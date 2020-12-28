package nongsan.webmvc.service.impl;

import java.util.ArrayList;
import java.util.List;

import nongsan.webmvc.dao.ReviewDao;
import nongsan.webmvc.dao.impl.ReviewDaoImpl;
import nongsan.webmvc.model.Product;
import nongsan.webmvc.model.Review;
import nongsan.webmvc.service.ReviewService;

public class ReviewServicesImpl implements ReviewService {
	ReviewDao reviewDao = new ReviewDaoImpl();
	@Override
	public void insert(Review review) {
		reviewDao.insert(review);
		
	}

	@Override
	public void edit(Review review) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		reviewDao.delete(id);
	}

	@Override
	public Review get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Review get(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Review> getAll() {
		return reviewDao.getAll();
	}
	
	@Override
	public ArrayList<Review> getReviewById(int id) {
		return reviewDao.getReviewById(id);
	}
	
	@Override
	public ArrayList<Review> searchByName(String productName) {
		return reviewDao.searchByName(productName);
	}

}
