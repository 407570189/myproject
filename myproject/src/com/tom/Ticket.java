package com.tom;

import java.util.Scanner;

public class Ticket {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		Ticket2 t = new Ticket2(1000,1800);
		t.price = 1000;
		t.price2 = 2000*9/10; 
		
		while(true){
		System.out.print("Please enter number of ticket:");
		int number1 = scanner.nextInt();
		if(number1 == -1)
		{
		break;
		}
		System.out.print("How many roung-trip ticket:");
		int number2 = scanner.nextInt();
		int total = number2*1800+1000*(number1-number2);
		System.out.println("Total tickets:"+number1);
		System.out.println("Round-trip:"+number2);
		System.out.println("Total:"+t.input());
			
		}

	}
}