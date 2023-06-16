package com.demo.beans;

public class MyClass {

	public void printTable(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n+"*"+i+"="+(n*i));	
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
