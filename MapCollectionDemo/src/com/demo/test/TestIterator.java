package com.demo.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestIterator {

	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<>();
		lst.add(23);
		lst.add(4);
		lst.add(32);
		lst.add(15);
		
		//Do not modify list in for-each loop. Instead, use iterator 
		Iterator<Integer> it = lst.iterator();
		while(it.hasNext()){
			it.next();
			if(it.next()==4) {
				it.remove();
			}
		}
		
		for(Integer ob:lst) {
			System.out.println(ob);
		}
		
		//List iterators for navigating in both directions
		ListIterator<Integer> lit = lst.listIterator();
		System.out.println("\n"+lit.next());
		System.out.println(lit.next());
		System.out.println(lit.previous());
		System.out.println(lit.previous());
	}

}
