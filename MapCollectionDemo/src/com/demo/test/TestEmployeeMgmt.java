package com.demo.test;

import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestEmployeeMgmt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService es = new EmployeeServiceImpl();
		int choice=0;
		do {
			System.out.println("\n1.Add new employee\n2.Display all employees\n3.Display by id\n4.Display by name\n5.Sort by salary\n6.Sort by name\n7.Modify salary\n8.Delete by id\n9.Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				es.addNewEmployee();
				break;
				
			case 2:
				es.displayAll();
				break;
				
			case 3:
				System.out.print("Enter id: ");
				int id = sc.nextInt();
				Employee e = es.displayById(id);
				if(e!=null) {
					System.out.println(e);
				}
				else {
					System.out.println("Not found");
				}
				break;
				
			case 4:
				System.out.print("Enter name: ");
				String name = sc.next();
				Set<Employee> s = es.displayByName(name);
				if(s!=null) {
					System.out.println(s);
				}
				else {
					System.out.println("Not found");
				}
				break;
				
			case 5:
				es.sortBySal();
				break;
				
			case 6:
				es.sortByName();
				break;
				
			case 7:
				System.out.print("Enter id: ");
				id = sc.nextInt();
				System.out.print("Enter new salary: ");
				int newsal = sc.nextInt();
				boolean status=es.modifyBySal(id,newsal);
				if(status) {
					System.out.println("Id: "+id+"\n"+"New salary: "+newsal);
				}
				else {
					System.out.println("Not found");
				}
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
				sc.close();
				System.out.println("Thank you for visiting!");
				break;
				
			default:
				System.out.println("Invalid choice");
			}
		}while(choice!=9);
	}

}
