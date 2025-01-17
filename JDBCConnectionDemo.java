package com.kn.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectionDemo {

	public static void main(String[] args) {
		String URL = "jdbc:mysql://localhost:3306/university";
		String USER_NAME = "root";
		String PASSWORD = "Ritika@2000";
		// String CREATE_STUDENT_QUERY = "CREATE TABLE STUDENT11 (ID INT, NAME VARCHAR(20), MARKS INT);";
		// String INSERT_STUDENT_QUERY = "INSERT INTO STUDENT11 VALUES(1,'RAM',100);";
		// String UPDATE_STUDENT_QUERY = "UPDATE STUDENT11 SET NAME = 'SRI RAM' WHERE NAME = 'RAM';";
		// String DELETE_STUDENT_QUERY = "DELETE FROM STUDENT11 WHERE ID = 1;";
		try {
			
			// 1.Load and Register driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// FQCN(Fully Qualified Class Name)-Canonical Name

			System.out.println("--->DRIVER LOADED AND REGISTERED SUCCESSFULLY!");
			
			// 2.Establish the Connection with Database
			Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("--------->CONNECTION ESATBLISHED SUCCESFULLY" + con);

			// String CREATE_STUDENT_QUERY = "CREATE TABLE STUDENT11 (ID INT, NAME VARCHAR(20), MARKS INT);";
			// String INSERT_STUDENT_QUERY = "INSERT INTO STUDENT11 VALUES(1,'RAM',100);";
			//String UPDATE_STUDENT_QUERY = "UPDATE STUDENT11 SET NAME = 'SRI RAM' WHERE NAME = 'RAM';";
			// String DELETE_STUDENT_QUERY = "DELETE FROM STUDENT11 WHERE ID = 1;";
			
			// 3.Create Statement Object
			Statement stmt = con.createStatement();

			// 4.Send and execute Query
			// stmt.execute(CREATE_STUDENT_QUERY);
			// int rowsAffected =stmt.executeUpdate(INSERT_STUDENT_QUERY);
			// System.out.println(rowsAffected+"rows affected.");
			//int rowsAffected = stmt.executeUpdate(UPDATE_STUDENT_QUERY);
			//System.out.println(rowsAffected + "rows affected.");
			// int rowsAffected = stmt.executeUpdate(DELETE_STUDENT_QUERY);
			// System.out.println(rowsAffected +"rowsAffected");
			System.out.println("------>student6 Table created successfully");
		} catch (ClassNotFoundException e) {
			System.out.println("----------->DRIVER CLASS NOT FOUND");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("FAILED TO ESTABLISH THE CONNECTION");
			e.printStackTrace();
		}

	}
}
