package com.demo.service;

import java.util.List;
import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService{
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
		System.out.print("Enter designation: ");
		String des = sc.next();
		System.out.print("Enter salary: ");
		int sl = sc.nextInt();
		Employee e = new Employee(id,name,des,sl);
		edao.save(e);
	}

	@Override
	public List<Employee> displayAll() {
		return edao.getAllEmployee();
	}

	@Override
	public Employee searchById(int id) {
		return edao.findById(id);
	}

}
