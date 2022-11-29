package com.dailyCoding;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CP {

	static Connection con;
	static Statement stmt;
	static ResultSet rs;

	public static Connection connection() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver load & Register");
			String url = "jdbc:mysql://localhost:3306/jdbc";
			String username = "root";
			String password = "root";
			con = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public void fetch() {
		try {
			connection();
			String q = "select * from student";
			stmt = con.createStatement();
			rs = stmt.executeQuery(q);
			while (rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getBigDecimal(3));
				System.out.println("Data fetch successfully");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void insert() {
		try {
			connection();
			String q = "insert into student(sName,sPercentage) values('Bhagirath',98.3)";
			stmt = con.createStatement();
			stmt.execute(q);
			System.out.println("Data Inserted");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
