package com.youtubeBro;

public class VariousMathFunctions {

	public static void main(String[] args) {
//min, max, abs(removes all negative and makes it positive), 
//sqrt, round, ceil(round up to top), floor(round up to bottom)

		double x=5.88;
		double y=-10;
		double z=15;
		
		double a= Math.max(x, y);
		System.out.println(a);
		
		double b=Math.min(x, y);
		System.out.println(b);
		
		double c=Math.abs(y);
		System.out.println(c);
		
		double d=Math.sqrt(z);
		System.out.println(d);
		
	    double e=Math.round(x);
	    System.out.println(e);
	    
	    double f=Math.ceil(x);
	    System.out.println(f);
	    
	    double g=Math.floor(x);
	    System.out.println(g);
		
	}

}
