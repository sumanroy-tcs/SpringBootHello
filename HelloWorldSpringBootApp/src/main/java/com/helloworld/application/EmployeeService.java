package com.helloworld.application;

import java.util.Hashtable;

import org.springframework.stereotype.Service;
import com.helloworld.model.Employee;

@Service
public class EmployeeService {

		Hashtable <String, Employee> employee = new Hashtable<String, Employee>();
		public EmployeeService() {
			Employee obj = new Employee();
			obj.setFirstName("Suman");
			obj.setId("1733861");
			obj.setLastName("Deb Roy");
			obj.setSalary(700000);
			employee.put("1", obj);
			
			obj = new Employee();
			obj.setFirstName("Indrasish");
			obj.setId("1733792");
			obj.setLastName("Chatterjee");
			obj.setSalary(800000);
			employee.put("2", obj);
			
		}
		
		public Employee getEmployee(String id) {
			if(employee.containsKey(id))
				return employee.get(id);
			else
				return null;
		}
		
		public Hashtable <String, Employee> getAllEmployee() {
			return employee;
		}
}
