package com.kn.JDBCInsertDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCInsertDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String name1 = "amita";
		String email1 = "amita@gmail.com";
		String pass1 = "amita123";
		String gender1 = "female";
		String city1 = "bangalore";

//		load and resgister driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver clas sloaded suscefully");

//		connection between java and database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "Ritika@2000");

//		create statement object
//		PreparedStatement ps =con.prepareStatement("insert into register values('priya', 'priya@gmail.com','priya123','female','delhi')");
		PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?,?)");
		ps.setString(1, name1);
		ps.setString(2, email1);
		ps.setString(3, pass1);
		ps.setString(4, gender1);
		ps.setString(5, city1);

//		execute query
		int i = ps.executeUpdate();

		if (i > 0) {
			System.out.println("sucess");
		} else {
			System.out.println("fail");
		}
	}

}
