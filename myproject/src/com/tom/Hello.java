package com.tom;

public class Hello {

	public static void main(String[] args) {
		//Hello introduce myself
		Person p = new Person(58.5f,1.765f);
		p.weight = 58.5f;
		p.height = 1.765f;
		
		System.out.println(p.bmi());	
		p.hello(); 
		//Person hung = new Person();
		
		/*int age= 19;
        String firstname ="Hung";
        String lastname = "Shang";
        String message = "hello";
        float weight =(float)58.5;
        float height = 176.5f;
        float bmi = weight / (height*height);
		System.out.println(message);
		System.out.println("my name is");
        System.out.println(firstname+lastname);
        System.out.println(age+"years old");
		System.out.println("tall"+height);
		System.out.println("weight"+weight);
		System.out.println(bmi);
		age = age + 1;
		System.out.println(age);
		    */
	       
	       
	}

}
