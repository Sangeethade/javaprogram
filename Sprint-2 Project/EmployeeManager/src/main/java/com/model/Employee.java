package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="employee_details")
@Entity
public class Employee {
	@Id
    @Column(name="emp_id",length=7)
	private int id;
	
	@Column(name = "emp_firstname",length=20,nullable = false)
    @NotBlank(message="please enter first name")
	private String fname;
	
	@Column(name = "emp_lastname",length=20)
	private String lname;
	
	@Column(name = "emp_dob",length=12,nullable = false)
	private String dob;
	
	@Column(name="emp_email",length=40,unique = true,nullable = false)
	@Email(message="Enter proper email Id")
	private String email;
	
	@Column(name="emp_phoneno",length = 12,unique = true,nullable = false)
	private long phone;
	
	@Column(name="emp_location",length = 50,nullable = false)
	private String location;
	
	@Column(name="monthly_salary")
	private double monthly;
	
	@Column(name="annual_salary")
	private double annual;

}
