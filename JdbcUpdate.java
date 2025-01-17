package com.kn.JdbcUpdate;

import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.io.BufferedReader;

public class JdbcUpdate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/youtube";
		String username="root";
		String password="Ritika@2000";
		
		//load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		creating a connection
		Connection con = DriverManager.getConnection(url, username, password);

//		create a query
		String q = "update table1 set tName=?, tCity=? where tId=?";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enetr new name: ");
		String name = br.readLine();
		
		System.out.println("Enetr new city: ");
		String city = br.readLine();
		
		System.out.println("Enetr the student id: ");
		int id = Integer.parseInt(br.readLine());
		
//		carete a statement
		PreparedStatement pstmt = con.prepareStatement(q);
		pstmt.setString(1, name);
		pstmt.setString(2, city);
		pstmt.setInt(3,  id);
		
		pstmt.executeUpdate();
		
		System.out.println("Done!!!!!!!!!!!!");
		
		con.close();
	}

}
