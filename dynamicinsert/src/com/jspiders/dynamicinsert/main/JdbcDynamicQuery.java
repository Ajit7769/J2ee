package com.jspiders.dynamicinsert.main;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class JdbcDynamicQuery {

	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static FileReader fileReader;
	private static Properties properties;
	private static String filePath = "D:\\WEJA1\\dynamicinsert\\resources\\db_info.properties";
	private static int result;
	private static String query;
	
    private static Scanner scanner= new Scanner(System.in);

	public static void main(String[] args) {

		try {
			fileReader = new FileReader(filePath);
			properties = new Properties();
			properties.load(fileReader);

			Class.forName(properties.getProperty("driverpath"));
			
			connection = DriverManager.getConnection(properties.getProperty("dburl"),properties);
			
			
			query = "insert into "
					+ "emp values "
					+ "(?,?,?,?)";
			
			preparedStatement = connection.prepareStatement(query);
			
		    preparedStatement.setInt(1, 8);
		    preparedStatement.setString(2, "Ajit Sarwade");
		    preparedStatement.setString(3, "ajit@123.gmail.com");
		    preparedStatement.setString(4, "60000");
		    
		    result = preparedStatement.executeUpdate();
		    
		    System.out.println("Query ok "+ result +" row(s) affect.");
		    
		    scanner.close();

		} catch (IOException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
				try {
					if(connection != null) {
					connection.close();
					}
					if(preparedStatement != null) {
						preparedStatement.close();
					}
					if(fileReader != null) {
						fileReader.close();
					}
				} catch (SQLException | IOException e) {
					e.printStackTrace();
				}
			}
		}

	
}
