package com.kn.JdbcSelect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcSelect {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/youtube";
		String username = "root";
		String password = "Ritika@2000";

		// load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");

//		creating a connection
		Connection con = DriverManager.getConnection(url, username, password);

//		create a query
		String query = "select * from table1";
		Statement stmt = con.createStatement();
		ResultSet set = stmt.executeQuery(query);
		while (set.next()) {
			int id = set.getInt(1);
			String name = set.getString(2);
			String city = set.getString(3);
			System.out.println(id + " : " + name + " : " + city);
			
		}
		con.close();
	}

}
