package com.review10;

public class EncapsulationDemo {
	
	private String empName;
	private int empAge;
	
	public String getEmpName(String empName) {
		this.empName=empName;
		return empName;
	}
	
	public int getEmpAge(int empAge) {
		this.empAge=empAge;
		return empAge;
	}
	
//	public void setEmpName(String empName) {
//		this.empName=empName;
//		
//	}
//	
//	public void setEmpAge(int empAge) {
//		this.empAge=empAge;
//	}

}
