package com.training.utils;

import java.io.File;
import java.io.FileInputStream;
import java.sql.*;
import java.util.Calendar;
import java.util.Properties;


public class DbConnection {
	
	public static Connection getOracleConnection(){
		Connection con = null;
		
		try {
			Properties props = new Properties();
			
			FileInputStream fin = new FileInputStream(new File("DbConnection.properties"));
			props.load(fin);
			
			/*Calendar cal = Calendar.getInstance();
			cal.set(2015,10,6,15,38);
			
			java.sql.Date date=new java.sql.Date(cal.getTimeInMillis());
			Timestamp time = new Timestamp(cal.getTimeInMillis());*/
			
			
			Class.forName(props.getProperty("db.driverClass"));
			String url = props.getProperty("db.url");
			String pword = props.getProperty("db.password");
			String userName = props.getProperty("db.userName");
			
			con = DriverManager.getConnection(url, userName, pword);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
	
	public static void main(String[] args) {
		System.out.println(DbConnection.getOracleConnection());
	}

}
