package com.review7;

public class Employee {

	String name, lastName, startDate;

	int employeeId, salary;

	Employee() {

		System.out.println(name+" "+lastName+" "+employeeId+" "+startDate+" "+salary);
	}

	Employee(String name, String lastName,  int employeeId,String startDate, int salary) {
		this.name=name;
		this.lastName=lastName;
		this.startDate=startDate;
		this.employeeId=employeeId;
		this.salary=salary;
				
		System.out.println(name+" "+lastName+" "+employeeId+" "+startDate+" "+salary);
	}
	
	

}
