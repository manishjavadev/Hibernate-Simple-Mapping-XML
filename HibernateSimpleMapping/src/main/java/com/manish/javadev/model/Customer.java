package com.manish.javadev.model;

public class Customer {
	private int cid;
	private String fname;
	private String lname;
	private int age;
	public Customer() {	}
	public Customer(String fname, String lname, int age) {
		// Look very carefully Id will not include in Constructor.
		// Id will be taken care by Hibernate Framework.
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
