package com.review12;

class PrintException {
	
	public static void main(String[] args) {
		int[] array = { 10, 20, 30 };
		try {
			System.out.println(array[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}
}