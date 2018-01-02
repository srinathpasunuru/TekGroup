package com.practice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/demo";
		String user = "root";
		String pass = "admin";
		
		try {
			
			//set up the connection
			Connection myConn = DriverManager.getConnection(url,user,pass);
			
			//then create the statement
			Statement myStmt = myConn.createStatement();
			
			//get the result set
			ResultSet myRs = myStmt.executeQuery("select * from employees");
			
			//then process the result set
			while(myRs.next()) {
				System.out.println(myRs.getString("last_name")+ ", "+ myRs.getString("first_name"));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}

