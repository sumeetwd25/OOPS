package com.demo.test;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class TestIntStream {

	public static void main(String[] args) {
		IntStream intst = IntStream.of(10, 20, 30, 40, 50, 60);
		OptionalInt s = intst.filter(x -> x < 30).findFirst();
		if (s.isPresent()) {
			System.out.println(s.getAsInt());
		}
	}

}
