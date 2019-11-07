package com.review4;

public class Repl87 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2, 2},
				{1,-2, 3,-4}
			};
			
			
	//   should print -9
		int column = 1;
	         int sum = 0;
	        
	          for (int row = 0; row < a.length; row++) {
	          sum += a[row][column];
	          }
	          
	          System.out.println( sum );
		

	}

}
