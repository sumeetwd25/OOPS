package com.demo.test;

import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.service.EmployeeSerivce;
import com.demo.service.EmployeeServiceImpl;

public class TestEmployeeMgmt {

	public static void main(String[] args) {
		EmployeeSerivce es = new EmployeeServiceImpl();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println(
					"\n1.Add new employee\n2.Display all employee\n3.Display by id\n4.Display by name\n5.Sort by name\n6.Sort by salary\n7.Modify salary\n8.Delete by id\n9.Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				es.addNewEmployee();
				break;

			case 2:
				Set<Employee> s = es.displayAll();
				s.forEach(a -> {
					System.out.println(a);
				});
				break;

			case 3:
				System.out.print("Enter id: ");
				int id = sc.nextInt();
				Employee e = es.displayById(id);
				if (e != null) {
					System.out.println(e);
				} else {
					System.out.println("Not found");
				}
				break;

			case 4:
				System.out.print("Enter name: ");
				String name = sc.next();
				e = es.displayByName(name);
				if (e != null) {
					System.out.println(e);
				} else {
					System.out.println("Not found");
				}
				break;

			case 5:
				Set<Employee> s1 = es.sortByName();
				s1.forEach(a -> {
					System.out.println(a);
				});
				break;

			case 6:
				s1 = es.sortBySal();
				s1.forEach(a -> {
					System.out.println(a);
				});
				break;

			case 7:
				System.out.print("Enter id: ");
				id = sc.nextInt();
				System.out.print("Enter new salary: ");
				int newsal = sc.nextInt();
				boolean status = es.modifySal(id, newsal);
				if (status)
					System.out.println("Id:" + id + "\nNew salary:" + newsal);
				else
					System.out.println("Not found");
				break;
				
			case 8:
				System.out.print("Enter id: ");
				id = sc.nextInt();
				status = es.deleteById(id);
				if(status) {
					System.out.println("Deleted successfully");
				}
				else {
					System.out.println("Not found");
				}
				break;

			case 9:
				System.out.println("Thankyou for visiting!");
				break;

			default:
				System.out.println("Invalid choice");
			}
		} while (choice != 9);
		sc.close();
	}

}
