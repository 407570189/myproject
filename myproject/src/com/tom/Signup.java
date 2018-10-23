package com.tom;

import java.util.Scanner;


public class Signup {
	public static void main(String[]args){
    
    System.out.println("Are you 18(Y/N)");
    Scanner scanner = new Scanner(System.in);
	String line = scanner.nextLine();
    System.out.println("*"+line+"*");
	boolean bool = line.equalsIgnoreCase("y");
	
	if (bool){
	    System.out.print("Your age?");
	    int number = scanner.nextInt();
	    scanner.nextLine();
	    
	    System.out.print("Your name?");
	    String name = scanner.nextLine();
	    System.out.print("Your nick name?");
	    String nickname = scanner.nextLine();
	   System.out.print(number+"/"+name+"/"+nickname);
	
	}
	else{
		System.out.println("xxx  see you");	
		
		
	}
	
	}
}
	
