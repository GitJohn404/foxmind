package ua.com.testjava.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseFacade {
	public static List<String> getBooks(){
		
		List<String> result = new ArrayList<String>();
		
		try (Connection connection =  DriverManager.getConnection("jdbc:postgresql://localhost:postgres", "postgres", "7576")) {
			
			
			System.out.println("Java JDBC PostgreSQL Example");
			
			
			System.out.println("Connection to PostgreSQL database");
			Statement statement = (Statement) connection.createStatement();
			
			ResultSet resultSet = statement.executeQuery("SELECT * FROM books.books");
			while (resultSet.next()) {
				result.add(resultSet.getString("name"));
			}
		
		} catch (SQLException e) {
			System.out.println("Connection failure");
			e.printStackTrace();
		}
		return result;
	}
}
