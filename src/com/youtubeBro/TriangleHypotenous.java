package com.youtubeBro;

import java.util.Scanner;

public class TriangleHypotenous {

	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in); 
	
	
	System.out.println("Enter side a: ");
	double a=sc.nextDouble();
	
	System.out.println("Enter side b: ");
	double b=sc.nextDouble();
	
	double c=Math.sqrt((a*a)+(b*b)); // hyp=sqrt(a^2+b^2)
	System.out.println("The Hypoteneuse is: "+c);
	
	

    System.out.println("Input the boolean value");
    boolean bool=sc.nextBoolean();
    System.out.println("The value is "+bool);
	
	sc.close();
	}

}
