package com.tv;
public class day1_class extends Person {
	public static void main(String[] args) {
		Person one = new Person();
		one.age=12;
		System.out.println(one.age);
		one.tosleep("沙发");
		one.tosleep(5);
		int age	=one.getAge(23);
		System.out.println(age);	
		
	
	}

}
