package com.demo.beans;

public class Employee {
	private int eid;
	private String ename;
	private int sal;
	private String email;
	
	public Employee() {
		super();
	}
	
	public Employee(int eid, String ename, int sal, String email) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
		this.email = email;
	}
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal + ", email=" + email + "]";
	}
}
