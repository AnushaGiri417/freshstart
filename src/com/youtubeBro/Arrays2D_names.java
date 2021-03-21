package com.youtubeBro;

public class Arrays2D_names {

	public static void main(String[] args) {


//2D Arrays:(array of arrays)
		
        String[][] name= new String[2][2];
		name[0][0]="Anusha";
		name[0][1]="Pravin";
		name[1][0]="Pransal";
		name[1][1]="Pranusha";
		
		for(int b=0; b<name.length; b++) {
			System.out.println();
			 for(int c=0; c<name[b].length; c++) {
				System.out.print(name[b][c]+"   ");
			 }
		}
	 System.out.println();
	 

	}

}
