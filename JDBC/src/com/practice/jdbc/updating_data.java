package com.practice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class updating_data {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/demo";
		String user = "root";
		String pass = "admin";
		
		try {
			
			//set up the connection
			Connection myConn = DriverManager.getConnection(url,user,pass);
			
			//then create the statement
			Statement myStmt = myConn.createStatement();
			
			String sql = "update employees "
					+ "set first_name='Raj Kumar'"
					+ "where id=13";
			
			myStmt.executeUpdate(sql);
			
			System.out.println("data updated");
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
