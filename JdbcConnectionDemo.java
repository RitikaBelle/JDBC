package com.kn.JdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnectionDemo {

	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306/youtube";
		String username="root";
		String password="Ritika@2000";
		
		//load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		creating a connection
		Connection con = DriverManager.getConnection(url, username, password);
		
		if(con.isClosed()) {
			System.out.println("Connection is closed!!!");
		}else {
			System.out.println("Connection is created!!!");
		}
	}

}
