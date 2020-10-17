package com.md.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	private static Connection con = null; 
	  
    static
    { 
        String url = "jdbc:mysql:// localhost:3306/schemacustomer"; 
        String user = "root"; 
        String pass = "Mau#1234"; 
        try { 
            Class.forName("com.mysql.jdbc.Driver"); 
            con = DriverManager.getConnection(url, user, pass); 
        } 
        catch (ClassNotFoundException | SQLException e) { 
            e.printStackTrace(); 
        } 
    } 
    public static Connection getConnection() 
    { 
        return con; 
	
}
}
