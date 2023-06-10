package com.demo.dao;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	static Map<Integer, Employee> hm;
	static int cnt;
	static {
		hm = new HashMap<>();
		hm.put(1, new Employee(1, "Tony", 100000, "tonystark@avengers"));
		hm.put(2, new Employee(2, "Thor", 80000, "thor@asgard"));
		hm.put(3, new Employee(3, "Peter", 60000, "peterparker@spiderverse"));
		cnt = 3;
	}

	@Override
	public void save(Employee e) {
		hm.put(++cnt, e);
	}

	@Override
	public void getAll() {
		Set<Map.Entry<Integer, Employee>> s = hm.entrySet();
		for (Map.Entry<Integer, Employee> entry : s) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	@Override
	public Employee findById(int id) {
		return hm.get(id);
	}

	@Override
	public Set<Employee> findByName(String name) {
		Set<Employee> s = new HashSet<>();
		for (Integer ob : hm.keySet()) {
			if(hm.get(ob).getEname().equalsIgnoreCase(name)) {
				s.add(hm.get(ob));
			}
		}
		if(s.size()>0)
			return s;
		return null;
	}

	@Override
	public void sortBySalary() {
		Comparator<Employee> c = (o1,o2)->{
			if(o1.getSal()<o2.getSal())
				return -1;
			else if(o1.getSal()==o2.getSal())
				return 0;
			else
				return 1;
		};
		TreeSet<Employee> ts = new TreeSet<>(c);
		for(Integer ob:hm.keySet()) {
			ts.add(hm.get(ob));
		}
		ts.forEach(a->{
			System.out.println(a);
		});
	}

	@Override
	public void sortByName() {
		Comparator<Employee> c = (o1,o2)->{
				return o1.getEname().compareTo(o2.getEname());
		};
		
		TreeSet<Employee> ts = new TreeSet<>(c);
		for(Integer ob:hm.keySet()) {
			ts.add(hm.get(ob));
		}
		ts.forEach(a->{
			System.out.println(a);
		});
	}

	@Override
	public boolean updateSal(int id, int newsal) {
		Employee e = hm.get(id);
		if(e!=null) {
			e.setSal(newsal);
			return true;
		}
		return false;
	}

	@Override
	public boolean removeById(int id) {
		if(hm.remove(id)!=null) {
			return true;
		}
		return false;
	}

}
