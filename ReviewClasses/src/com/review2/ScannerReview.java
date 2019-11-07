package com.review2;

import java.util.Scanner;

public class ScannerReview {

	public static void main(String[] args) {
		
		Scanner computer=new Scanner(System.in);
		
		System.out.println("Please enter your name");
		
		String name=computer.next();
		
		System.out.println(" Hey "+name);

	}

}
