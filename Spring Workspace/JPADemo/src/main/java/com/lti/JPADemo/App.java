package com.lti.JPADemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      Student s1= new Student(101, "Madhuri", 85.5);
      
      
      EntityManagerFactory f=Persistence.createEntityManagerFactory("JPA-PU");
      EntityManager em=f.createEntityManager();
      em.getTransaction().begin();
      
      System.out.println(s1);
    }
    
}
