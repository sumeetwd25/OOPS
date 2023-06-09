package com.demo.dao;

import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeDao {

	void save(Employee e);

	Set<Employee> getAll();

	Employee searchById(int id);

	Employee searchByName(String name);

	Set<Employee> sortByName();

}
