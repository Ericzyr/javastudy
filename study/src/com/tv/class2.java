package com.tv;
import  com.tv.class1;
public class class2 {
	public static void main(String[] args) {
		class1 input = new class1();
		System.out.print(input.age);
		
		input.eat();
	
		input.sleep("room"+"\n");//无参数有返回的 
		
		int age  = input.getAge(18);
		System.out.print("\n"+"有参数有返回的类型："+age);
		
		
		
	}
}
