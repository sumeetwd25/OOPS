package com.demo.service;

import java.util.Scanner;

import com.demo.beans.Circle;
import com.demo.beans.Rectangle;
import com.demo.beans.Shape;
import com.demo.beans.Triangle;

public class ShapeService {
	public static Shape sarr[];
	public static int cnt;
	static {
		sarr = new Shape[10];
		cnt = 0;
	}
	
	static Scanner sc =new Scanner(System.in);
	
	public static void addNewShape() {
		System.out.print("\nEnter color: ");
		String c =sc.next();
		System.out.println("1.Circle  2.Recangle  3.Triangle");
		System.out.print("Select choice: ");
		int ch= sc.nextInt();
		
		switch (ch) {
		case 1:
			System.out.print("Enter radius: ");
			int r = sc.nextInt();
			sarr[cnt] = new Circle(c,r);
			break;
			
		case 2:
			System.out.print("Enter breadth: ");
			int br = sc.nextInt();
			System.out.print("Enter height: ");
			int ht = sc.nextInt();
			sarr[cnt] = new Rectangle(c,br,ht);
			break;
			
		case 3:
			System.out.print("Enter base: ");
			int b = sc.nextInt();
			System.out.print("Enter height: ");
			int h = sc.nextInt();
			System.out.print("Enter s1: ");
			int s1 = sc.nextInt();
			System.out.print("Enter s2: ");
			int s2 = sc.nextInt();
			sarr[cnt] = new Triangle(c,b,h,s1,s2);
			break;

		default:
			System.out.println("\nInvalid choice");
			break;
		}
		cnt++;
	}
	
	public static void displayShape() {
		System.out.println();
		for(int i=0;i<cnt;i++) {
			System.out.println(sarr[i]);
		}
	}
	
	public static int searchById(int id) {
		for(int i=0;i<cnt;i++) {
			if(sarr[i].getId()==id)
				return i;
		}
		return -1;
	}
	
	public static void calcDetails(){
		System.out.print("\nEnter id: ");
		int id = sc.nextInt();
		int pos = searchById(id);
		if(pos!=-1) {
			float area = sarr[pos].calcArea();
			float perimeter = sarr[pos].calcPerimeter();
			System.out.println("Area = "+area+" Perimeter = "+perimeter);
		}
		else
			System.out.println("Not found");
	}
	
	public static void numberDetails() {
		int ccnt=0, rcnt=0, tcnt=0;
		for(int i=0;i<cnt;i++) {
			if(sarr[i] instanceof Circle)
				ccnt++;
			else if(sarr[i] instanceof Rectangle)
				rcnt++;
			else if(sarr[i] instanceof Triangle)
				tcnt++;
		}
		System.out.println("\nCircles: "+ccnt+" Rectangles: "+rcnt+" Triangles: "+tcnt);
	}
}
