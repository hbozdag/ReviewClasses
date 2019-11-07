package com.review3;

public class EvenOddNumbers {

	public static void main(String[] args) {
		
int num=6;

if (num%2==00 ) {
	System.out.println("This number is an even number");
}else {
	System.out.println("This number is an odd number");
}
		
		
//Write a program to find if the largest Number of three numbers
//Print out  System.out.println("Largest number is " + largestNumber);
 // Must use if then a else if and lastly else 


int num1,num2,num3;

num1=4;
num2=5;
num3=6;
int largestNumber;

if (num1>num2&&num1>num3) {
	System.out.println("Largest number is 4");
}else if (num2>num1&&num2>num3) {
	System.out.println("Largest number is 5");
}else if (num3>num1&&num2<num3) {
	System.out.println("Largest number is 6");
}



//task 


//Write a program to found out the user level of experience 
		        // Must use a switch statement with  a String variable named levelString and a int variable named level 
		        // Beginner level should be 1
		        // Intermediate level should be 2
		        // Expert level should be 3



		String levelString="beginner level";
		int level=3;
		
		
		
		switch (level) {
		
		case 1:
			System.out.println("beginner level");
			break;
		case 2:
			System.out.println("intermideate level");
			break;
		case 3:
			System.out.println("expert level");
			break;
			default:
				System.out.println("unknown");
				
		}
		
		
		
		
		
		
		

	}

}
