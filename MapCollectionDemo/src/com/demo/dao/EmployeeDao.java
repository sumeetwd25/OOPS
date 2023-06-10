package com.demo.dao;

import java.util.Set;
import java.util.TreeSet;

import com.demo.beans.Employee;

public interface EmployeeDao {

	void save(Employee e);

	void getAll();

	Employee findById(int id);

	Set<Employee> findByName(String name);

	void sortBySalary();

	void sortByName();

	boolean updateSal(int id, int newsal);

	boolean removeById(int id);

}
