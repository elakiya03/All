package com.java.springboot;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;


@CrossOrigin(origins = "http://localhost:3000")
@RestController // = @Controller + @ResponseBody
@RequestMapping("/api/v1/")
public class EmployeeController {
		
	private EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	
	}
	
//	@GetMapping
//	public String getAllEmployee(@RequestParam(value= "page") int page, @RequestParam(value ="limit") int limit){
//		return "users are displayed "+ page + " " + limit; 
//	}
	//for Postman : http://localhost:8080/api/v1/employee?page=1&limit=50
	
	
	
	//build create employee REST API
	@PostMapping
	public ResponseEntity<Employee> saveEmployee(Employee employee){
		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee),HttpStatus.CREATED);
	}
	
	//build get all employee REST API
	@GetMapping
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployee();
	}
	
	//build get employee by id REST API
	@GetMapping("{id}")
	public ResponseEntity<Employee> getEmployeeById(@Valid @PathVariable("id") long employeeId){
		return new ResponseEntity<Employee>(employeeService.getEmployeeById(employeeId), HttpStatus.OK);
	}
	
	
	//build update employee REST API
	@PutMapping("{id}")
	public ResponseEntity<Employee> updateEmployee(@Valid @PathVariable("id") long id, @RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.updateEmployee(employee, id), HttpStatus.OK);
	}
	
	
	//build delete employee REST API
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("id") long id){
		
		employeeService.deleteEmployee(id);
		return new ResponseEntity<String>("employee deleted successfully",HttpStatus.OK);
	}
}
