package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

		private static String server = "localhost";
		private static String database = "quiz";
		private static String username = "root";
		private static String password = "Sabanci123!";
		
		
		public static Connection getConnection() throws SQLException {
			
			
			Connection conn = 
					DriverManager.
					getConnection("jdbc:mysql://" 
					+ server 
					+ "/" 
					+ database,username,password);
			
			return conn;
			
			
		}
	
}
