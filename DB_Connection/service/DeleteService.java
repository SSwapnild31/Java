package com.tata.capital.service;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.tata.capital.dao.DbConnection;
import com.tata.capital.interfaces.Delete;

public class DeleteService implements Delete
{
	static String delete="delete from tblEmployee where id=?";
	public void delete() throws SQLException, IOException 
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter Employee id to delete->");
		int id=s1.nextInt();
		
		try {
			PreparedStatement ps=DbConnection.demo().prepareStatement(delete);
			ps.setInt(1, id);
			int rowAffected = ps.executeUpdate();
			
			if(rowAffected>0)
			{
				System.out.println("Data deleted successfully...");
			}
			else 
			{
				System.out.println("-->Id "+id+" not found. Nothing deleted...");
			}
		} catch (SQLException e) 
		{
			System.out.println("Error occured -> "+e.getMessage());
		}
	}
}
