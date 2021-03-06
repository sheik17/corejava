package com.chainsys.jdbc;

import java.io.*;
import java.sql.*;

public class Image {

		public static void main(String args[]){
			Connection conn = null;
			PreparedStatement preparedStatement = null;
	
			String createTableQuery = "create table IMAGESTOR("
				+ "IMAGE_ID NUMBER(5) NOT NULL, "
				+ "NAME BLOB NOT NULL, "
				+ "PRIMARY KEY (IMAGE_ID) )";
	 
	                String storeImageQuery ="insert into IMAGESTOR "
					                + "values (?,?)";
	    try {
				
				//get connection
				conn = JDBCUtil.getConnection();
	 
				//create preparedStatement
				preparedStatement = 
					conn.prepareStatement(createTableQuery);
	 
				//execute query for create table
				preparedStatement.execute();
				System.out.println("Table created successfully.");
	 
				preparedStatement = 
					conn.prepareStatement(storeImageQuery);
	 
				//Read source image
				FileInputStream fileInputStream = 
					new FileInputStream("d:\\ilo.jpg");
	 
	                        preparedStatement.setInt(1,1);  
				preparedStatement.setBinaryStream(2,
				  fileInputStream,fileInputStream.available());
	 
				//execute update
				preparedStatement.executeUpdate();
			     System.out.println("Image stored successfully.");
	 
				//close connection
				preparedStatement.close();
				conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}	
	}
