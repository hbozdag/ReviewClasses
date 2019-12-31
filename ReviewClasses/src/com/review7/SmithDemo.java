package com.review7;

public class SmithDemo {

	public static void main(String[] args) {

		
		SmithMember member1 = new SmithMember();

		member1.increment();
		member1.firstName = "John";
		member1.lastName = "Smith";
		member1.gender = 'M';
		member1.salary = 5000;

		SmithMember member2 = new SmithMember();
		member2.increment();
		member2.firstName = "Jane";
		member2.lastName = "Smith";
		member2.gender = 'F';
		member2.salary = 6000;

		member2.memberInfo();
		System.out.println("There are " + member2.count + " members");

		member1.lastName = "Doe";
		System.out.println(" Last name has changed to Doe");

		member1.memberInfo();
		member2.memberInfo();

		SmithMember baby = new SmithMember();
		baby.increment();
		baby.firstName = "Adam";
		baby.gender = 'M';
		baby.salary = 500;
		System.out.println("There are " + SmithMember.count + " members");

	}

}
