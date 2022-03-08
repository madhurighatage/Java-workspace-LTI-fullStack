package com.lti.relational.OTO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserApp {
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();

//       Address a2=new Address(1000002L, "Kolhapur", "MH", "India");
//       Employee e2=new Employee(102L, "Shravani", 99000, a2);
//       
//       Address a3=new Address(1000003L, "Pune", "MH", "India");
//       Employee e3=new Employee(103L, "Aarthi", 85400, a3);
//       Address a4=new Address(1000004L, "Delhi", "DL", "India");
//       Employee e4=new Employee(104L, "Seema", 65658, a4);
//       Address a6=new Address(1000006L, "Asam", "AS", "India");
//       Employee e6=new Employee(106L, "Shweta", 35855, a6);

		em.getTransaction().begin();
		Employee e6=em.find(Employee.class, 101L);
		em.remove(e6);
//		 em.persist(e1);
//       em.persist(e2);
//       em.persist(e3);
//       em.persist(e4);
//       em.persist(e5);
		em.getTransaction().commit();

	}
}
