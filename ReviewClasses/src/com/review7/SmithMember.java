package com.review7;

public class SmithMember {

	String firstName;
	static String lastName;
	char gender;
	int salary;

	static int count;

	public void increment() {
		count++;
	}

	public void memberInfo() {
		
		System.out.println(firstName+" "+lastName+ " makes $"+salary);
	}
}
