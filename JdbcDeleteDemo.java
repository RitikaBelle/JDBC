package com.kn.JdbcDelete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcDeleteDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String email1="amita@gmail.com";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","Ritika@2000");
		PreparedStatement ps = con.prepareStatement("DELETE FROM register WHERE email = ?");
		
		ps.setString(1, email1);
		int count = ps.executeUpdate();
		if(count>0) {
			System.out.println("Deleted Succesfully");
		}else {
			System.out.println("Deletion failed");
		}
		con.close();
	}

}
