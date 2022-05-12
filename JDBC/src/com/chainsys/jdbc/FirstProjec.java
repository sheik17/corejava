package com.chainsys.jdbc;

import java.sql.*;

public class FirstProjec {	
	    public static void main(String[] args) 
	         throws SQLException {
	        try {
	        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123");

	        Statement stmt = con.createStatement();
	        ResultSet rs = stmt.executeQuery("SELECT * FROM Employees");

	        while (rs.next()) {
	            String x = rs.getString("first_name");
	            String s = rs.getString("last_name");
	            int w=rs.getInt("salary");
//	            float f = rs.getFloat("c");
	            System.out.println(x+" "+s+" : "+w);
	        }
	       
	        }
	        catch(Exception e) {
	            System.out.println(e.toString());
	        }
	    
	}
}
