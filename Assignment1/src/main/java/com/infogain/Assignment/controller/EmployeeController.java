package com.infogain.Assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@PostMapping(value = "/add")
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
	}
	
	@PutMapping(value = "/update")
	public void updateEmployee(@RequestBody Employee employee) {
		employeeService.updateEmployee(employee);
	}
	
	@DeleteMapping(value = "/{empId}")
	public void deleteEmployee(@PathVariable("empId") String empId) {
		employeeService.deleteEmployee(empId);
	}
}
