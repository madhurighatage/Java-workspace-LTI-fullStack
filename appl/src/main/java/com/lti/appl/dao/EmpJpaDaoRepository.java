package com.lti.appl.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.appl.beans.Employee;

public interface EmpJpaDaoRepository  extends JpaRepository<Employee, Integer>{


}