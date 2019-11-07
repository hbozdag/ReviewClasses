package com.review2;

public class RelationalEquality {

	public static void main(String[] args) {

		// relational& Equality Operators >, >=, <, <=, ==. !=
		// greater, greater or equal, smaller, smaller or equal, equal, not equal

		int num1 = 26;
		int num2 = 78;

		System.out.println(num1 > num2);

		// the result of relational operators is always boolean.

		int num3 = 83738;
		double num4 = 83.83939;

		boolean f = num3 >= num4;

		System.out.println(f);

		boolean num5 = num4 == num3;
		System.out.println(num5);

		
		int c=4588;
		int d=839;
		
		if (c>d) {
			System.out.println("c is bigger than d");
		}else {
			System.out.println("d is bigger than c");
		}
		
		int expectedHours=12;
		int actualHours=7;
		
		//if actual  hours more than expected you will succeed. otherwise please study more
		
		if (expectedHours<actualHours) {
			System.out.println("You will succeed");
		}else {
			System.out.println("Please study more");
			
			
		}
		
		
		double coffeePrice=9.88;
		double allowedPrice= 5.88;
		
		coffeePrice-=2.0; //if they give me $2 discount
		
		
		
		// if allowed price is more than coffee price I will enjoy coffee.
		// if coffee price is higher than what I have i will skip coffee time for today
		
		if (allowedPrice>=coffeePrice) {
			System.out.println("I will enjoy coffee");
			System.out.println("I will have coffee talk today");
		}else {
			System.out.println("i will skip coffee time for today");
		}
		
		
	}

}
