package com.review8;

public class X {
	
	
	
	public static void myMethod() {
		System.out.println("method without parameter");
	}
	
	
	public static void myMethod(int num) {
		System.out.println("method with int parameter");
	}
	
	
	

}


class Y extends X {
	
	public static void  myMethod() {
		System.out.println("Class Y");
	}

}
