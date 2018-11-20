package com.tom;

public class Student {
  String name;
   int english;
   int math;
   char c = '\t';
   
  
   public Student(String name,int english,int math){
   this.name = name;
   this.english = english;
   this.math = math;
   
  }
   public int average(){
   int a = (english+math)/2;
   return a;  
   }
   public int highest(){
   if(english > math){
   return english;	   
   }
   else{
   return math;	   
   }
   }
   public void print(){
   System.out.print(name+c+english+c+math+c+average()+c+highest()+c);
   
    if(average() < 60){
	   System.out.println("Failed");
   }else {
	   System.out.println("PASS")
   
   public char getGrading(){   
	   char grading = 'F';
	   int getAverage = average();
	   switch(getAverage/10){
	   case 10:
	   case 9:
		   grading = 'A';
		   break;
	   case 8:
		   grading = 'B';
	       break;
	   case 7:
		   grading ='C';
		   break;
	   case 6:
		   grading ='D';
		   break;
		default:
		   grading = 'F';
	   }
}
   } 
