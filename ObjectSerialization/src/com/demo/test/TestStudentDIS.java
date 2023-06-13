package com.demo.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.demo.beans.Student;

public class TestStudentDIS {

	public static void main(String[] args) {
		Student s = new Student(111,"aaa",8000);
		try(DataInputStream dis = new DataInputStream(new FileInputStream("emp.txt"));
				DataOutputStream dos = new DataOutputStream(new FileOutputStream("emp.txt"));) {
			
			dos.writeInt(s.getSid());
			dos.writeUTF(s.getSname());
			dos.writeDouble(s.getSal());
			
			System.out.println("sid:"+dis.readInt());
			System.out.println("sname:"+dis.readUTF());
			System.out.println("sal:"+dis.readDouble());

			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
