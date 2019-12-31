package com.review6;

public class World {

	public static void main(String[] args) {
		Baby baby1 = new Baby();

		baby1.firstName = "John";
		baby1.lastName = "Doe";
		baby1.gender = 'M';
		baby1.hairColor = "Brown";
		baby1.weight = 8;

		System.out.println(baby1.firstName);
		System.out.println(baby1.gender);

		baby1.crawl(64);
		
		System.out.println(" Full name of baby 1 is "+baby1.firstName+" "+baby1.lastName);

		
		baby1.displayBabyinfo();

	}

}
