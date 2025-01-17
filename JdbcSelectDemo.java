package com.kn.Jdbc.Select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcSelectDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded sucessfully");
		System.out.println(" ");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306 /jdbc_db","root", "Ritika@2000");
		PreparedStatement ps = con.prepareStatement("select * from register");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
//			String name1 = rs.getString("name");
//			System.out.println(name1);
			System.out.println("Name : "+rs.getString("name"));
			System.out.println("Email : "+rs.getString("email"));
			System.out.println("Password : "+rs.getString("password"));
			System.out.println("Gender: "+rs.getString("gender"));
			System.out.println("City : "+rs.getString("city"));
			System.out.println(" ");
		}
		con.close();
	}

}
