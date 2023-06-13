package com.demo.service;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Student;

public class StudentSeviceImpl implements StudentService {
	private static List<Student> lst;
	static {
		lst = new ArrayList<>();
		lst.add(new Student(1, "xxx", 5000));
		lst.add(new Student(2, "yyy", 6000));
		lst.add(new Student(3, "zzz", 7000));
	}

	@Override
	public void readFile() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.txt"));) {
			System.out.println("in readFile");
			while (true) {
				Student s = (Student) ois.readObject();
				System.out.println(s);
			}
		} catch (EOFException e) {
			System.out.println("exit");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void writeFile() {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test.txt"));) {
			System.out.println("in writeFile");
			for (Student ob : lst) {
				oos.writeObject(ob);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
