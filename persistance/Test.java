package com.google.drive;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory eManagerFactory=Persistence.createEntityManagerFactory("impact");
		EntityManager em=eManagerFactory.createEntityManager();
		em.getTransaction().begin();
//		Integer i1 = 102;
//		Employee e1=em.getReference(Employee.class,i1);
//		em.remove(e1);
//		System.out.println("Data deleted...");
		Employee e1=new Employee();
		
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e1.getCity());
		
		e1.setId(102);
		e1.setName("Shubh");
		e1.setCity("Jalna");
		e1.setDept("Goa");
		em.persist(e1);
		System.out.println("Data inserted");
		
		
		em.getTransaction().commit();
		em.close();
		eManagerFactory.close();
	}
}
