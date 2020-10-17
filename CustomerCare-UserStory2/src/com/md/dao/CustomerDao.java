package com.md.dao;

import java.sql.SQLException;
import java.util.List;

import com.md.model.Customer;

public interface CustomerDao {

	public int add(Customer c) throws SQLException; 
   
	public Customer getCustomer(int id) throws SQLException; 
	 
	public  List<Customer> getCustomers() throws SQLException;     
    
	
	 
		
}
