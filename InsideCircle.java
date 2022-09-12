package com.masai.RJ;

import java.util.Scanner;

public class InsideCircle {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter bothnum one by one");
		
		int x =sc.nextInt();
		int y =sc.nextInt();
		
		boolean res =(Math.pow(Math.pow(x, 2)+ Math.pow( y,2), 0.5) <=10);
		
		if(res)
			System.out.println(x+" ." +y+" is inside the circle");
		else
			System.out.println(x+" ," +y+" is outside the circle");
	}

}
