package com.review8;

import java.util.Scanner;

public class Main {

	final String reverseString(String str) {
		return str;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

//		System.out.println("Please enter your greeting");
		
		String str=scan.nextLine();
		String greeting="";
		
		for (int i=str.length()-1;i>=0; i--) {
			greeting=greeting+str.charAt(i);
		}
		
		System.out.println(greeting);
		
		

	}
}