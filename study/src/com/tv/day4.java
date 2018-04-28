package com.tv;

class cat{
	private String name;
	private int age;
	cat(){
		
	}
	
	cat(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void eat(){
		System.out.println(this.name+" go have to meal");
	}
	
}

public class day4 {
	public static void main(String[] agrs){
		cat one= new cat("lili",2);
		one.eat();
	}
}
