package com.chainsys.jdbc;

import java.io.*;
import java.sql.*;

import oracle.sql.BLOB;

public class TestBlobInsert {

	     public static void main(String args[]) throws Exception {
	        // get our test binary data
	        // I've tested this code on over 12Mb's of data ...
	    	 
	        File f = new File(args[0]);
	        FileInputStream fis = new FileInputStream(f);
	        byte binaryData[] = new byte[(int)f.length()];
	        fis.read(binaryData);
	        Class.forName("oracle.jdbc.driver.OracleDriver");
	        Connection con = DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:XE", "system", "123");
	        //// IMPORTANT ////
	        // You must set autocommit off here - else you'll get erros on transaction exectution
	        con.setAutoCommit(false);
	        CallableStatement stmt = con.prepareCall( "{call tbl.store(?)}");
	        // arg 1 of the proc is a BLOB locator.
	        stmt.registerOutParameter(1, Types.BLOB);
	        stmt.execute();
	        // Get the blob locator
	        BLOB blob = (BLOB)stmt.getBlob(0);
	        if (blob != null) {
	            // Get an output stream to it, and write our binary data to it
	            OutputStream os = blob.getBinaryOutputStream();
	            os.write(binaryData);

	            // close the locator
	            os.close();
	        } else {
	            System.out.println("Blob is null !!!");
	        }
	        // Close the statement
	        stmt.close();
	        //// IMPORTANT ////
	        // don't forget to commit AND turn back autocommit for
	        // other pooled connections else you'll have problems !
	        con.commit();
	        con.setAutoCommit(true);

	        con.close();
	     
	    }
	}

