package com.demo.service;

import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeSerivce {

	void addNewEmployee();

	Set<Employee> displayAll();

	Employee displayById(int id);

	Employee displayByName(String name);

	Set<Employee> sortByName();

	Set<Employee> sortBySal();

	boolean modifySal(int id, int newsal);

	boolean deleteById(int id);
	
	
}
