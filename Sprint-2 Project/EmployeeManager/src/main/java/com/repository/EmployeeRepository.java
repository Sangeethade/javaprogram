package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	
	
	// fetch employee details by employeeName from db table using @query
	@Query("select f from Employee f where f.fname=?1")
	Employee getEmployeeByName(String fname);
	
	
	// fetch employee details by employeeEmail from db table using @query
	@Query("select e from Employee e where e.email=?1")
	Employee getEmployeeByEmail(String email);
	
	
	// fetch employee details by employee Phone Number from db table using @query
	@Query("select p from Employee p where p.phone=?1")
	Employee getEmployeeByPhone(long phone);

	
}
