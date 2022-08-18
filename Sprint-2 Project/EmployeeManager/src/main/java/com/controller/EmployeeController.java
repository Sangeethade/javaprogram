package com.controller;

import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Employee;
import com.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService empservice;
	
	  //request to add employee details using postman 
	@PostMapping("/saveemployee")
	public ResponseEntity<Employee> saveEmployee( @Valid @RequestBody Employee employee) {
		return new ResponseEntity<Employee>(empservice.saveEmployee(employee),HttpStatus.CREATED);
		
	}
	//request to get all employee details using postman
	@GetMapping("/getallemployee")
	public List<Employee> getAllEmployees(){
		return empservice.getAllEmployees();
			
	}
	//request to get employee details by their id using postman
	@GetMapping("/getemployeebyid/{id}")
	public ResponseEntity<Employee> getEmployeeById( @PathVariable("id") int id) {
		return new ResponseEntity<Employee>(empservice.getEmployeeById(id),HttpStatus.OK);
			
	}
	//request to update employee details by their id using postman
	@PutMapping("/updateemployeebyid/{id}")
	public ResponseEntity<Employee> updateEmployeeById( @RequestBody Employee employee,@Valid @PathVariable("id") int id){
		return new ResponseEntity<Employee>(empservice.updateEmployeeById(employee, id),HttpStatus.OK);
		
	}
	//request to delete employee details by their id using postman
	@DeleteMapping("/deleteemployeebyid/{id}")
	public ResponseEntity<String> deleteEmployeeById( @PathVariable("id") int id) {
		
		empservice.deleteEmployeeById(id);
		return new ResponseEntity<String>("Employee details of " + id + " has been deleted succesfully",HttpStatus.OK);

	}
	//request to get employee details by their first name using postman
	@GetMapping("/getemployeebyname/{fname}")
	public Employee getEmployeeByName(@PathVariable String fname){
		
		return empservice.getEmployeeByName(fname);
	}
	//request to get employee details by their email using postman
	@GetMapping("/getemployeebyemail/{email}")
	public Employee getEmployeeByEmail(@PathVariable String email){
		
		return empservice.getEmployeeByEmail(email);
	}
	//request to get employee details by their phone using postman
	@GetMapping("/getemployeebyphone/{phone}")
	public Employee getEmployeeByPhone(@PathVariable long phone){
		
		return empservice.getEmployeeByPhone(phone);
	}
	
}
