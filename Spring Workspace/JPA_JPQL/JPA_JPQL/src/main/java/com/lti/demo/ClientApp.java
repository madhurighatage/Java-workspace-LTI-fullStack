package com.lti.demo;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class ClientApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		System.out.println(" JPQL demo");

		// Ex1 : // select all records
		/*
		 * String sql="Select e FROM Employee e"; 
		 * Query qry=em.createQuery(sql);
		 * List<Employee> empList =qry.getResultList();//to fetch multiple records
		 * System.out.println(empList);
		 */

		// Ex2 :
		/*
		 * String sql="Select e FROM Employee e"; Query qry=em.createQuery(sql);
		 * List<Employee> empList =qry.getResultList();//to fetch multiple records
		 * //System.out.println(empList);
		 * 
		 * for(Employee e:empList ) { System.out.println(e.getEname() + "\t" +
		 * e.getSalary()); }
		 */

		// Ex3 : Typed query

		/*
		 * String str="Select e FROM Employee e "; TypedQuery<Employee> tqry=
		 * em.createQuery(str,Employee.class); List<Employee>
		 * empList=tqry.getResultList();
		 * 
		 * for(Employee e:empList ) { System.out.println(e.getEname() + "\t" +
		 * e.getSalary()); }
		 */

		// Ex 4: search single record
		
		 // String str="Select e FROM Employee e where e.eid=105"; String
		 String str="Select e FROM Employee e where e.ename='Tom'"; TypedQuery<Employee>
		 tqry= em.createQuery(str,Employee.class); List<Employee>
		 empList=tqry.getResultList(); for(Employee e:empList ) {
		  System.out.println(e); }
		 

		// Dynamic JPQL Query
		// Query strung can be built dunmically at run time
		// using Query parameteres In JPA

		/*
		 * String str="Select e FROM Employee e where e.ename=:p_name";
		 * TypedQuery<Employee> tqry= em.createQuery(str,Employee.class);
		 * 
		 * System.out.println("Enter Name:"); String pname=sc.next();
		 * tqry.setParameter("p_name",pname); List<Employee>
		 * empList=tqry.getResultList(); System.out.println(empList);
		 */

		// update salary of vijay to 40000

		// update empjpql set salary=40000 where eid=102

	/*	em.getTransaction().begin();
		String str = "update Employee e set e.salary=:p_sal  where e.eid=:p_id";

		Query tqry = em.createQuery(str);

		System.out.println("Enter Id");
		int pid = sc.nextInt();
		tqry.setParameter("p_id", pid);

		System.out.println("Enter Salary");
		double psal = sc.nextInt();
		tqry.setParameter("p_sal", psal);

		int i = tqry.executeUpdate();

		System.out.println(i + " record updated ");

		em.getTransaction().commit();*/

		/*
		 * 
		 * em.getTransaction().begin();
		 * 
		 * String str="Update Employee set ename=:p_name where eid=:id"; Query
		 * qry=em.createQuery(str); qry.setParameter("p_name","NewName");
		 * qry.setParameter("id", 101); int i=qry.executeUpdate();
		 * System.out.println("record updated " +i);
		 * 
		 * em.getTransaction().commit();
		 */

		// Ex 8:
		// Aggregate Functions Sum(sal) ---> Sum(e.sal)
		
		/*Query qry = em.createQuery("Select SUM(e.salary) from Employee e");
		Double sum = (Double) qry.getSingleResult();
		System.out.println(sum);*/
		
		//Ex8 : you can break query in multiple lines if query is lengthy 
	/*	Query qry=em.createQuery("select e from Employee e" +
				" where e.salary" +
				" between 20000 and 30000" );

		List<Employee> empList=qry.getResultList();
		System.out.println(empList);
		 */
		
		//Ex 10 : 		
		//Like 
				
	/*	Query qry=em.createQuery("select e from Employee e where e.ename LIKE '%jay' " );
		List<Employee> empList=qry.getResultList();
		System.out.println(empList); */
		
		
		
				
		
		
		em.close();
	}
}
