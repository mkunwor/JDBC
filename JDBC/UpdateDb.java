package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateDb {
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
          String query="UPDATE IT_students SET AGE=14 WHERE ID = 2";
      stmt.executeUpdate(query);
			 System.out.println("record updated");
			 
            //close connection
			 conn.close();

		
	}catch (Exception e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}
		
	}

}
