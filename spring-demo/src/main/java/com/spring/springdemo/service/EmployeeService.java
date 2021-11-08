package com.spring.springdemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.springdemo.model.Employee;

@Service
public class EmployeeService {

	private List<Employee> empList= new ArrayList<>();

	public List<Employee> getEmployee(){
		return empList;
	}
	
	public void addEmployee(Employee employee) {
		empList.add(employee);
	}
	
	public void updateEmployee(Employee employee) {
		if(empList.contains(employee)) {
			empList.remove(employee);
			empList.add(employee);
		}
		else {
			throw new RuntimeException("Employee Object Not Found");
		}
	}
	
	public void deleteEmployee(String empId) {
		Employee emp= empList.stream().filter(obj->obj.getEmployeeId().equals(empId)).findFirst().orElse(null);
		
		if(emp != null) {
			empList.remove(emp);
		}
		else {
			throw new RuntimeException("Employee Object Not Found");
		}
	}
}
