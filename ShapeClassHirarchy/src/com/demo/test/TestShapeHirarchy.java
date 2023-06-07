package com.demo.test;

import java.util.Scanner;

import com.demo.service.ShapeService;

public class TestShapeHirarchy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("\n1.Add new shape\n2.Display all shapes\n3.Calculate area & perimeter\n4.Exit");
			System.out.print("Enter the choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				ShapeService.addNewShape();
				ShapeService.numberDetails();
				break;
			
			case 2:
				ShapeService.displayShape();
				break;
				
			case 3:
				ShapeService.calcDetails();
				break;
				
			case 4:
				System.out.println("Thankyou for visiting!");
				break;
				
			default:
				System.out.println("Invalid choice");
				break;
			}
		}while(choice!=4);
	}
}
