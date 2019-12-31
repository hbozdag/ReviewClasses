package com.review8;

public class Person {
	
	String name, lastName;
	int age;

}



class Employee extends Person {

	String name="Joe";
	String lastName="Smith";
	int age=35;
	int salary=35000;
	
	public void print() {
		
	
	System.out.println(name+" "+lastName+" "+age+" "+salary);
	}
	
}



class Student extends Person {
	String name="Adam";
	String lastName="Smith";
	int age=15;
	int grade=10;
	
	public void print () {
	System.out.println(name+" "+lastName+" "+age+" "+grade);
	}
}



class Retiree extends Person {
	String name="Frank";
	String lastName="Smith";
	int age=15;
	String seniorActivity="tour";
	
	public void print() {
	System.out.println(name+" "+lastName+" "+age+" "+seniorActivity);
	}
	
}
