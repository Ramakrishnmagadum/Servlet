package com.tech.blog.helper;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

	public static Connection conn;
	

	public static Connection getconnection() {
		try {
			if (conn == null) {
				// load Driver
				Class.forName("com.mysql.jdbc.Driver");
				// create connetion
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/RamDB", "root", "root");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

}
