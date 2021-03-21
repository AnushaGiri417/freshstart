package com.youtubeclass;

public class Loop_IterativeStatements {

	public static void main(String[] args) {

//set of statement that can be repeated multiple times based on a condition
//while, do...while, for loop

//WHILE LOOP:
		
  //eg: to print the numbers 1 to 100
		int a=1;
		
		while(a<=100)
		{	
			System.out.println(a);
		a++;
		}
	//eg: to print the even numbers 1 to 10
		
		int b=2;
		while(b<=10)
		{
			System.out.println(b);
			b=b+2;
		}
	//eg: to print the odd numbers 1 to 10
		int c=1;
		while(c<=10)
		{
			System.out.println(c);
			c=c+2;
		}
	//eg: to print the numbers 1 to 10 in decending order
		int d=10;
		while(d>0)
		{
			System.out.println(d);
			d--;
		}
//DO...WHILE LOOP:
	
	int l=100;
	do
	{
		System.out.println(l);
		l++;
	}while(l<=110);
//in other case of do...while loop
	int p=20;
	do
	{
		System.out.println(p);//20
		p++;
	}while(p<=10);
/*it will only print 20 once as it will run until the 
 * condition is met. It prints the value of p that is 20 
 * for once and next step is 20+1. Then it finally verifies 
 * the condition p<=10. When the condition fails, it stops 
 * running. So in this loop the value is printed atleast 
 * once. This is rarely used. 
 * Most common one is for loop. While loop is also used 
 * very often. */	
	
//FOR LOOP:
  /* initialization==>condition==>increment/decrement
   * all three can be shown in one line instead of 
   * three different lines as while loop.*/
	for(int g=30;g>20;g--)
	{
		System.out.println(g);
	}
	
	

	}

}
