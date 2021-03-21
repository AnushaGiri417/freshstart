package com.youtubeclass;

public class emptySquarePattern {

	public static void main(String[] args) {
		
System.out.println("------------------------Youtube--------------------------");		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i>1 && j>1 && i<5 && j<5) {
					System.out.print("  ");
				}else {
					System.out.print("* ");
				}
			}
			
			System.out.println();
		}
		
System.out.println("-------------------------Repl 68------------------------------");		
	for(int a=1; a<=4; a++) {
		for(int b=1; b<=4; b++) {
			if(a>1 && b>1 && a<4 && b<4) {
				System.out.print(" ");
			}else {
				System.out.print("$");
			}
		}
		System.out.println();
	}
		
System.out.println("----------------------------Repl 69------------------------------");

	for(int a=7;a>=2;a--) {
		for(int b=1;b<=a;b++) {
			System.out.print(b+" ");
		}
		System.out.println();
	}
	
	for(int c=1;c<=7;c++) {
		for(int d=1;d<=c;d++) {
			System.out.print(d+" ");
		}
	System.out.println();

	}	
		
		
System.out.println("----------------------------Repl 67------------------------------");

 for(int a=1; a<=5; a++) {
	 for(int b=1; b<=10; b++) {
		 System.out.print(b);
//		 if()
	 }
 }
		
		
		
		
		
		
	}

}
