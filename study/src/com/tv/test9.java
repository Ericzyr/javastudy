package com.tv;
import  asdf.test8;
public class test9 {
	public static void main(String[] args) {
		test8 input = new test8();
		System.out.print(input.age);
		
		input.eat();
	
		input.sleep("room"+"\n");//无参数有返回的 
		
		int age  = input.getAge(18);
		System.out.print("\n"+"有参数有返回的类型："+age);
		
		
		
	}
}
