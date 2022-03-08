package com.lti.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ClientApp {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		System.out.println(" Bidirectional relationship  demo");
				
	/*	Address a1= new Address(10003l,"Mumbai","Maharashtra","India");
		Employee e1= new Employee(1003l,"Sanjay",60000, a1 );		
		em.getTransaction().begin();			
		em.persist(e1);		
		em.getTransaction().commit();	*/
		// JPQL -  Neet to give Class name / not a table name 				
	
		Query qry=em.createQuery("Select e from Employee e");
		List<Employee> empList=qry.getResultList();		
		//System.out.println(empList);
		
		Query qry1=em.createQuery("Select a from Address a");
		List<Address> addList=qry1.getResultList();		
		//System.out.println(addList);		
		
		for(Address a:addList)
		{
			System.out.println(a.getEmployee());
		}
		
		for(Employee  e:empList)
		{
			System.out.println(e.getAddress());
		}
		
		em.close();
	}
}
