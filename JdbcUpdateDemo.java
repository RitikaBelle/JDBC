package com.kn.JdbcUpdate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class JdbcUpdateDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String city1 = "pune";
		String email1 = "kamal@gmail.com";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "Ritika@2000");
		PreparedStatement ps = con.prepareStatement("UPDATE register SET city = ? WHERE email = ?");
		ps.setString(1, city1);
		ps.setString(2, email1);
		int count = ps.executeUpdate();
		if (count > 0) {
			System.out.println("Updated Succesfuly");
		} else {
			System.out.println("Updation failed");
		}
		con.close();
	}

}
