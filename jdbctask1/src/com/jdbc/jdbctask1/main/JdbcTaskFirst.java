package com.jdbc.jdbctask1.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;



public class JdbcTaskFirst {

	private static Connection connection;
	private static Statement statement;
	private static int createQuery;
	private static int insertQuery;
	private static int updateQuery;
	private static int deleteQuery;
	private static ResultSet resultset;
	private static FileReader fileReader;
	private static Properties properties;
	private static String filePath = "D:\\WEJA1\\jdbctask1\\resources\\db_info.properties";

	public static void main(String[] args) {

		try {
			fileReader = new FileReader(filePath);
			properties = new Properties();
			properties.load(fileReader);

			Class.forName(properties.getProperty("driverpath"));

			connection = DriverManager.getConnection(properties.getProperty("dburl"), properties);

			statement = connection.createStatement();

			createQuery = statement
					.executeUpdate("CREATE TABLE emp (EmpID int,Ename varchar(200),job varchar(200),sal varchar(200))");

			System.out.println("Query Ok " + createQuery + " row(s) affected \n");
			
			System.out.println("===========================INSERT DATA====================================");


			insertQuery = statement.executeUpdate(
					"insert into emp values(1,'Adinath Pawar','FrontEnd Developer','12000'),"
					+ "(2,'kiran_katre','Full_Stack_Developer','20000'),"
					+ "(3,'Laxmi','FrontEnd Developer','30000'),"
					+ "(4,'Megha','Web Developer','30000'),"
					+ "(5,'srushti','BackEnd Developer','60000'),"
					+ "(6,'vaishnavi','BackEnd Developer','40000');");
			
			
			System.out.println("Query Ok " + insertQuery + " row(s) affected \n");
			

			resultset = statement.executeQuery("select * from emp");

			while (resultset.next()) {
				System.out.println(resultset.getString(1) + " || " + resultset.getString(2) + " || "
						+ resultset.getString(3) + " || " + resultset.getLong(4));

			}
			
			System.out.println("===============================================================");

			updateQuery = statement
					.executeUpdate("update emp " + "set job = 'Full Stack Developer' " + "WHERE EmpID in (3,4)");


			System.out.println("Query Ok " + updateQuery + " row(s) affected \n");

			System.out.println("\n===========================UPDATE DATABASE====================================\n");
			
			
			resultset = statement.executeQuery("select * from emp");

			while (resultset.next()) {
				System.out.println(resultset.getString(1) + " || " + resultset.getString(2) + " || "
						+ resultset.getString(3) + " || " + resultset.getLong(4));

			}
			
			System.out.println("\n===========================DELETE ROW ====================================\n");

			deleteQuery = statement.executeUpdate("Delete from emp " + "Where EmpID = 2 ");

			System.out.println("Query Ok " + deleteQuery + " row(s) affected \n");

			resultset = statement.executeQuery("select * from emp");

			while (resultset.next()) {
				System.out.println(resultset.getString(1) + " || " + resultset.getString(2) + " || "
						+ resultset.getString(3) + " || " + resultset.getLong(4));

			}

			System.out.println("===============================================================");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}

				if (statement != null) {
					statement.close();
				}

				if (fileReader != null) {
					fileReader.close();
				}

				if (resultset != null) {
					resultset.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
