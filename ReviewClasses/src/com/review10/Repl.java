package com.review10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Repl {

	public static void main(String[] args) {
		ArrayList<String> str = new ArrayList<>();

		str.add("hi");
		str.add("yo");
		str.add("sup");
		str.add("yolo");
		str.add("boop");
		

		int size = str.size();
		str.remove(size - 1);
		str.remove(size - 3);
		str.remove(size - 5);

		System.out.println(str);
		
		ArrayList<Integer> listA = new ArrayList<>();

		listA.add(0);
		listA.add(1);
		listA.add(2);
		listA.add(3);
		listA.add(4);
		listA.add(5);
		
		ArrayList<Integer> listB = new ArrayList<>();
		int dup;
		for (Integer list:listA) {
			System.out.print(list+",");
			dup=list+0;
			System.out.print(dup+",");
			
		}
		
		List<Boolean> listC = new ArrayList<>();
		
		listC.add(true);
		listC.add(false);
		listC.add(false);
		
		

			List<Boolean> listD = new ArrayList<>();
			listB.addAll(listA);
			listB.addAll(listA);
			Collections.sort(listB);
			System.out.println(listB);
		
		

	}

}
