package com.tata.capital.service;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tata.capital.dao.DbConnection;
import com.tata.capital.interfaces.Fetch;

public class FetchService implements Fetch
{
	final static String select="select id,name,dept,city,salary from tblemployee";
	public void read() throws SQLException, IOException 
	{
		PreparedStatement st=DbConnection.demo().prepareStatement(select);
		ResultSet rSet=st.executeQuery(select);
		System.out.println("\n-----------Employee data-----------");
		while(rSet.next())
		{
			System.out.println(rSet.getInt(1)+"   "+rSet.getString(2)+"   "+rSet.getString(3)+"   "+rSet.getString(4)+"   "+rSet.getFloat(5));
		}
		System.out.println("-----------------------------------");
	}
}