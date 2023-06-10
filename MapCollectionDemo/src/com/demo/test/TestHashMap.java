package com.demo.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestHashMap {

	public static void main(String[] args) {
		Map<String, Integer> hm = new HashMap<>();
		hm.put("Goku", 100);
		hm.put("Vegeta", 80);
		hm.put("Beerus", 150);
		hm.put("Whis", 200);
		System.out.println(hm);
		System.out.println("Value of key \"Goku\":"+hm.get("Goku"));

		Set<String> s = hm.keySet();
		for(String k:s) {
//			if(hm.get(k)>100)
				System.out.println(k);
		}
		
		Map<String,Integer> tm = new TreeMap<>(hm);
		System.out.println(tm);
		
		System.out.println("*********************************************************");
		Set<Map.Entry<String,Integer>> s1 = hm.entrySet();
		for(Map.Entry<String, Integer> entry:s1) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		System.out.println("*********************************************************");
		for(Map.Entry<String, Integer> entry:s1) {
			if(entry.getValue()>100)
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
