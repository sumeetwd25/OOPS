package com.demo.threads;

import com.demo.beans.MyFileReader;

public class MySearchThread extends Thread{
	private MyFileReader fr;
	private String s1;
	
	public MySearchThread(MyFileReader fr, String s1) {
		super();
		this.fr = fr;
		this.s1 = s1;
	}
	
	public void run() {
		boolean status=fr.searchData("test.txt",s1);
		if(status) {
			System.out.println("Found");
		}
		else {
			System.out.println("File not found");
		}
	}
}
