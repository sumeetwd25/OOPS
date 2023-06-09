package com.demo.test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TestHashSetString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<String> s = new HashSet<>();
		
		for(int i=0;i<5;i++){
			System.out.print("Enter string: ");
			String str = sc.next();
			s.add(str);
		}
		System.out.println(s);
		sc.close();
	}
}
