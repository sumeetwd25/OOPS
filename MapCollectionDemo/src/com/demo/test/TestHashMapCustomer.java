package com.demo.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.demo.beans.Customer;
import com.demo.beans.Item;

public class TestHashMapCustomer {

	public static void main(String[] args) {
		Map<Customer, ArrayList<Item>> cm = new HashMap<>();
		ArrayList<Item> arr1 = new ArrayList<>();
		arr1.add(new Item(1, "Knife", 1));
		arr1.add(new Item(2, "Poison", 2));
		cm.put(new Customer(47, "Hitman"), arr1);
		System.out.println(cm);
		
		ArrayList<Item> arr2 = new ArrayList<>();
		arr2.add(new Item(6,"Handgun",1));
		arr2.add(new Item(8,"Bullet",10));
		cm.put(new Customer(007,"Bond"), arr2);
		System.out.println(cm);
		
		Set<Map.Entry<Customer,ArrayList<Item>>> s = cm.entrySet();
		for(Map.Entry<Customer, ArrayList<Item>> entry:s) {
			System.out.println("\n"+entry.getKey()+"\n"+entry.getValue());
		}
	}

}
