package com.infogain.Assignment.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infogain.Assignment.exception.EmployeeNotFoundException;
import com.infogain.Assignment.model.Employee;
import com.infogain.Assignment.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository repository;

	public List<Employee> getEmployee(){
		List<Employee> list=new ArrayList<>();
		repository.findAll().forEach(emp->list.add(emp));
//		findAll.forEach(emp->list.add(emp));
		return list;
	}
	
	public Employee getEmployee(Integer id) {
		Optional<Employee> empOptional = repository.findById(id);
		if(empOptional.isPresent())
			return empOptional.get();
		else
			throw new EmployeeNotFoundException("Employee Not Exist");
	}
	
	public Employee addEmployee(Employee employee) {
		return repository.save(employee);
	}
	
	public void deleteEmployee(Integer empId) {
		Optional<Employee> empOptional = repository.findById(empId);
		if(empOptional.isPresent())
			repository.deleteById(empId);
		else
			throw new EmployeeNotFoundException("Employee Not Exist");
	}
}
