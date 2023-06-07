package com.demo.beans;

public class Circle extends Shape {
	private int rad;

	public Circle() {
		super();
	}

	public Circle(String c,int rad) {
		super(c);
		this.rad = rad;
	}

	public int getRad() {
		return rad;
	}

	public void setRad(int rad) {
		this.rad = rad;
	}

	@Override
	public String toString() {
		return super.toString()+"Circle [rad=" + rad + "]";
	}
	
	public float calcArea() {
		return (float)(Math.PI)*rad*rad;
	}
	
	public float calcPerimeter() {
		return (float) (2*(Math.PI)*rad);
	}
}
