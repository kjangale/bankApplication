package com.kunal.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class BankingAplication {

	public static void main(String[] args) throws Exception 
	{
		//Load the driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish the connection between java application and mysql database.
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "Kunal@123");
		
		//Create statement object
		
		Statement st=con.createStatement();
		
		//Write and execute sql query
		
		String query="create table employee (EmpNo int(3) primary key, EmpName varchar(5), EmpSal float(5))";
		
		st.executeUpdate(query);
		
		System.out.println("Employee table created successfully");
		
		//Close the connection
		
		st.close();
		con.close();

	}

}
