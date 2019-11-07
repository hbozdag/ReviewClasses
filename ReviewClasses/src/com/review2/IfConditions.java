package com.review2;

public class IfConditions {

	public static void main(String[] args) {

		double a = 3.67;
		double b = 4.89;

		if (a > b) {
			System.out.println("a is larger than b");
		} else {
			System.out.println("b is larger than a");
		}

		System.out.println("_________");

		// task 2 temp check

		int temp1 = 32;
		int temp2 = 31;

		if (temp1 > temp2) {
			System.out.println("Water will not freeze with temperature " + temp1);
		} else {
			System.out.println("water will freeze with temprature " + temp2);
		}

		System.out.println("____________");

		boolean birthDate = true;

		if (birthDate) { //if brithDate==true

			System.out.println("happy birthday!!!!!");
		} else {
			System.out.println("be patient! Your bDay is apporaching!");
		}

	}

}
