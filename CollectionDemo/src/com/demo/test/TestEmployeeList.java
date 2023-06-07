package com.demo.test;

import java.util.List;
import java.util.Scanner;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;
import com.demo.beans.Employee;

public class TestEmployeeList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService es = new EmployeeServiceImpl();
		
		int choice = 0;
		do {
			System.out.println("\n1.Add new employee\n2.Display all employee\n3.Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				es.addNewEmployee();
				break;
			
			case 2:
				List <Employee> list = es.displayAll();
				list.forEach(ob->{System.out.println(ob);});
				break;
			
			case 3:
				System.out.println("Thankyou for visiting!");
				break;
				
			default:
				System.out.println("Invalid choice");
				break;
			}
		}while(choice!=3);
		sc.close();
	}

}
