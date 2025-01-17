package com.kn.JdbcCreateTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcCreateTable {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/youtube";
		String username = "root";
		String password = "Ritika@2000";

//		load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");

//			creating a connection
		Connection con = DriverManager.getConnection(url, username, password);

//			create a query
		String q = "create table table1(tId int(20) primary key auto_increment, tName varchar(200) not null, tCity varchar(400))";

//			carete a statement
		Statement stmt = con.createStatement();
		stmt.executeUpdate(q);

		System.out.println("table created in database");

//			closing connection
		con.close();
	}

}
