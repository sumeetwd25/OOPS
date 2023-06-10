package com.demo.test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class TestHashMap2 {

	public static void main(String[] args) {
		Map<String,Integer> hm = new HashMap<>();
		hm.put(null, null);
		hm.put("xxx", null);
		hm.put("yyy", null);
		hm.put("xxx", 50);
		System.out.println(hm);
		
		if(!hm.containsKey("xxx")) {
			hm.put("xxx", 10);
		}
		if(!hm.containsKey("vvv")) {
			hm.put("vvv", 20);
		}
		System.out.println(hm);
		
//		Null key,value is not allowed in Hashtable
		Map<String,Integer> ht = new Hashtable<>();
//		ht.put(null, null);
	}

}
