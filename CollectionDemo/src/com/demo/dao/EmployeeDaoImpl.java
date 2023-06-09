package com.demo.dao;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	private static List<Employee> elist;
	static {
		elist = new ArrayList<>();
		elist.add(new Employee(1,"xxx","game designer",100000));
		elist.add(new Employee(2,"zzz","ux designer",50000));
		elist.add(new Employee(3,"yyy","analyst",80000));
	}

	@Override
	public void save(Employee e) {
		elist.add(e);	
	}

	@Override
	public List<Employee> getAllEmployee() {
		return elist;
	}

	@Override
	public Employee findById(int id) {
		for(int i=0;i<elist.size();i++) {
			if(elist.get(i).getEid()==id) {
				return elist.get(i);
			}
		}
		return null;
	}

	@Override
	public Employee findByName(String name) {
		for(int i=0;i<elist.size();i++) {
			if(elist.get(i).getEname().equals(name)) {
				return elist.get(i);
			}
		}
		return null;
	}

	@Override
	public List<Employee> sortBySalary() {
		List<Employee> newlist = new ArrayList<>();
		for(Employee e : elist) {
			newlist.add(e);
		}
		newlist.sort(null);
		return newlist;
	}

	@Override
	public List<Employee> sortByName() {
		List<Employee> newlist = new ArrayList<>();
		for(Employee e : elist) {
			newlist.add(e);
		}
		Comparator <Employee> c =(o1,o2)->{
			return o1.getEname().compareTo(o2.getEname());
		};
		newlist.sort(c);
		return newlist;
	}

	@Override
	public boolean updateById(int id, int newsal) {
		Employee e = findById(id);
		if(e!=null) {
			e.setSal(newsal);
			return true;
		}
		return false;
	}

	@Override
	public boolean removeById(int id) {
		for(int i=0;i<elist.size();i++) {
			if(elist.get(i).getEid()==id) {
				elist.remove(i);
				return true;
			}
		}
		return false;
	}

}
