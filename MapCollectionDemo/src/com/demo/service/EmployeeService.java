package com.demo.service;

import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeService {

	void addNewEmployee();

	void displayAll();

	Employee displayById(int id);

	Set<Employee> displayByName(String name);

	void sortBySal();

	void sortByName();

	boolean modifyBySal(int id, int newsal);

	boolean deleteById(int id);

}
