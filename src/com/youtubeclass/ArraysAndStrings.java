package com.youtubeclass;

public class ArraysAndStrings {

	public static void main(String[] args) {
	
/* Array is collection of element of same data type.
  1.Single dimensional
    ```````````````````
    a)declare an array
    b)insert values into aray
    c)find size of an array
    d)read values from an array
    
  2.Two/multidimensional
    `````````````````````
    
 */
int a[]=new int[5]; //declaring array size
a[0]=100; //always starts from zero
a[1]=200;
a[2]=300;  //allows only specified number of values of a
a[3]=400;  //in this case only 5 elements allowed
a[4]=500;

//OR int a[]={100,200,300,400,500}
//This way allows infinite number of values of a.

System.out.println("length of an array is : "+a.length); //length of an array(how many values in it?)
System.out.println(a[2]); //reads specific value
 
 //USING FOR LOOP:
for(int i=0;i<5;i++)
{
	System.out.println(a[i]);
}
	






	}
}
