package com.infogain.Assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infogain.Assignment.model.Employee;
import com.infogain.Assignment.service.EmployeeService;

@RestController
@RequestMapping(value = "/management")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/get")
	public List<Employee> getEmployees(){
		return employeeService.getEmployee();
	}
	
	@GetMapping("/get/{empId}")
	public Employee getEmployeeById(@PathVariable("empId") Integer empId){
		return employeeService.getEmployee(empId);
	}
	
	@PostMapping(value = "/add")
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
	}
	
	@DeleteMapping(value = "/{empId}")
	public void deleteEmployee(@PathVariable("empId") Integer empId) {
		employeeService.deleteEmployee(empId);
	}
}
