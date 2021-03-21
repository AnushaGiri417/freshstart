package com.youtubeclass;

public class Operators {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=20;
		
		//Arithmatic operators + - * / %
		
		System.out.println("Sum of "+num1+" and "+num2+" is:"+(num1+num2));
		System.out.println("Diff of "+num1+" and "+num2+" is:"+(num1-num2));
		System.out.println("Mul of "+num1+" and "+num2+" is:"+(num1*num2));
		System.out.println("Div of "+num1+" and "+num2+" is:"+(num1/num2));
		System.out.println("Mod of "+num1+" and "+num2+" is:"+(num1%num2));
 //Modulus operator (%) shows remainder of the division
//Mod is higher precedence than divison & multiplication
		int mod=10%3;
		System.out.println(mod);
		
//Double values and float
		double num01=85.99;
		double num02=99.99;
		
		double sumOfDouble=num01+num02;
		double subOfDouble=num01-num02;
		double divOfDouble=num01/num02;
		
		float n1=11.05f;
		float n2=12.22f;
	float sumFloat=n1+n2;
	float subFloat=n1-n2;
	float divFloat=n1/n2;
	
	System.out.println("Sum of two double values is : "+sumOfDouble);
	System.out.println("diff of two float values is :"+subFloat);
	System.out.println("division of two float values is :"+divFloat);
	System.out.println("Multiplication of two float vlaues is :"+(n1*n2));
	
	float n3=3.9f;
	float square=n3*n3;
	System.out.println("Square of the number 3.9 is :"+square);
	
	//perimeter of a rectangle
	
	int height=8;
	int width=5;
	int area=height*width;
	int perimeter=2*(height*width);
System.out.println("Perimeter of a rectangle with width "+width+" and height "+height+" is equal to "+perimeter+" and the area is "+area);
   
int result=10*2+5;
int result2=10+2*5;
int result3=(10+2)*5;
  System.out.println(result);
  System.out.println(result2);
  System.out.println(result3);

   //Relational operators  < > <= >= !=
  //Relational operators always return boolean value
		
	System.out.println(num1==num2);
	System.out.println(num1<num2);
	System.out.println(num1>num2);
	System.out.println(num1<=num2);
	System.out.println(num1>=num2);
	System.out.println(num1!=num2);
	
	//Logical operations && || !
	//works between two boolean
	
  boolean x=true;
  boolean y=false;
  
  System.out.println(x&&y);
  System.out.println(x||y);
  System.out.println(!x);
  System.out.println(!y);
  

	
	}

}
