package com.review3;

import java.util.Scanner;

public class ScannerTask {

	public static void main(String[] args) {
		
		 //Write a program with one int value for salary and four String values for different cars
        //If you make over 50000 a year, you may buy a brand new car otherwise you should 
		//buy a used car. For those you can afford a new car there are different price ranges
        //I want anything under 70k to be Audi A5
        //I want anything under 80k to be Mercedes-Benz
        //I want anything under 90k to be Jaguar
        //I want anything under 100k to be Tesla
        // And if you make less than 60k output to read "Save up money and wait until next year"
		
		
	
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("What is your salary?");
		int salary=scan.nextInt();
		
		if (salary>60000) {
			System.out.println("You can buy a car");
			
			if (salary>60000&&salary<70000) {
				System.out.println("You may buy Audi A5");
			}else if (salary>70000&&salary<80000) {
				System.out.println("You may buy Mercedes-Benz");
			}else if (salary>80000&&salary<90000) {
				System.out.println("You may buy Jaguar");
			}else if (salary>90000&&salary<100000) {
		}else {
			System.out.println("Save up money and wait until next year");
			
		}
		
			
		
			System.out.println("Save up money and wait until next year");
		
//		Write a program that prints out if it is good weather to go for a bike ride. The weather is good if the temperature is between 60 degrees and 100 degrees inclusive unless it is raining. If temperature is less than 60 program should say
//		it is too cold, if the temperature is more than 100, program should say it is too hot.
	/*If the temperature is between 40 degrees and 80 degrees inclusive & no
		     * rain--> we will go for hiking otherwise--> we will not go hiking
		If temperature is between 25 and 40 inclusive & snowing -->going snowboarding
		     * otherwise we are not going snowboarding it
		if temperature is more than 80 & sunny--> go to the beach otherwise --> not go to the beach*/





		
		
		
		
		
		
		
		
		
		
		
		
		}
	}
		
		
		

	}


