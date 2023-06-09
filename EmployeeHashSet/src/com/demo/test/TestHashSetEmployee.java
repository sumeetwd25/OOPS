package com.demo.test;

import java.util.HashSet;
import java.util.Set;

import com.demo.beans.Employee;

public class TestHashSetEmployee {

	public static void main(String[] args) {
		Set<Employee> s = new HashSet<>();
		s.add(new Employee(1,"xxx",50000));
		s.add(new Employee(2,"yyy",40000));
		s.add(new Employee(3,"zzz",60000));
		System.out.println(s);
		s.forEach(a->{
			System.out.println("\n"+a);
		});
	}

}
