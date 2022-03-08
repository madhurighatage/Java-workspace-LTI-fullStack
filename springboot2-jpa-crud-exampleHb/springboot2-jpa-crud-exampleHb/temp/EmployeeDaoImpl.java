package com.meenal.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import com.meenal.entity.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Employee> getEmpList() {
		
		System.out.println("inside Services");
		String jpql = "select e from Employee e";
		TypedQuery<Employee> tquery = entityManager.createQuery(jpql,Employee.class);
		return tquery.getResultList();
		
		
	}

	@Override
	public Employee getEmpDetails(int id) {
		return entityManager.find(Employee.class,id);		
	}

	
	@Transactional
	@Override
	public Employee addNewEmployee(Employee emp) {
		entityManager.persist(emp);		
		return emp;
	}

	@Override
	public List<Integer> getEmpIds() {
		System.out.println("inside Services");
		String jpql = "select id from Employee e ";
		TypedQuery<Integer> tquery = (TypedQuery<Integer>) entityManager.createQuery(jpql);
		System.out.println(tquery.getResultList());
		return tquery.getResultList();
	}

	
	@Override
	@Transactional
	public int updateEmployee(Employee emp)
	{
		entityManager.merge(emp);
		return emp.getId();
	}

	
}
