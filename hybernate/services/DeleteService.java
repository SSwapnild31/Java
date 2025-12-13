package com.hibernate.curd.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.curd.hybernate.Employee;
import com.hibernate.curd.interfaces.Delete;

public class DeleteService implements Delete
{
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("impact");
	public void delete(int id) 
	{
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		Employee employee=entityManager.find(Employee.class, id);
		if(employee != null)
		{
			entityManager.remove(employee);
		}
		
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}
