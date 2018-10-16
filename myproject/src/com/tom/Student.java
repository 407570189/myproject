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

   
   public void print(){
   System.out.println(name+c+english+c+math+c+(english+math)/2);
}
} 
