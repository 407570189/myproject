package com.tom;

public class Ticket2 {
  int price;
  int price2;
  int number1;
  int number2;
  public Ticket2(int price,int price2){
  this.price = price;
  this.price2 = price2;
  }
  public int input(){ 
  int total = number2*price2+price*(number1-number2);	  
	return total ;  
  }

}
