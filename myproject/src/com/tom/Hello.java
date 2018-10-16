package com.tom;

public class Hello {

	public static void main(String[] args) {
		//Hello introduce myself
		Student stu = new Student("Hank",70,90);
		
		stu.name = "Hank";
		stu.english = 70;
		stu.math = 90;
		stu.print();
		System.out.println(3 <= 5);
		String s = new String("abc");
		System.out.println(s);
	    String s1 = "abc";
	    String s2 = "abc";
	    System.out.println(s.equals(s1));
	    System.out.println(s1 == s2);
		
		
		
		
		
		
		
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
        float height = 1.765f;
        float bmi = weight / (height*height);
		System.out.println(message);
		System.out.println("my name is");
        System.out.println(firstname+lastname);
        System.out.println(age+"years old");
		System.out.println("身高"+height);
		System.out.println("體重"+weight);
		System.out.println(bmi);
		age = age + 1;
		System.out.println(age);
		    */
	     
		/*String name = "Hank";
		int english = 70;
		int math = 90;
		char c = '\t';
		System.out.println(name +c+ english +c+ math +c+ (math+english)/2);*/
				
	}

}
