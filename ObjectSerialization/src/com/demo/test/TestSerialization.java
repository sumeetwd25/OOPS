package com.demo.test;

import com.demo.service.StudentService;
import com.demo.service.StudentSeviceImpl;

public class TestSerialization {

	public static void main(String[] args) {
		StudentService  ss =new StudentSeviceImpl();
		ss.writeFile();
		ss.readFile();
	}

}
