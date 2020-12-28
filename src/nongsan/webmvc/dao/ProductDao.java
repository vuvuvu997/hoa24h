package nongsan.webmvc.dao;

import java.util.ArrayList;
import java.util.List;

import nongsan.webmvc.model.Product;

public interface ProductDao {
	void insert(Product product);

	void edit(Product product);

	void delete(String id);

	Product get(int id);
	
	Product get(String name);

	ArrayList<Product> getAll();
	
	ArrayList<Product> getProductById(int id);

	ArrayList<Product> searchByName(String productName);


}
