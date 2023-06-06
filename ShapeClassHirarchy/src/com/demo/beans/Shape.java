package com.demo.beans;

public abstract class Shape {
	private int id;
	private String color;
	private static int cnt;
	static {
		cnt=0;
	}
	public Shape() {
		super();
		id=cnt++;
	}
	
	public Shape(String color) {
		super();
		id=cnt++;
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Shape [id=" + id + ", color=" + color + "]";
	}
	
	public abstract float calcArea();
	public abstract float calcPerimeter();
}
