package com.review7;

public class Prime {

	public static void main(String[] args) {

		boolean isPrime = true;
		int num = 7;

		if (num == 0 || num == 1) {
			isPrime = false;
		} else {

			for (int i = 2; i < num; i++) {
				if (num % 2 == 0) {
					isPrime = false;
					break;

				}
			}
		}

		if (isPrime) {
			System.out.println(" the number is prime number");
		} else {
			System.out.println(" the number is not prime number");
		}
	}

}
