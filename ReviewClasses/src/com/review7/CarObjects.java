package com.review7;

class CarObjects{
	  
	  String model;
	  int quantity;
	  double value, price;
	  
	 CarObjects(String model, double price, int quantity){
	   
	   this.model=model;
	   this.price=price;
	   this.quantity=quantity;
	   
	   
	 }
	 
	 void carStockValue(){
	   double carValue=quantity*price;
	   
	   System.out.println(model+" Stock Value "+carValue);
	   
	 }
	  
	}