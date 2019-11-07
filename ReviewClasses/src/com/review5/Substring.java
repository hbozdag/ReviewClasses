package com.review5;

public class Substring {

	public static void main(String[] args) {
		String longStr = "I am very happy today, because today is not Monday.";
        String anotherStr = longStr.substring(10);
        System.out.println(anotherStr);
                
        anotherStr = longStr.substring(10, 15);
        System.out.println(anotherStr);
        
//      System.out.println(longStr.substring(20, 10)); cannot do this first num should be smaller
//      longStr.substring(10, 56); cannot do this last numbr should not exceed the num of characters


	}

}
