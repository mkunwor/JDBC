package JDBC;

import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbCreate {
	
	public static void main(String[] args) {
		final String url = "jdbc:mysql://localhost:3306";
		final String user = "root";
		final String password = "";
		
			
		try {
			
			  //register JDBC Driver
				Class.forName("com.mysql.cj.jdbc.Driver");

				//Connection to database
				Connection conn = DriverManager.getConnection(url, user, password); 
				
				// create statement
                Statement stmt = conn.createStatement();
				
             // execute statement
                  stmt.executeUpdate("CREATE DATABASE IT_DAY");
     			 System.out.println("db created");
     			 
                  //close connection
     			 conn.close();
	
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("failed to create database");
		}
		
	}

}
