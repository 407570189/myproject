package com.tom;

import java.util.Scanner;

public class Float {

	public static void main(String[] args) {
		/*float n  = 10.66499999f;
		String name = "UCLA";
		
		System.out.printf("Hi,%s,Your age:,%.2f"+'\n',name ,n);
		double c = 24.0;
		System.out.println(c*(9.0/5)+32);*/  		
         //
        System.out.println("please enter number");
        Scanner scanner  = new Scanner(System.in);
        double cl = scanner.nextDouble();
        double ff = (cl*(9.0/5)+32);
        System.out.printf("%.1f C= %.1f F",cl,ff);
        
	}

}
