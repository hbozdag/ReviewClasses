package com.review2;

public class IfElseIf {

	public static void main(String[] args) {

		int num = 99;

		int num1 = 99;

		if (num > num1) {
			System.out.println(num + " is larger than " + num1);

		} else if (num == num1) {
			System.out.println(num + " is equal to " + num1);

		} else {
			System.out.println(num + " is smaller than " + num1);
		}

		System.out.println("+++++++");

		int cat = 9;

		if (cat == 1) {
			System.out.println("student is in special ed");
		} else if (cat == 2) {
			System.out.println("student is GT");
		} else if (cat == 3) {
			System.out.println("student is in gen ed");
		} else if (cat == 4) {
			System.out.println("student is in clubs");
		} else if (cat == 5) {
			System.out.println("student is not eligible for enrollment");
		} else {
			System.out.println("student will be sent for district decison");
		}

	}

}
