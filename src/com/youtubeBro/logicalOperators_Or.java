package com.youtubeBro;

import java.util.Scanner;

public class logicalOperators_Or {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("You are playing a game. Press q or Q to quit");
		String response=sc.next();
		
		if(response.equals("q") || response.equals("Q")) {
			System.out.println("You quit the game");
			
		}else {
			System.out.println("You are still playing");
		}

		
		
	}

}
