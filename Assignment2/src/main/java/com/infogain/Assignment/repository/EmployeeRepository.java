package com.infogain.Assignment.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infogain.Assignment.model.Employee;

@Repository
public interface EmployeeRepository  extends CrudRepository<Employee, Integer> {

//	public List<Employee> getEmployee();
}
