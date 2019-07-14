package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeDao;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeDao dao;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/addEmployee")
	public String addEmployee(Employee employee) {
		dao.save(employee);
		return "home.jsp";
	}
	
	@RequestMapping("/getEmployee")
	public ModelAndView getEmployee(@RequestParam int empId) {
		ModelAndView mv = new ModelAndView("getEmployee.jsp");
		Employee employee = dao.findById(empId).orElse(new Employee());
		mv.addObject(employee);
		return mv;
	}
}
