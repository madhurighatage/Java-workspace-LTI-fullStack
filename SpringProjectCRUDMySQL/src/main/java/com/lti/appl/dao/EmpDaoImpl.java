package com.lti.appl.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.appl.beans.Employee;
import com.lti.appl.exceptions.CustomEmpException;

@Repository
public class EmpDaoImpl implements EmpDao{

	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public List<Employee> listAllEmployees() {
		String sql= "Select e From Employee e";
		Query qry= em.createQuery(sql);
		List<Employee> empList=qry.getResultList();
		//System.out.println(" on db server" + empList);
				
		return empList;
	}
		
	
	@Override
	@Transactional
	public int addEmployee(Employee e) {

		System.out.println(" dao Layer");
		em.persist(e);		
		return e.getEmpNo();
	}

	@Override
	public Employee getEmpById(int empNo) {

		System.out.println("dao ");
		
		Employee e=em.find(Employee.class,empNo);
		
		return e;
		
	}


	@Override
	@Transactional
	public double updateSalary(int empNo, double sal) throws CustomEmpException {
	
		
		Employee emp=em.find(Employee.class, empNo);
	
		if(emp!=null)
		{
		emp.setEmpSal(sal);
		em.merge(emp);
		
		return emp.getEmpSal();	
		}		
		else
		{
			throw new CustomEmpException("Emp does not exsit");			
		}
		
	}

	

}
