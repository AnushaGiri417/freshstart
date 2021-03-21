package com.youtubeclass;

public class NumberPattern {

	public static void main(String[] args) {
		
System.out.println("----------------------------Printing a square with *---------------------------------------");
		
		int m=5;
		   int n=6;
		    for (int i=1; i<=m; i++) {
		    	for (int j=1; j<=n; j++) {
		    		System.out.print("* ");
		    	}
		    	 System.out.println();
		    }

		    
 System.out.println("----------------------------Printing a trinagle starting from the left---------------------------------------------------");

		    
		    int a=5;
		       for(int b=1; b<=a; b++) {
		    	   for(int c=1; c<=b; c++) {
		    		   System.out.print("* ");
		    	   }
		    	     System.out.println();
		       }
		
		
 System.out.println("----------------------------Printing a increasing trinagle starting from the right---------------------------------------------------");	

		      
    int num=5;
     for(int rows=1; rows<=num; rows++) {
    	  for(int col=rows; col<=num; col++) {
    		  System.out.print("  ");
    	  }
    	  for(int col=1; col<=rows; col++) {
    		  System.out.print("* ");
    	  } 
    	  System.out.println();
     }
		       
		       
  System.out.println("----------------------------Printing a decreasing trinagle ending to the left---------------------------------------------------");		       
		       
		       
  int r=5;
  for(int s=1; s<=r; s++) {
	  for(int t=s ; t<=r; t++) {
		  System.out.print("* ");
	  }
	   System.out.println();
  }
		       
		       
		       
		       
		       
	}

}
