package com.demo.test;

import com.demo.beans.MyClass;
import com.demo.threads.MyThread;

public class TestMain {

	public static void main(String[] args) {
		MyClass ob = new MyClass();
		MyThread th1 =new MyThread(ob,5);
		MyThread th2 =new MyThread(ob,7);
		
		th1.start();
		th2.start();
		
		th1.setPriority(Thread.NORM_PRIORITY+3);
		
		try {
			th1.join(400);
			th2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
