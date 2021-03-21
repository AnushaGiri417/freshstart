package com.youtubeclass;

public class JumpCondition {

	public static void main(String[] args) {
	//1.BREAK.....2.CONTINUE
		
//BREAK:
	for(int a=1;a<=10;a++)
	{
		if(a==5)
	{
		break; //when condition is true, it breaks
	}
		System.out.println(a);
	}
	
//CONTINUE:
	for(int b=20;b>0;b--)
	{
		if(b==15||b==10|| b==5)
		{
			continue;
		}
		System.out.println(b);
	}
		
		



	}

}
