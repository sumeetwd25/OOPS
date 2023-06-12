package com.demo.test;

import java.util.Scanner;

import com.demo.exceptions.WrongAgeException;

public class TestCustomException {

	public static void acceptData() throws WrongAgeException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age: ");
		int age = sc.nextInt();
		sc.close();
		System.out.println(age);

		if (age < 18 || age > 60) {
			throw new WrongAgeException("Age should be beween 18 & 60");
		}
	}

	public static void main(String[] args) {
		try {
			acceptData();
		} catch (WrongAgeException e) {
			System.out.println(e.getMessage());
		}

	}

}
