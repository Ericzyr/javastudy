package com.tv;

public class Person {
	String name=null;
	int age;
	/*无参无返回值*/
	public void eat(){
		System.out.print("hello wold");
	}
	/*有参无返回值*/
	public void sleep(String agrs){
		System.out.println("hello to go"+agrs);
	}
	
	
	/*有参有返回值*/
	public int getAge(int agre){
		return agre;
	}
	
}
