package com.review3;

public class ArrayAdding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a= {3,4,5,7,8};
		
		int sumA=0;
		
		
		for (int i=0; i<a.length; i++) {
			sumA+=a[i];
			
		}
		System.out.println(sumA);
		
		
		String [] s= new String [5];
		
		for (int i=0; i<s.length; i++) {
			System.out.println(s[i]);
		}
		

	}

}
