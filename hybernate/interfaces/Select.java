package com.hibernate.curd.interfaces;

import java.util.List;

import com.curd.hybernate.Employee;

public interface Select 
{
	Employee select(int id);

	List<Employee> selectall();
}
