package com.review7;

public class Dog {
	
	String dogName;
	double dogWeight;
	static String dogBreed = "Mutt";

	
	public  Dog(String dogName, String dogBreed, double dogWeight) {
		this.dogName = dogName;
		this.dogWeight = dogWeight;
		this.dogBreed = dogBreed;
	}
	
	

	public Dog (String dogName, double dogWeight) {
		this.dogName = dogName;
		this.dogWeight = dogWeight;
		this.dogBreed = dogBreed;
		

	}

	public void display() {
		System.out.println(dogName + " " + dogBreed + " " + dogWeight);
		
	}

}
