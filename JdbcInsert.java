package com.kn.JdbcInsert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JdbcInsert {

	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306/youtube";
		String username="root";
		String password="Ritika@2000";
		
		//load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		creating a connection
		Connection con = DriverManager.getConnection(url, username, password);

//		create a query
		String q = "insert into table1(tName, tCity) values(?,?)";
	
//		carete a statement
		PreparedStatement pstmt = con.prepareStatement(q);
		pstmt.setString(1,"Disha");
		pstmt.setString(2, "Bangalore");
		
		pstmt.executeUpdate();
		
		System.out.println("Values Inserted");
		
//		closing connection
		con.close();
	}

}
