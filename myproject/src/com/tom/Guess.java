package com.tom;

import java.util.Random;
import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
	int i = 1;
	
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int secert = random.nextInt(10+1);
    System.out.println(secert);
    while(i<5){
    System.out.println("Your guess("+i+"/4):");	
    int guess = scanner.nextInt();	
    i++;
    if(guess<secert){
    System.out.println("higher");
    }
    if(guess>secert){
   	System.out.println("lower");
    }
    else{
    if(i<=3 && guess == secert){
    System.out.println("great");	
    }
    if(guess == secert && i>3){
    System.out.println("BINGO");	
    }
    }
    }
    
	}

}
