package com.review9;

import java.util.Scanner;

public class Repl {

	final void method() {

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();

		int reverse = a;
		a = b;
		b = reverse;

		System.out.println("a is now assigned to value of " + a);
		System.out.println("b is now assigned to value of " + b);

	}

	public static void main(String[] args) {

		Main obj = new Main();

		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);

	}

}

class Main implements MyInterface {

	

}
