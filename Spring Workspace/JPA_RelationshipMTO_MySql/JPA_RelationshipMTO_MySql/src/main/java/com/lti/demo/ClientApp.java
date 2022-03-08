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
		System.out.println(" Many to One relationship  demo");
				
		em.getTransaction().begin();		
		Employee tempEmp=em.find(Employee.class, 103);
		System.out.println(tempEmp);		
		em.getTransaction().commit();
		
		em.getTransaction().begin();		
		Department dept=em.find(Department.class,111);
		System.out.println(dept);
		em.getTransaction().commit();
		
		
		em.close();
	}
}
