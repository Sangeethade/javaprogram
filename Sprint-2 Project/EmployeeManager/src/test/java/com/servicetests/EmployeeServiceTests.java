package com.servicetests;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.model.Employee;
import com.repository.EmployeeRepository;
import com.service.EmployeeService;

@SpringBootTest
public class EmployeeServiceTests {
	@Autowired
	EmployeeService empservice;

	@MockBean
	EmployeeRepository emprepo;
	
	//testing the SaveEmployee method
	@Test
	public void testSaveEmployee() {
		
		Employee e = new Employee();
		e.setId(101);
		e.setFname("vijay");
		e.setLname("kumar");
		e.setDob("14/11/2000");
		e.setEmail("vijay@gmail.com");
		e.setPhone(908070605);
		e.setLocation("Chennai");
		e.setMonthly(7000);
		
        Mockito.when(emprepo.save(e)).thenReturn(e);
        
        assertThat(empservice.saveEmployee(e)).isEqualTo(e); 
		

	}
	//testing the GetAllEmployees method
		@Test
	    public void testGetAllEmployees() {
			
			Employee e1 = new Employee();
			e1.setId(101);
			e1.setFname("vijay");
			e1.setLname("kumar");
			e1.setDob("14/11/2000");
			e1.setEmail("vijay@gmail.com");
			e1.setPhone(908033605);
			e1.setLocation("Chennai");
			e1.setMonthly(7000);
			
			Employee e2 = new Employee();
			e2.setId(102);
			e2.setFname("ajith");
			e2.setLname("kumar");
			e2.setDob("04/10/2000");
			e2.setEmail("ajith@gmail.com");
			e2.setPhone(966070605);
			e2.setLocation("Chennai");
			e2.setMonthly(7000);
			
			List<Employee> so = new ArrayList<Employee>();
			so.add(e1);
			so.add(e2);
	    	
			Mockito.when(emprepo.findAll()).thenReturn(so);
				
			assertThat(empservice.getAllEmployees()).isEqualTo(so);
			
		}
		//testing the GetEmployeeById method
		@Test
	    public void testGetEmployeeById() {

			Employee e3 = new Employee();
			e3.setId(101);
			e3.setFname("vijay");
			e3.setLname("kumar");
			e3.setDob("14/11/2000");
			e3.setEmail("vijay@gmail.com");
			e3.setPhone(908070605);
			e3.setLocation("Chennai");
			e3.setMonthly(7000);
			
	        Optional<Employee> qp = Optional.of(e3);
			
	        Mockito.when(emprepo.findById(101)).thenReturn(qp);
	        
	        assertThat(empservice.getEmployeeById(101)).isEqualTo(e3);
			
		}
		//testing the DeleteEmployeeById method
		@Test
	    public void testDeleteEmployeeById() {
			
			Employee e4 = new Employee();
			e4.setId(101);
			e4.setFname("vijay");
			e4.setLname("kumar");
			e4.setDob("14/11/2000");
			e4.setEmail("vijay@gmail.com");
			e4.setPhone(908070605);
			e4.setLocation("Chennai");
			e4.setMonthly(7000);
			
	        Optional<Employee> qp1 = Optional.of(e4);
			
	        Mockito.when(emprepo.existsById(101)).thenReturn(false);
	        
	        assertThat(emprepo.existsById(qp1.get().getId()));
			
			
		}
		//testing the UpdateEmployeeById method
		@Test
	    public void testUpdateEmployeeById() {
			
			Employee e5 = new Employee();
			e5.setId(101);
			e5.setFname("vijay");
			e5.setLname("kumar");
			e5.setDob("14/11/2000");
			e5.setEmail("vijay@gmail.com");
			e5.setPhone(908070605);
			e5.setLocation("Chennai");
			e5.setMonthly(7000);
			
			Optional<Employee> q = Optional.of(e5);
			Employee ep = q.get();
			
	        Mockito.when(emprepo.findById(101)).thenReturn(q);
	        
	        ep.setPhone(807058070);
			Mockito.when(emprepo.save(ep)).thenReturn(ep);
			
			assertThat(empservice.updateEmployeeById(ep,101)).isEqualTo(ep);
			
		}
		//testing the GetEmployeeByName method
		@Test
	    public void testGetEmployeeByName() {
			
			Employee e6 = new Employee();
			e6.setId(101);
			e6.setFname("vijay");
			e6.setLname("kumar");
			e6.setDob("14/11/2000");
			e6.setEmail("vijay@gmail.com");
			e6.setPhone(908070605);
			e6.setLocation("Chennai");
			e6.setMonthly(7000);
			
	        Mockito.when(empservice.getEmployeeByName("vijay")).thenReturn(e6);
	        
			assertThat(empservice.getEmployeeByName("vijay")).isEqualTo(e6);

		}
		//testing the GetEmployeeByEmail method
		@Test
	    public void testGetEmployeeByEmail() {
			
			Employee e7 = new Employee();
			e7.setId(101);
			e7.setFname("vijay");
			e7.setLname("kumar");
			e7.setDob("14/11/2000");
			e7.setEmail("vijay@gmail.com");
			e7.setPhone(908070605);
			e7.setLocation("Chennai");
			e7.setMonthly(7000);
			
	        Mockito.when(empservice.getEmployeeByEmail("vijay@gmail.com")).thenReturn(e7);
	        
			assertThat(empservice.getEmployeeByEmail("vijay@gmail.com")).isEqualTo(e7);

		}
		//testing the GetEmployeeByPhone method
		@Test
	    public void testGetEmployeeByPhone() {
			
			Employee e8 = new Employee();
			e8.setId(101);
			e8.setFname("vijay");
			e8.setLname("kumar");
			e8.setDob("14/11/2000");
			e8.setEmail("vijay@gmail.com");
			e8.setPhone(908070605);
			e8.setLocation("Chennai");
			e8.setMonthly(7000);
			
	        Mockito.when(empservice.getEmployeeByPhone(908070605)).thenReturn(e8);
	        
			assertThat(empservice.getEmployeeByPhone(908070605)).isEqualTo(e8);
			
		}
	
}


