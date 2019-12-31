package com.review10;

import java.util.ArrayList;
import java.util.Iterator;

class Main {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		if (list.isEmpty()) {
			System.out.println("true");
		} else {
			System.out.println("false");

		}
		list.add("Syntax");

		if (list.isEmpty()) {
			System.out.println("true");

		} else {
			System.out.println("false");

		}

		ArrayList<Integer> in = new ArrayList<>();

		in.add(111);
		in.add(222);
		in.add(333);
		in.add(444);
		in.add(555);
		in.add(666);

//	  System.out.println(in.get(1));
//	  System.out.println(in.get(3));
//	  System.out.println(in.get(5));

		System.out.println(in);

		Iterator<Integer> it = in.iterator();
		while (it.hasNext()) {
			it.next();
			it.remove();
		}
		System.out.println(in);
		
		
		ArrayList<String> str=new ArrayList<>();
		  
		  str.add("hi");
		  str.add("yo");
		  str.add("sup");
		  str.add("yolo");
		  str.add("boop");
		  
		  str.remove(0);
		  str.remove(2);
		  str.remove(4);
		  
		  
		 
		

	}
}
