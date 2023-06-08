package com.demo.test;

import java.util.List;
import java.util.Scanner;
import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestEmployeeList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService es = new EmployeeServiceImpl();
		
		int choice = 0;
		do {
			System.out.println("\n1.Add new employee\n2.Display all employee\n3.Display by id\n4.Exit");
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
				System.out.print("Enter employee id: ");
				int id = sc.nextInt();
				Employee e = es.searchById(id);
				if(e!=null) {
					System.out.println(e);
				}
				else {
					System.out.println("Not found");
				}
				break;
				
			case 4:
				System.out.println("Thankyou for visiting!");
				break;
				
			default:
				System.out.println("Invalid choice");
				break;
			}
		}while(choice!=4);
		sc.close();
	}

}
