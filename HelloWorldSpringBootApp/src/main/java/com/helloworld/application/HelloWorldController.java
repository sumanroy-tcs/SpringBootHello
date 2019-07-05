package com.helloworld.application;



import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.helloworld.model.*;


@RestController
@RequestMapping("/Employee")
public class HelloWorldController {
	
	@Autowired
	EmployeeService es;
	
	@RequestMapping(value="/hello")
	public String hello() {
		return "Hello World, This is rest Controller V2";
	}
	
	@RequestMapping(value="/all")
	public Hashtable <String, Employee> getAll(){
		return es.getAllEmployee();
	}
	
	@RequestMapping("{id}")
	public Employee getEmployee(@PathVariable("id") String id) {
		return es.getEmployee(id);
	}
}
