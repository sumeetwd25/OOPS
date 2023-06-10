package com.demo.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.demo.beans.Product;

public class TestProductSets {

	public static void main(String[] args) {
		Set<Product> p = new TreeSet<>();
		p.add(new Product(11, "Bourbon", 1));
		p.add(new Product(25, "Oreo", 1));
		p.add(new Product(3, "JimJam", 1));
		p.add(new Product(40, "Lays", 2));
		p.add(new Product(32, "Nachos", 2));
		p.add(new Product(5, "Cheetos", 2));
		p.forEach(a -> {
			System.out.println(a);
		});

		Comparator<Product> c = (o1, o2) -> {
			if (o1.getCatid() < o2.getCatid())
				return -1;
			else if (o1.getCatid() == o2.getCatid()) {
				return o1.getPid()-o2.getPid();
			}		
			else
				return 1;
		};
		
		System.out.println("*********************************************************");
		Set<Product> tset = new TreeSet<>(c);
		tset.addAll(p);
		tset.forEach(a->{
			System.out.println(a);
		});
		
		System.out.println("*********************************************************");
		List<Product> plist = new ArrayList<>();
		plist.addAll(p);
		plist.sort(c);
		plist.forEach(a->{
			System.out.println(a);
		});
	}

}
