package com.demo.test;

import java.util.Set;
import java.util.HashSet;
import java.util.function.Predicate;
import java.util.Iterator;

public class TestHashSet {

	public static void main(String[] args) {
		Set <Integer> hset = new  HashSet <> ();
		hset.add(10);
		hset.add(20);
		hset.add(5);
		for(int i=0;i<10;i++) {
			hset.add(i+10);
		}
		if(hset.add(10)) {
			System.out.println("10 Added");
		}
		else {
			System.out.println("10 not added");
		}
		System.out.println(hset);
		
		Predicate <Integer> p = num -> num>15;
		hset.removeIf(p);
		
		//to navigate through hashset
		//using iterator
		Iterator <Integer> it = hset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		
		//using foreach loop
		for(int ob:hset) {
			System.out.println(ob);
		}
		System.out.println();
		
		//foreach with lambda function 
		hset.forEach(a->{
			System.out.println(a);
		});
	}

}
