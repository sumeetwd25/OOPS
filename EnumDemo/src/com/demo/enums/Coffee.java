package com.demo.enums;

public enum Coffee {
	small(150, 200), medium(200, 250), large(250, 350);

	private int size;
	private int price;

	Coffee(int s, int p) {
		size = s;
		price = p;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
