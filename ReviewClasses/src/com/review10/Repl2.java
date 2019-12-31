package com.review10;

import java.util.HashSet;
import java.util.Set;

public class Repl2 {

	public static void main(String[] args) {

		Set<String> list = new HashSet<String>();

		list.add("first");
		list.add("second");
		list.add("third");
		list.add("fourth");
		list.add("fifth");

		Object[] array=list.toArray();
		System.out.println("Array elements:");
		for (int i=0; i<list.size(); i++) {
			System.out.println(array[i]);
		}
//	list.remove("second");
//	
//	System.out.println(list);
//	
//	list.clear();
//	
//	System.out.println(list);

//	System.out.println("Size of the Hash Set:"+list.size());

	}

}
