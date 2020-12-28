package nongsan.webmvc.service;

import java.util.ArrayList;
import java.util.List;

import nongsan.webmvc.model.Transactions;
import nongsan.webmvc.model.User;

public interface TransactionService {
	void insert(Transactions transaction);
	 
	void edit(Transactions transaction); 

	void delete(String id); 
 
	Transactions get(int id); 
	 
	Transactions get(String name); 
 
	ArrayList<Transactions> getAll(); 

	ArrayList<Transactions> getByName(String searchUser);
}
