package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Integer>{

}
