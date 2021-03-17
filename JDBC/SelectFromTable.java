package JDBC;

import java.sql.*;

public class SelectFromTable {

	public static void main(String[] args) {
		final String url = "jdbc:mysql://localhost:3306/IT_DAY";
		final String user = "root";
		final String password = "";
		try {
			// registration
			Class.forName("com.mysql.cj.jdbc.Driver");

			// connection
			Connection conn = DriverManager.getConnection(url, user, password);

			// create statement
			Statement stmt = conn.createStatement();

			// execution
			ResultSet r = stmt.executeQuery("SELECT * FROM IT_students");
			while (r.next()) {
				System.out.println("Id: "+r.getInt(1));
				System.out.println("Name: "+r.getString(2));
				System.out.println("Age: "+r.getInt(3));
				
				System.out.println("Address: "+r.getString(4));
			}

			// close connection
			conn.close();

		} catch (Exception e) {
			System.out.println("failed selection from  table");
		}

	}

}
