package com.demo.beans;

public class Item {
	private int itemid;
	private String iname;
	private int qty;
	
	public Item() {
		super();
	}
	
	public Item(int itemid, String iname, int qty) {
		super();
		this.itemid = itemid;
		this.iname = iname;
		this.qty = qty;
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	@Override
	public String toString() {
		return "Item [itemid=" + itemid + ", iname=" + iname + ", qty=" + qty + "]";
	}
}
