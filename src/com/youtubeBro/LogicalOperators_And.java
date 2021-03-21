package com.youtubeBro;

  import java.util.Scanner;

public class LogicalOperators_And {

	public static void main(String[] args) {
  
	/*	logical operatoes are used to connect two or more expressions
		
		      &&= (AND) both condition must be true
		      || = (OR) either of one condition must be true
		      != (NOT) reverses boolean value of condition */

	 Scanner scanner=new Scanner(System.in);
	
/*	System.out.println("I like this house. What is the price?");
    int price=scanner.nextInt();
    
    if(price<500000 && price>150000){
    	System.out.println("I like the price of the house");
    	
    }else {
    	System.out.println("It is a crappy deal for this house");
    }
    
		
	
    */
	
    System.out.println("What is the temperature outside?");
    int temp=scanner.nextInt();
    if (temp<65) {
    	System.out.println("It's too cold to walk");
    }else if(temp>65 && temp<80) {
    	System.out.println("I will go for a walk");
    }else {
    	System.out.println("It is too hot outside");
    }
    
    
    System.out.println("You are playing a game. Press q or Q to quit");
	String response=scanner.next();
	
	if(!response.equals("q") && !response.equals("Q")) {
		System.out.println("You are still playing");
		
	}else {
		System.out.println("You quit the game");
	}
    
    
    
    
    
	}

}
