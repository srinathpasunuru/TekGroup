package com.practice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InseringData {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/demo";
		String user = "root";
		String pass = "admin";
		
		try {
			
			//set up the connection
			Connection myConn = DriverManager.getConnection(url,user,pass);
			
			//then create the statement
			Statement myStmt = myConn.createStatement();
			
			String sql = "insert into employees"
					+ "(last_name, first_name, email)"
					+ "Values('Rapolu', 'Raj', 'Raj@gmail.com')";
			
			myStmt.executeUpdate(sql);
			
			System.out.println("data inserted");
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
