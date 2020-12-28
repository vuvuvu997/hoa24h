package nongsan.webmvc.service; 
 
import nongsan.webmvc.model.Admin;
import nongsan.webmvc.model.Review;

import java.util.ArrayList;
import java.util.List; 
public interface AdminService { 
	void insert(Admin admin); 
 
	void edit(Admin admin); 

	void delete(String id); 
 
	Admin get(int id); 
	 
	Admin get(String name); 
 
	ArrayList<Admin> getAll(); 
	
	ArrayList<Admin> searchByName(String reviewName);
 
} 
