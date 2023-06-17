package com.demo.threads;

import com.demo.beans.MyClass;

public class MyFactorialThread implements Runnable{
	private MyClass ob;
	private int n;
	
	public MyFactorialThread(MyClass ob, int n) {
		super();
		this.ob = ob;
		this.n = n;
	}

	@Override
	public void run() {
		System.out.println("Factorial of "+n+" is "+ob.factorial(n));
	}
	
	
}
