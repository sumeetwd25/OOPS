package com.demo.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestCopyFile {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("test.txt");
			int i = fis.read();
			fos = new FileOutputStream("testcopy.txt");
			while (i != -1) {
				fos.write(i);
				i = fis.read();
			}

		} 
		catch (FileNotFoundException e) {
			System.out.println("File not found");
//			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		} 
		finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}catch(NullPointerException e){
				System.out.println("Cannot close null file");
			}
		}
	}

}
