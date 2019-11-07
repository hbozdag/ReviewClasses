package com.review2;

public class PrimitiveCasting {

	public static void main(String[] args) {
		
		
		
		
		double d=12;
		System.out.println(d);
		
		/*
		 * widening-implicit/automatic
		 * narrowing -explicit/manual
		 * byte>short>int>long>float>double
		 */
		
		double d1= 123.56;
		int num=(int) d1;
		System.out.println(num);
		
		double d2=45.93839390;
		int num1=(int)d2;
		System.out.println(num1);
		
		
		int num3=78780;
		byte b1=(byte) num3;
		
		System.out.println(b1);
		
		

	}

}
