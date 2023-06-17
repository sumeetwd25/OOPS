package com.demo.test;

import com.demo.enums.Coffee;

public class TestEnum {

	public static void main(String[] args) {
		Coffee c = Coffee.medium;
		switch (c) {
		case small:
			System.out.println("Small selected");
			System.out.println("Size in ml: " + c.getSize());
			System.out.println("Price: " + c.getPrice());
			break;

		case medium:
			System.out.println("Medium selected");
			System.out.println("Size in ml: " + c.getSize());
			System.out.println("Price: " + c.getPrice());
			break;

		case large:
			System.out.println("Large selected");
			System.out.println("Size in ml: " + c.getSize());
			System.out.println("Price: " + c.getPrice());
			break;

		default:
			break;
		}
		System.out.println("Index: " + c.ordinal());
		c.setPrice(270);
		System.out.println("New price: " + c.getPrice());
	}

}
