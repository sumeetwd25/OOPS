package com.demo.test;

import com.demo.beans.MyClass;
import com.demo.threads.MyFactorialThread;

public class TestFactorialMain {

	public static void main(String[] args) {
		MyClass ob = new MyClass();
		MyFactorialThread fr = new MyFactorialThread(ob, 5);
		Thread th = new Thread(fr);
		th.start();
	}

}
