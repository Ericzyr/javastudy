package com.tv;
import com.tv.Person;

public class day1_class {
	public static void main(String[] args) {
		Person one = new Person();
		one.age=12;
		System.out.println(one.age);
		one.sleep("沙发");
		
		int age	=one.getAge(23);
		System.out.println(age);	
		
	
	}

}
