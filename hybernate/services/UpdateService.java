package com.hibernate.curd.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.curd.hybernate.Employee;
import com.hibernate.curd.interfaces.Update;

public class UpdateService implements Update
{
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("impact");
	public void update(Employee employee) 
	{
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(employee);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
	}
}
