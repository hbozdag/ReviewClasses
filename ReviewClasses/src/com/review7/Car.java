package com.review7;

public class Car {

	String make, model;

	int numberOfDoors, topSpeed;
	double price;
	
	Car(){
		
	}

	Car(String make, String model, int numberOfDoors, int topSpeed, double price) {

		this.make = make;
		this.model = model;
		this.numberOfDoors = numberOfDoors;
		this.topSpeed = topSpeed;
		this.price = price;
		
		//System.out.println(make + " " + model + " " + numberOfDoors + " " + topSpeed + " " + price);

	}

	Car(String make, String model, int topSpeed, double price) {

		
		this.make = make;
		this.model = model;
		this.numberOfDoors = 4;
		this.topSpeed = topSpeed;
		this.price = price;
		
		
		//System.out.println(make + " " + model + " " + numberOfDoors + " " + topSpeed + " " + price);
	}

	Car(int numberOfDoors, int topSpeed, double price) {

		this.make = "unknown";
		this.model = "unknown";
		this.numberOfDoors = numberOfDoors;
		this.topSpeed = topSpeed;
		this.price = price;
		
		//System.out.println(make + " " + model + " " + numberOfDoors + " " + topSpeed + " " + price);

	}

	Car(String make, String model, int numberOfDoors) {

		this.make = make;
		this.model = model;
		this.numberOfDoors = numberOfDoors;
		
		
		this.topSpeed = 90;
		this.price = 0;
		
		//System.out.println(make + " " + model + " " + numberOfDoors + " " + topSpeed + " " + price);

	}

	void displayInfo() {
		System.out.println(make + " " + model + " " + numberOfDoors + " " + topSpeed + " " + price);
	}

}
