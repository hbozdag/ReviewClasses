
public class ReplQuest82 {

	public static void main(String[] args) {
		
		//Write a program to double the values of every element in the array and print it out.
		
		
			double[][] a = {
				{1.4,2.0,3.3,2},
				{4,1.5,6.1,1},
				{1.2,3.1,4,1.6}
			};
			
		
		//Double and print array
			
			for (int i=0; i<a.length; i++) {
				for( int j= 0;j<a[i].length; j++ ) {
					System.out.print(2*(a[i][j])+" ");
				}
				System.out.println();
			}
			
			
//			for (double d=0.0; d<a.length; d*=2.0){
//				for (double e=0.0; e<a[d].length; e++)
//			  System.out.print(a[d][e]);
//			}
//			System.out.println();
//			
			
		
		}
		
		
		
		
		
		
		
		
		
		
	}


