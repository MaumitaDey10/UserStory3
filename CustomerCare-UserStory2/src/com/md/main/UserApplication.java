package com.md.main;

import java.sql.SQLException;
import java.util.List;

import com.md.dao.CustomerDaoImplementation;
import com.md.model.Customer;

public class UserApplication {


		 public static void main(String[] args) throws SQLException 
			    { 
			  
			        Customer c = new Customer(); 
			        c.setName("Rakesh"); 
			        c.setTitle("Mobile Issue"); 
			        c.setStatus("unresolved");
			        c.setComplaintId(497);
			        CustomerDaoImplementation cDao  = new CustomerDaoImplementation(); 
			  
		
			        // add 
			        cDao.add(c);
			        
			        // read 
			        Customer c1 = cDao.getCustomer(1);
			        System.out.println("ID:" + c1.getCid() + " " + "Name:" + c1.getName() + " "
	                           + "Title:" + c1.getTitle() + " " + "Status:" + c1.getStatus() + " " + "ComplaintId:" + c1.getComplaintId());
			  
			    	
					  // read All 
			        List<Customer> ls = cDao.getCustomers(); for (Customer allCus :
					  ls) { System.out.println(allCus); }
					 
	}
		
			
					
					

}
