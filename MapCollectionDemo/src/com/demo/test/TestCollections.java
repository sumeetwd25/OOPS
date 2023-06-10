package com.demo.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestCollections {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,34,76,21,89,12,3);
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println("Min. value: "+Collections.min(list));
		System.out.println("Max. value: "+Collections.max(list));
		
		Collections.shuffle(list);
		System.out.println(list);
		
	}

}
