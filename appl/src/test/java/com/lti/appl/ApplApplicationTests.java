package com.lti.appl;


import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.lti.appl.beans.Employee;
import com.lti.appl.services.EmpServicesImpl;

//Mocking and stubbing are the cornerstones of having quick and simple unit tests. 
//Mocks are useful if you have a dependency on an external system, file reading takes too long, 
//the database connection is unreliable or it's down for maintenance.,  or if you don’t want to send an email after every test.
//The web service is not reachable, The message queue is heavy and slow.

//Mock Objects :  replacement of a dependent component (collaborator) of the object under test
// The purpose is to mimic the collaborator to make the object under test think that it is actually using the collaborator.


@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class ApplApplicationTests {

	@Autowired
	MockMvc mockMvc;

	@MockBean
	EmpServicesImpl empService;

	@Test
	public void someTest() {
		System.out.println(" test case called ");
		String str = "hello";
		Assertions.assertEquals("hello", str);
	}

	@Test
	public void testfindEmp() throws Exception {
		
		//Stubbing - simulating the behavior of a mock object’s method. 
		// setting up an expectation on the method invocation.
		// we can stub the getEmpById(102) method to return a specific value when the method is called.
		//when() method represents the trigger to start the stubbing 
		//and thenReturn() represents the action of the trigger 
		Employee emp = new Employee(102, "Vijay", 50000);		
		Mockito.when(empService.getByEmpId(102)).thenReturn(emp);
		

		this.mockMvc.perform(get("http://localhost:8080/emp/employee/102"))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.empName", Matchers.is("Vijay")));		
		

		//Verifying
//		verify(empService, times(1));
		
		
		/*Verify:  para 
			times(..)Number of invocations done on a method:
			Sequence of Invocation: 
			Exception verification: 
			Behavior during exception: 
		*/
	}

	@Test
	public void getAllEmployeesTest() throws Exception {
		List<Employee> list = new ArrayList<Employee>();

		Employee e1 = new Employee(101, "Jay", 50000);
		Employee e2 = new Employee(102, "Vijay", 50000);
		Employee e3 = new Employee(103, "Sanjay", 50000);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		Mockito.when(empService.listAllEmployees()).thenReturn(list);
		this.mockMvc.perform(get("http://localhost:8080/emp/listall")).andExpect(status().isOk());
	}
	

	@Test
	public void addEmp() throws Exception {
		Employee e1 = new Employee(102, "Gaurav", 50000);
		Employee added = new Employee(110, "Gaurav", 50000);
		//Mockito.when(empService.addEmployee(e1)).thenReturn(e1.getEmpNo());
		
		//verify(empService, times(1)).addEmployee(e1);
		   
	}
	
	
	
	
}

/*
 * 
 * public static String asJsonString(final Object obj) { try { final
 * ObjectMapper mapper = new ObjectMapper(); final String jsonContent =
 * mapper.writeValueAsString(obj); return jsonContent; } catch (Exception e) {
 * throw new RuntimeException(e); }
 */

/*
 * mockMvc.perform(post("http://localhost:8090/api/v1/addnewemp")
 * .contentType(MediaType.APPLICATION_JSON) .content(asJsonString(e1)).
 * andExpect(status().isOk()).andReturn());
 * 
 * }
 */