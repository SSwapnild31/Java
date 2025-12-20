package com.tata.capital.service;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.tata.capital.dao.DbConnection;
import com.tata.capital.interfaces.Create;

public class CreateService implements Create
{
	final static String insert="insert into tblEmployee(name,dept,city,salary) values(?,?,?,?)";
	public void create() throws SQLException, IOException 
	{
		Scanner s1=new Scanner(System.in);
		System.out.print("Enter Employee name->");
		String name=s1.next();
		System.out.print("Enter Employee Dept->");
		String dept=s1.next();
		System.out.print("Enter Employee City->");
		String city=s1.next();
		System.out.print("Enter Employee Salary->");
		float salary=s1.nextFloat();
		
		PreparedStatement ps=DbConnection.demo().prepareStatement(insert); 
		ps.setString(1, name);
		ps.setString(2, dept);
		ps.setString(3, city);
		ps.setFloat(4, salary);
		ps.executeUpdate();
		System.out.println("Data inserted...");
	}
}