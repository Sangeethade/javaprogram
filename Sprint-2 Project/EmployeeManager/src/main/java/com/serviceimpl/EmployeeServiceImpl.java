package com.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exception.EmployeeNotFoundException;
import com.model.Employee;
import com.repository.EmployeeRepository;
import com.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository emprepo;
	
	//-----------------------------------------EMPLOYEE DETAILS SEVICE IMPLEMENTATION---------------------------------------------------------//

	@Override
	//save employee details using employee repository object
	public Employee saveEmployee(Employee employee) {
		
		double ann = employee.getMonthly()*12;
		employee.setAnnual(ann);
		
		return emprepo.save(employee);
	}

	@Override
	//fetch all employee details using employee repository object
	public List<Employee> getAllEmployees() {
		
		return emprepo.findAll();
	}

	@Override
	//fetch specify employee details using employee repository object
	public Employee getEmployeeById(int id) {
		//getting employee by Id,if not present throw custom exception
		return emprepo.findById(id).orElseThrow(()-> new EmployeeNotFoundException("Employee not found"));
	}

	@Override
	//fetch specify employee details & delete it using employee repository object
	public void deleteEmployeeById(int id) {
		//deleting employee by id,if not present throw custom exception
		emprepo.findById(id).orElseThrow(()-> new EmployeeNotFoundException("Employee not found"));
		emprepo.deleteById(id);
	}

	@Override
	//fetch specify employee details & update it using employee repository object
	public Employee updateEmployeeById(Employee employee, int id) {
		//updating employee by id,if not present throw custom exception
		Employee e = emprepo.findById(id).orElseThrow(()-> new EmployeeNotFoundException("Employee not found"));
		
		double uann = employee.getMonthly()*12;
		employee.setAnnual(uann);
		
		
		//set new value
		e.setFname(employee.getFname());
		e.setLname(employee.getLname());
		e.setDob(employee.getDob());
		e.setEmail(employee.getEmail());
		e.setPhone(employee.getPhone());
		e.setLocation(employee.getLocation());
		e.setMonthly(employee.getMonthly());
		e.setAnnual(uann);
		
		emprepo.save(e);
		
		return e;
	}

	//get employee details by name
	@Override
	
	public Employee getEmployeeByName(String fname) {
		
		return emprepo.getEmployeeByName(fname);
	}

	//get employee details by email
	@Override
	public Employee getEmployeeByEmail(String email) {
		
		return emprepo.getEmployeeByEmail(email);
	}

	//get employee details by phone
	@Override
	public Employee getEmployeeByPhone(long phone) {
		
		return emprepo.getEmployeeByPhone(phone);
	}

	

}
