package nongsan.webmvc.service;

import java.util.ArrayList;
import java.util.List;

import nongsan.webmvc.model.Ordered;
import nongsan.webmvc.model.Review;

public interface OrderedService {
	void insert(Ordered ordered); 
	 
	void edit(Ordered ordered); 

	void delete(String id); 
 
	Ordered get(int id); 
	 
	Ordered get(String name); 
 
	ArrayList<Ordered> getAll();
	
	ArrayList<Ordered> searchByName(String reviewName);
 
}
