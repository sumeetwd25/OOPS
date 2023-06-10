package com.demo.service;

import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
	Scanner sc = new Scanner(System.in);
	private EmployeeDao edao;
	
	public EmployeeServiceImpl() {
		super();
		edao = new EmployeeDaoImpl();
	}

	@Override
	public void addNewEmployee() {
		System.out.print("Enter id: ");
		int id = sc.nextInt();
		System.out.print("Enter name: ");
		String name = sc.next();
		System.out.print("Enter salary: ");
		int salary = sc.nextInt();
		System.out.print("Enter email: ");
		String email = sc.next();
		Employee e = new Employee(id,name,salary,email);
		edao.save(e);
	}

	@Override
	public void displayAll() {
		edao.getAll();
		
	}

	@Override
	public Employee displayById(int id) {
		return edao.findById(id);
	}

	@Override
	public Set<Employee> displayByName(String name) {
		return edao.findByName(name);
	}

	@Override
	public void sortBySal() {
		edao.sortBySalary();
	}

	@Override
	public void sortByName() {
		edao.sortByName();
	}

	@Override
	public boolean modifyBySal(int id, int newsal) {
		return edao.updateSal(id,newsal);
	}

	@Override
	public boolean deleteById(int id) {
		return edao.removeById(id);
	}

}
