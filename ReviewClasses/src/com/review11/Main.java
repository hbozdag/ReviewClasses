package com.review11;

import java.util.HashMap;

class Main {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();
		map.put("mango", 10);
		map.put("apple", 30);
		map.put("orange", 20);
		map.put("mango", 40);
		map.put("mango", 10);

		for (String k : map.keySet()) {
			System.out.println(k.toUpperCase() + " : " + map.get(k));
		}

		map.clear();

		if (map.isEmpty()) {
			System.out.println("map is empty");
		} else {
			System.out.println("map is not empty");
		}
	}
}
