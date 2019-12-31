package com.review12;

class Main {
	public static void main(String[] args) {

		try {
			int num = Integer.parseInt("akki");
		} catch (NumberFormatException e) {
			System.out.println(e.getClass());
			System.out.println(e.getMessage());

		}
	}
}
