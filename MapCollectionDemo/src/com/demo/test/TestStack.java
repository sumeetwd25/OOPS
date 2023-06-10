package com.demo.test;

import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<>();
		stk.push(13);
		stk.add(34);
		stk.push(7);
		System.out.println(stk);
		System.out.println(stk.pop());
		System.out.println(stk);
		System.out.println(stk.pop());
		System.out.println(stk);
	}

}
