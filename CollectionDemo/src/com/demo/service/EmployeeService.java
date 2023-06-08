package com.demo.service;

import java.util.List;
import com.demo.beans.Employee;

public interface EmployeeService {
	void addNewEmployee();
	
	List<Employee> displayAll();

	Employee searchById(int id);

	Employee searchByName(String name);
}
