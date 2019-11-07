package com.review3;

public class ReverseArray {

	public static void main(String[] args) {
		// here is how to print reverse array

		String[] animals = { "dog", "cat", "bird" };

		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i]);
		}

		System.out.println("=====reverse====");

		for (int i = animals.length - 1; i >= 0; i--) {
			System.out.println(animals[i]);
		}
	}

}
