package com.demo.test;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {

	public static void main(String[] args) {
		Map<String,Integer> tm = new TreeMap<>();
		tm.put("Naruto", 8);
		tm.put("Sasuke", 9);
		tm.put("Sakura", 7);
		tm.put("Kakashi", 10);
		System.out.println(tm);
	}

}
