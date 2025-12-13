package com.hibernate.curd.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.curd.hybernate.Employee;
import com.hibernate.curd.interfaces.Select;

public class SelectService implements Select
{
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("impact");
	public Employee select(int id) 
	{
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Employee employee=entityManager.find(Employee.class, id);
		entityManager.close();
		return employee;
	}
	public List<Employee> selectall()
	{
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		String jpql="SELECT e FROM Employee e";
		TypedQuery<Employee> query=entityManager.createQuery(jpql,Employee.class);
		List<Employee> employees=query.getResultList();
		entityManager.close();
		return employees;
	}
}
