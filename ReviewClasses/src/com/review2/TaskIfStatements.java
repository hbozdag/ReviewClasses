package com.review2;

public class TaskIfStatements {

	public static void main(String[] args) {

		int month = 77;

		if (month == 1) {
			System.out.println("we are in january");
		} else if (month == 2) {
			System.out.println("we are in feb");

		} else if (month == 3) {

			System.out.println("we are in march");
		} else if (month == 4) {

			System.out.println("we arein april");
		} else if (month == 5) {
			System.out.println("we are in may");
		} else if (month == 6) {
			System.out.println("we are in june");
		} else if (month == 7) {
			System.out.println("we are in july");
		} else if (month == 8) {
			System.out.println("we are in august");
		} else if (month == 9) {
			System.out.println("we are in september");
		} else if (month == 10) {
			System.out.println("we are in october");
		} else if (month == 11) {
			System.out.println("we are in november");
		} else if (month == 12) {
			System.out.println("we are in december");
		} else {
			System.out.println("there is no such a thing. please fix your search word!");
		}
		
		System.out.println("**************");
		//task 2 positive negative numbers
		
		int number=5;
		
		if (number<0) {
			System.out.println("this number is negative");
			
		}else {
			System.out.println("this number is positive");
		}
		
		
		System.out.println("***********");
		
		//task 3 even odd numbers
		
		int num=7;
		
		if (num%2==0) {
			System.out.println("this number is an even number ");
		}else {
			System.out.println("this number is an odd number");
		}
		
		
		
		
		

	}

}
