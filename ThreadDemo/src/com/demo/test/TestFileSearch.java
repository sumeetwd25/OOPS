package com.demo.test;

import java.util.Scanner;

import com.demo.beans.MyFileReader;
import com.demo.threads.MySearchThread;

public class TestFileSearch {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		MyFileReader fr = new MyFileReader();
		Thread th[]=new Thread[5];
		
		for(int i=0;i<5;i++) {
			System.out.print("Enter a string: ");
			String s1=sc.next();
			th[i]= new MySearchThread(fr,s1);
		}
		for(int i=0;i<5;i++) {
			th[i].start();
		}
		for(int i=0;i<5;i++) {
			try {
				th[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
