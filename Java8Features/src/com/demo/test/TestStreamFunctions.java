package com.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestStreamFunctions {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();
		lst.add("Hello");
		lst.add("Welcome");
		lst.add("Testing");
		lst.stream().forEach(System.out::println);
		
		List<String> lst2 = lst.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(lst2);
		
		Optional<String> s=lst.stream().reduce((a,b)->a+b);
		if(s.isPresent()) {
			System.out.println(s.get());
		}
		
		List<Integer> lst1= new ArrayList<>();
		lst1.stream().map(x->x*x).findFirst();
	}

}
