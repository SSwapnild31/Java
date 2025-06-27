package com.jdbcsample.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main 
{
	public static void main(String[] args)
	{
		String url="jdbc:mysql://localhost:3306/student";
		String user="root";
		String pass="Shyam";
		String sql="select id,name,address,city,marks from stud";
		try 
		{
			Connection connection=DriverManager.getConnection(url, user, pass);
			Statement statement=connection.createStatement();
			ResultSet rSet=statement.executeQuery(sql);
			
			System.out.println("stud table data...\n");
			while(rSet.next())
			{
				int id=rSet.getInt("id");
				String name=rSet.getString("name");
				String address=rSet.getString("address");
				String city=rSet.getString("city");
				int marks=rSet.getInt("marks");
				
				System.out.println("Id : "+id+" \nName : "+name+" \nAddress : "+address+" \nCity : "+city+" \nMarks : "+marks);
				System.out.println("--------------------------");
			}
			
			rSet.close();
			statement.close();
			connection.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}