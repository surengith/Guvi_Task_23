package com.SeleniumPracticeTask23.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySql {

	public static void insertData() throws SQLException {

		String url = "jdbc:mysql://127.0.0.1:3306/OfficeData";
		String username = "root";
		String password = "Suren@123$";

		Connection con = DriverManager.getConnection(url, username, password);

		String createTable = "CREATE TABLE EmpDetails (empcode INT PRIMARY KEY, empname VARCHAR(50), empage INT, empsalary DECIMAL(10,2))";

		String insertData = "INSERT INTO EmpDetails (empcode, empname, empage, empsalary) VALUES "
				+ "(101, 'Jenny', 25, 10000.00)," + "(102, 'Jacky', 30, 20000.00)," + "(103, 'Joe', 20, 40000.00),"
				+ "(104, 'John', 40, 80000.00)," + "(105, 'Shameer', 25, 90000.00)";

		Statement createStatement = con.createStatement();

		createStatement.executeUpdate(createTable);
		createStatement.executeUpdate(insertData);

		System.out.println("Table created and data inserted successfully!");

		createStatement.close();
		con.close();

	}

	public static void main(String[] args) throws SQLException {
		insertData();
	}
}
