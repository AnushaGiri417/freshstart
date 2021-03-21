package com.youtubeclass;

public class Patterns {

	public static void main(String[] args) {
		
//1.		
		
		for(int rows=1; rows<=5; rows++) {
			
			 for(int col=1; col<=rows; col++) {
				 System.out.print("* ");
			 }
			 
		System.out.println();
		}
		
System.out.println("====================================================================================");		
//2.
	
		for(int r=1; r<=5; r++) {
			
			for(int c=5; c>=r; c--) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		
System.out.println("====================================================================================");		
//3.
		
		for(int rows=1; rows<=5; rows++) {
			
			 for(int col=1; col<=rows; col++) {
				 System.out.print("* ");
			 }
			 
		System.out.println();
		}
		for(int r=1; r<=5; r++) {
			
			for(int c=5; c>r; c--) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
System.out.println("====================================================================================");		
		
//5.

 for(int rows=7; rows>1; rows--) {
	 for(int cols=1; cols<=rows; cols++) {
		 System.out.print(cols+" ");
	 }
	 System.out.println();
 }
  for(int row=1; row<=7; row++) {
	  for(int col=1; col<=row; col++) {
		  System.out.print(col+" ");
	  }
	  System.out.println();
  }
		
		
		
		
		
		

	}

}
