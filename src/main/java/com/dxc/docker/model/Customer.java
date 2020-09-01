package com.dxc.docker.model;

public class Customer {

	private String name;
	private String email;
	private double mobNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getMobNo() {
		return mobNo;
	}
	public  void setMobNo(double mobNo) {
		this.mobNo = mobNo;
	}
	public Customer(String name, String email, double mobNo) {
		super();
		this.name = name;
		this.email = email;
		this.mobNo = mobNo;
	}
	
}
