package com.hibernate.curd.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.curd.hybernate.Employee;
import com.hibernate.curd.interfaces.Create;

public class CreateService implements Create
{
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("impact");

    @Override
    public void create(Employee employee) 
    {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(employee);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}