package com.youtubeBro;

public class WrapperClass {

	public static void main(String[] args) {
		
//wrapper class = it provides a way to use primitive data types as referance data types
//		          reference data type contain useful methods
//		          can be used with collections(eg:- Arraylist)
/*        
 * Primitive   |     Wrapper
 * ``````````  |  ``````````````
  	boolean    |    Boolean 
    char       |    Character
    int        |    Integer
    double     |    Double
     
      AND MANY MORE ARE THERE
 */
// autoboxing = the automatic conversation that the Java compiler
//       		makes between the primitives types and their corresponding wrapper class
// unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive
		
	Boolean a = true;
	Character b= '@';
	Integer c = 123;
	Double d = 3.14;
	String e = "Anusha";
	
	if(b=='@') {
		 System.out.println("This is true"); 
	}
		
	if(a==true) {
		System.out.println("This is true");
	}
		
//They work fine as a standard primitive types. This is due to unboxing	

// Disadvantage: Accessing values form a reference/wrapper class takes lot more steps than primitive values.
//If we are working with a large data, it is very difficult to use reference data types.
		
		
	}

}
