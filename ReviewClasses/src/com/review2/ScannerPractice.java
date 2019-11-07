package com.review2;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		

		Scanner senior=new Scanner(System.in);
		
		System.out.println("Please enter your name");
		
		String name=senior.nextLine();
		
		System.out.println("Please enter your graduation year");
		
		int year=senior.nextInt();
		
		System.out.println("Please type teh scholarship program that you want to apply");
		
		String loan=senior.next();
		
		System.out.println(" Thank you " +name + " Please confirm the information below");
		System.out.println(" Your name is "+name+ " and you are graduating in "+year);
		
		
		
		
		
		
		
		
	}

}
