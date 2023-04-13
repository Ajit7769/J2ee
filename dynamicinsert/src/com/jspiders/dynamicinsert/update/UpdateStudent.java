package com.jspiders.dynamicinsert.update;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class UpdateStudent {

	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static FileReader fileReader;
	private static Properties properties;
	private static ResultSet resultSet;
	private static Statement statement;
	private static String query;
	private static int result;
	private static String filePath = "D:\\WEJA1\\dynamicinsert\\resources\\db_info.properties";

	public static void main(String[] args) {

		try {

			fileReader = new FileReader(filePath);
			properties = new Properties();
			properties.load(fileReader);

			Class.forName(properties.getProperty("driverpath"));

			connection = DriverManager.getConnection(properties.getProperty("dburl"), properties);

			query = "Update emp " + "set job = ?  " + "where EmpID = ?";

			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, "Developer");
			preparedStatement.setInt(2, 5);

			result = preparedStatement.executeUpdate();

			System.out.println("Query Ok " + result + " row(s) affected.");
			
			

			String query1 = "select * from emp";
			resultSet = preparedStatement.executeQuery(query1 );

			while (resultSet.next()) {
//				EmpDetails empDetails = new EmpDetails();
//
//				empDetails.setEmpID(resultSet.getInt(1));
//				empDetails.setEname(resultSet.getString(2));
//				empDetails.setJob(resultSet.getString(3));
//				empDetails.setSal(resultSet.getLong(4));
				
				
			}

		} catch (IOException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (fileReader != null) {
					fileReader.close();
				}
			} catch (SQLException | IOException e) {
				e.printStackTrace();
			}
		}

	}
}
