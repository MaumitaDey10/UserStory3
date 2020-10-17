package com.md.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.md.model.Customer;
import com.md.util.DatabaseConnection;

public class CustomerDaoImplementation implements CustomerDao {

	static Connection con = DatabaseConnection.getConnection();

	@Override
	public int add(Customer c) throws SQLException {
		String query = "insert into customer(name, " + "title, " + "status, " + "complaintId) VALUES (?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, c.getName());
		ps.setString(2, c.getTitle());
		ps.setString(3, c.getStatus());
		ps.setInt(4, c.getComplaintId());
		int n = ps.executeUpdate();
		return n;

	}

	@Override
	public Customer getCustomer(int id) throws SQLException {
		// TODO Auto-generated method stub

		String query = "select * from customer where id= ?";
		PreparedStatement ps = con.prepareStatement(query);

		ps.setInt(1, id);
		Customer c = new Customer();
		ResultSet rs = ps.executeQuery();
		boolean check = false;

		while (rs.next()) {
			check = true;
			c.setCid(rs.getInt("id"));
			c.setName(rs.getString("name"));
			c.setTitle(rs.getString("title"));
			c.setStatus(rs.getString("status"));
			c.setComplaintId(rs.getInt("complaintId"));
		}

		if (check == true) {
			return c;
		} else
			return null;
	}

	
	  
	public  List<Customer> getCustomers() throws SQLException{
	  String query = "select * from customer";
	  PreparedStatement ps = con.prepareStatement(query);
	  ResultSet rs = ps.executeQuery();
	  List<Customer>ls = new ArrayList<Customer>();
	  while (rs.next()) { 
		  Customer c = new Customer(); 
		  c.setCid(rs.getInt("id"));
		  c.setName(rs.getNString("name"));
		  c.setTitle(rs.getNString("title")); 
		  c.setStatus(rs.getNString("status"));
		  c.setComplaintId(rs.getInt("complaintId"));
	  ls.add(c);
	  
	  } return ls ; }
	  

	}

