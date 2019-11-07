package com.review3;

import java.util.Scanner;

public class ScannerWithArray {

	public static void main(String[] args) {
		// this way will show how to increase based on a given 
		//number by the user
		
		
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println(" How many number do you want to enter?");
		
		int size=scan.nextInt();
		
		int [] array=new int [size];
		
		for (int i=0; i<size; i++) {
			
			System.out.println("Enter a number");
			array[i]=scan.nextInt();
			
		}
		
		int sum=0;
		for (int i=0; i<size; i++) {
			sum+=array[i];
			
		}
		System.out.println("The sum is "+ sum);

	}

}
