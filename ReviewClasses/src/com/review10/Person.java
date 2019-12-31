package com.review10;

public class Person {
	
	private String firstName;
	private String lastName;
	private int birthMonth;
	private int birthday;
	private int birthYear;
	private String ssn;

	
	Person(String name,String lastName,int month, int day,int year, String ssn ){
		this.firstName=name;
		this.lastName=lastName;
		this.birthMonth=month;
		this.birthday=day;
		this.birthYear=year;
		this.ssn=ssn;
		
//		System.out.println(name);
//		System.out.println(lastName);
//		System.out.println(month+"/"+day+"/"+year);
//		System.out.println(ssn);
	}
	
	public void formatBirthday() {
		System.out.println(this.birthMonth+"/"+this.birthday+"/"+this.birthYear);
	}
	
	public String getFirstName() {
		return firstName;
		
	}
	
	public String getLastName() {
		return lastName;
		
	}
	
	public int getBithMonth() {
		return birthMonth;
	}
	
	public int getBirthDay() {
		return birthday;
	}
	
	public int getBirthYear() {
		return birthYear;
	}
	
	public String getSsn() {
		return ssn;
	}
	
	
	
	
	
	
	public void  setFirstName(String firstName ) {
		
		
	}
	
	public void setLastName(String lastName) {
		
		
	}
	
	public void setBithMonth(int birthMonth) {
		
	}
	
	public void setBirthDay(int birthday) {
		
	}
	
	public void setBirthYear(String birthYear) {
		
	}
	
	public void setSsn(String ssn) {
		
	}
	
	
	
}
