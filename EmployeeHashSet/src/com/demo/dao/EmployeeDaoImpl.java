package com.demo.dao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	static Set<Employee> s;
	static {
		s = new HashSet<>();
		s.add(new Employee(1, "xxx", 90000));
		s.add(new Employee(2, "zzz", 50000));
		s.add(new Employee(3, "yyy", 70000));
	}

	@Override
	public void save(Employee e) {
		s.add(e);
	}

	@Override
	public Set<Employee> getAll() {
		return s;
	}

	@Override
	public Employee searchById(int id) {
		for (Employee e : s) {
			if (e.getEid() == id) {
				return e;
			}
		}
		return null;
	}

	@Override
	public Employee searchByName(String name) {
		for (Employee e : s)
			if (e.getEname().equalsIgnoreCase(name)) {
				return e;
			}
		return null;
	}

	@Override
	public Set<Employee> sortByName() {
		
		Comparator<Employee> c = (o1,o2)->{
			return o1.getEname().compareTo(o2.getEname());
		};
		
		Set<Employee> tset = new TreeSet<>(c);
		for (Employee ob : s) {
			tset.add(ob);
		}
		return tset;
	}

}
