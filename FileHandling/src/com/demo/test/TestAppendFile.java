package com.demo.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestAppendFile {

	public static void main(String[] args) {
		File f = new File("test.txt");
		FileOutputStream fos = null;
		
		//create new test file or do not create if already exists.
		try {
			if (!f.exists()) {
				fos = new FileOutputStream("testcopy.txt");
			} else {
				fos = new FileOutputStream("testcopy.txt", true);
			}
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//append text from test file to the same file
		try (FileInputStream fis = new FileInputStream("test.txt"); FileOutputStream fos1 = fos;) {
			int i = fis.read();
			while (i != -1) {
				fos1.write(i);
				i = fis.read();
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		} 
		finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
