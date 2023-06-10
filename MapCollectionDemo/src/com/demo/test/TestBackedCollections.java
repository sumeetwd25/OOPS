package com.demo.test;

import java.util.Set;
import java.util.TreeSet;

public class TestBackedCollections {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(43);
		ts.add(9);
		ts.add(57);
		ts.add(12);
		ts.add(3);
		
		Set<Integer> s = ts.headSet(12);
		System.out.println(ts);
		System.out.println(s);
		
		s = ts.tailSet(12);
		System.out.println(s);
		
		ts.add(26);
		System.out.println("After adding 26, headset: "+ts.headSet(12));
		System.out.println("After adding 26, tailset: "+ts.tailSet(12));
	}

}
