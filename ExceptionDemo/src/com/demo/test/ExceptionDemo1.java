package com.demo.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo1 {

	public static int divide(int i, int j) {
		try {
			int ans = i / j;
			return ans;
		} catch (ArithmeticException e) {
//			System.out.println(e.getMessage());
			throw e;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int k = 0; k < 3; k++) {
			try {
				System.out.print("Enter num1: ");
				int num1 = sc.nextInt();
				System.out.print("Enter num2: ");
				int num2 = sc.nextInt();
				int ans = divide(num1, num2);
				System.out.println(ans);
			} catch (InputMismatchException e) {
//				System.out.println("Please enter number");
				System.out.println(e.getMessage());
				sc.next();
			} catch (Exception e) {
				System.out.println("Error occured");
				System.out.println(e.getMessage());
			} finally {
				System.out.println("In finally block");
			}
		}
		sc.close();
	}

}
