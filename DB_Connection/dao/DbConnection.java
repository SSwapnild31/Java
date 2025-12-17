package com.tata.capital.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnection 
{	
	static String user;
	static String pass;
	static String url;
	
	public static Connection demo() throws SQLException, IOException
	{
		File f1=new File("C:\\Users\\swapn\\eclipse-workspace\\capital\\src\\main\\java\\db.properties");
		FileInputStream f2= new FileInputStream(f1);
		Properties p1=new Properties();
		p1.load(f2);
		user=p1.getProperty("user");
		pass=p1.getProperty("pass");
		url=p1.getProperty("url");
		Connection con=DriverManager.getConnection(url,user,pass);
		return con;
	}
}