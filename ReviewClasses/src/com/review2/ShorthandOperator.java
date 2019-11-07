package com.review2;

public class ShorthandOperator {

	public static void main(String[] args) {

		int num = 1000;
		num = num + 1000;

		int num2 = 10;
		num2 = num2 + 5;

		System.out.println(num2);

		int num3 = 1000;
		num3 += 1000;

		System.out.println(num3);

		int num4 = 78;
		num4 += 12;

		System.out.println(num4);

		int num5 = 23;
		num5 -= 12 + (num3 * num2);

		System.out.println(num5);

		System.out.println("******");

		int a = 1;
		a += 1000;

		int a1 = 77;
		a1 += 67;

		System.out.println(a);
		System.out.println(a1);

		int cakePiece = 11;
		cakePiece /= 4;

		int cakePiece1 = 25;
		cakePiece1 %= 7;

		System.out.println(cakePiece);
		System.out.println(cakePiece1);

	}

}
