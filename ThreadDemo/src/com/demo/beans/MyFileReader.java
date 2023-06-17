package com.demo.beans;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {

	public boolean searchData(String fn, String search) {
	
	try(BufferedReader br = new BufferedReader(new FileReader(fn));) 
	{
		String s = null;
		do {
			s=br.readLine();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(search.equals(s)) {
				return true;
			}
		}while(s!=null);
	} 
	catch (IOException e) 
	{
		e.printStackTrace();
	}
		return false;
	}

}
