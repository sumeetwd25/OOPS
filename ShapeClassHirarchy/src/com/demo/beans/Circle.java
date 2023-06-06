package com.demo.beans;

public class Circle {
	private int rad;

	public Circle() {
		super();
	}

	public Circle(int rad) {
		super();
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
		return "Circle [rad=" + rad + "]";
	}
	
	public float calcArea() {
		return (float)(Math.PI)*rad*rad;
	}
	
	public float calcPerimeter() {
		return (float) (2*(Math.PI)*rad);
	}
}
