package com.demo.beans;

public class Employee implements Comparable<Employee>{
	private int eid;
	private String ename;
	private String desg;
	private int sal;
	
	public Employee() {
		super();
	}
	
	public Employee(int eid, String ename, String desg, int sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.desg = desg;
		this.sal = sal;
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
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", desg=" + desg + ", sal=" + sal + "]";
	}
	
	public int compareTo(Employee o) {
		return this.sal-o.sal;
		
	}
	
}
