package com.youtubeclass;

public class ConditionalStatement {

	public static void main(String[] args) {
	//if...else statement 
		int age=12;
		if(age>=18)
		{
		System.out.println("Eligible to vote");
		}
		else
		{
		System.out.println("Not eligible to vote");
		}
		
  int age1=25;
  if(age1>=21)
  {
	  System.out.println("Eligible to drink");
  }
// if the condition is true else statement is optional, if false we need to execute else statement
  //Even..or Odd statement
  int num1=10;
  if(num1%2==0)
  {
	  System.out.println("Number is an even nember.");
  }
  else
  {
	  System.out.println("Number is an odd number.");
  }
//largest of two numbers
  int a=10;
  int b=11;
  if(a>b)
  {
	  System.out.println("a is larger");
  }
  else
  {
	  System.out.println("b is larger");
  }
		
  //Nested if...else statement(more than one condition)
  int day=20;
  if(day==1)
  {
	  System.out.println("Day is Sunday");
  }
  else if(day==2)
  {
	  System.out.println("Day is Monday");
  }
  else if(day==3)
  {
	  System.out.println("Day is Tuesday");
  }
  else if(day==4)
  {
	  System.out.println("Day is Wenesday");  
  }
  else if(day==5)
  {
	  System.out.println("Day is Thursday");
  }
  else if(day==6)
  {
	  System.out.println("Day is Friday");
  }
  else if(day==7)
  {
	  System.out.println("Day is Saturday");
  }
  else
  {
	  System.out.println("Invalid week number");
  }
  
//NESTED IFS CAN BE: (IF...ELSE IF....IF)  OR (IF...IF..ELSE)

		
//Switch case statement...if your condition is very large..more than 5
  
  
  		
	}

}
