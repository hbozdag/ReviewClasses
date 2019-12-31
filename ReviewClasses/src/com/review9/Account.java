package com.review9;

public class Account {
	
	private long acc_no;  
	private String name, email;  
	private double amount;
	
	public long getAcc_no() {
		return acc_no;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}

	public double getAmount() {
		return amount;
	}
	
	public void setAcc_no(long acc) {
		acc_no=acc;
		
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	
	public void setAmount(double amount) {
		this.amount=amount;
		
	}
}
