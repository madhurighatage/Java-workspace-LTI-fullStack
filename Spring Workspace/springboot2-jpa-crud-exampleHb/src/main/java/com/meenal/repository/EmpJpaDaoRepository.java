package com.meenal.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meenal.entity.EmpTds;
import com.meenal.entity.Employee;

//No More DAO Implementations  !!!!!

// SpringJataJpa 
																	// primary key datatype 
public interface EmpJpaDaoRepository  extends JpaRepository<Employee, Integer>{


	

}
