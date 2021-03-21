package com.youtubeclass;

public class EnhancedForLoop {

	public static void main(String[] args) {

// Works with arrays only
	int a[]= {100,200,300,400,500};
		
	for(int i:a) //looks for the values of a from start to end 
		{
			System.out.println(i);
		}

	
  int b[]= {10,20,30,40,50,60,65};
  for(int c=0; c<b.length; c++) {
	  System.out.println(b[c]);
  }
  
  int p[]= {20,25,30,35,40,45};
  for(int d:p) {
	  System.out.println("Advanced for loop d:p will print : "+d);
  }
	}

}
