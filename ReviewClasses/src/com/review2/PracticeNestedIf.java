package com.review2;

public class PracticeNestedIf {

	public static void main(String[] args) {

		boolean morning = false;
		boolean coffeeTea = true;

		if (morning) {

			System.out.println("Good Morning");

			if (coffeeTea) {
				System.out.println("Please serve yourself coffee or tea in the lounge");
			}
		} else {
			System.out.println("Good Afternoon. Your work is here done!");
		}

		System.out.println("Please set up your next meeting here before you exit");

		// task 2

		// I want to know if today is froday the 13

		boolean isFriday = true;

		int day = 13;

		if (isFriday) {

			System.out.println("I have to check if the 13th");

			if (day == 13) {
				System.out.println("I have to watch a horror movie");
			}
		} else {

			System.out.println("I will be safe.");
		}

		System.out.println("_______________");

		// if you are younger than 16 no license.
		//// if you are older than 81 you cannot drive
		// otherwise you are eleigble to drive
		// if you are 16 or 17 you will have permit
		// if you are 18 or older you will get driver license

		int age = 17;

		if (age < 16) {

			System.out.println("You cannot drive");

		} else if (age > 81) {
			System.out.println("You cannot drive");

		} else {

			System.out.println("You can drive");

			

			if (age >= 18) {

				System.out.println("you can drive");
			}
			
		
		else  {
			System.out.println(" You can have a permit");
		}
		}

	}

}
