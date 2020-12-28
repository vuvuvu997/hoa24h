package nongsan.webmvc.service;

import nongsan.webmvc.model.Catalog;
import nongsan.webmvc.model.Review;

import java.util.ArrayList;
import java.util.List;
public interface CategoryService {
	void insert(Catalog category);

	void edit(Catalog category);

	Catalog get(int id);
	
	Catalog get(String name);

	List<Catalog> getAll();

	void delete(String id);
	
	ArrayList<Catalog> getCateByProduct(int id);
	
	ArrayList<Catalog> searchByName(String reviewName);

}

