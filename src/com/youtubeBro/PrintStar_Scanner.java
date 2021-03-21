package com.youtubeBro;

import java.util.Scanner;

public class PrintStar_Scanner {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
		
		int rows;                                                          
		int columns;                                                      
		String symbol;                                                    
		
		System.out.println("Enter number of rows");                      
		  rows=sc.nextInt();
		System.out.println("Enter number of columns");
		  columns=sc.nextInt();
		System.out.println("Enter symbol to use");
		  symbol=sc.next();
		   
		 for(int i=1; i<=rows; i++) {
			
			  for(int j=1; j<=columns; j++) {
				  System.out.print(symbol+" ");
			  }
			  System.out.println();
		 }

		 
		 
	}

}
