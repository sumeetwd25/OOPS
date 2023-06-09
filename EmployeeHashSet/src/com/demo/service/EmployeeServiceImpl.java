package com.demo.service;

import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeSerivce {
	Scanner sc = new Scanner(System.in);
	private EmployeeDao edao;
	
	public EmployeeServiceImpl() {
		super();
		this.edao = new EmployeeDaoImpl();
	}

	@Override
	public void addNewEmployee() {
		System.out.print("Enter id: ");
		int id = sc.nextInt();
		System.out.print("Enter name: ");
		String name = sc.next();
		System.out.print("Enter salary: ");
		int sal = sc.nextInt();
		Employee e = new Employee(id,name,sal);
		edao.save(e);
	}

	@Override
	public Set<Employee> displayAll() {
		return edao.getAll();
	}

	@Override
	public Employee displayById(int id) {
		return edao.searchById(id);
	}

	@Override
	public Employee displayByName(String name) {
		return edao.searchByName(name);
	}

	@Override
	public Set<Employee> sortByName() {
		return edao.sortByName();
	}

}
