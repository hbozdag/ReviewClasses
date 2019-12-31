package com.review6;

public class MathOperations {
	
	void add(int number1, int number2, int number3) {
		int sum=number1+number2+number3;
		
		System.out.println(" the sum is "+sum);
		//return sum;
	}
	
	void subtract(int number1, int number2) {
		
		int result=number1-number2;
		System.out.println(number1 +" - "+number2+" is ");
		
	}

	
	void multiply (double num1, double num2) {
		double result= num1*num2;
		System.out.println(" the multiplication of "+num1+" and "+num2+" is "+result);
	}
	
	void divide (double num1, double num2) {
		double result= num1/num2;
//		if (num2==0) {
//			System.out.println(" You cannot divide these numbers");
//		}else {
//			System.out.println(result);
//		}
		
		System.out.println(" the division of "+num1+" and "+num2+" is "+result);
	}
}
