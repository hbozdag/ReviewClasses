package com.review7;

public class StoreProduct {

	String label, category;

	double price;

	boolean hasExpiration;
	int stock;

	
	StoreProduct(String label,double price, String category,  boolean hasExpiration, int stock ){
		this.label=label;
		
		this.category=category;
		this.price=price;
		this.hasExpiration=hasExpiration;
		this.stock=stock;
		
	}
	
	StoreProduct(String label,  double price,  int stock ){
		this.label=label;
		
		this.category="misc";
		this.price=price;
		boolean hasExpiration;
		this.stock=stock;
		
	}
	
	StoreProduct(String label,  double price){
		this.label=label;
		
	String category;
		this.price=price;
		this.hasExpiration=false;
		int stock;
		
	}
	
	void displayInfo() {
		System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
		
	}
	
	
}
