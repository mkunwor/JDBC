package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) {
		final String url = "jdbc:mysql://localhost:3306/IT_DAY";
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
            
            String sql = "CREATE TABLE IT_students("
                    + "ID INT NOT NULL, "
                    + "NAME VARCHAR (20) NOT NULL, "
                    + "AGE INT NOT NULL, "
                   
                    + "ADDRESS CHAR (25) , "
                    + "PRIMARY KEY (ID))";
            
              stmt.executeUpdate(sql);
 			 System.out.println("table created");
 			 
              //close connection
 			 conn.close();

			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
