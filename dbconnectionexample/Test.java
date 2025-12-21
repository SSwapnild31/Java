package dbconnection.dbconnectionexample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import java.util.List;

public class Test 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("impact");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		Employee em=new Employee();
		
		em.setId(2);
		em.setName("Shubh");
		em.setCity("Jalna");
		em.setSalary(49000);
		entityManager.persist(em);
		System.out.println("Data inserted...");
		
		List<Employee> resultList=entityManager.createQuery("SELECT e FROM Employee e",Employee.class).getResultList();
		
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
		
		for(Employee e1 : resultList)
		{
			System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getCity()+" "+e1.getSalary());
		}
	}
}