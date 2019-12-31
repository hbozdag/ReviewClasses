package com.review6;

public class Baby {
	
	
	String firstName, lastName, hairColor ;
	
	char gender;
	
	int weight;
	
	
	void talk() {
		
		System.out.println("bla bla bla");
		
		
	}
	
	void crawl(int times) {
		System.out.println("crawl baby crawl");
	}
	
	void cry() {
		System.out.println("cry baby cry");
	}
		void displayBabyinfo() {
			
			System.out.println(" Full name is "+firstName+" "+lastName);
			
			System.out.print(" Gender is: ");
			
			if (gender=='M') {
				System.out.println("boy");
			}else if (gender=='F'){
				System.out.println("girl");
			}else {
				System.out.println("UNKNOWN");
			}
		}
	

}
