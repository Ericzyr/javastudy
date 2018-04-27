package com.tv;

class student{
	String name;
	int age;
	char sex;
//	这个this方法
	public void study(String name,int age,char sex){
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	
	
//	这一个是toString 方法的重写，在String是一个类里面有一个toString方法
	public String toString(){
		return "name:"+name+"\t age:"+age+"\t sex:"+sex;
	}
	
	public student abc(){
		return this;
	}
}


public class day2_this {
	public static void main(String[] agrs){
		student one=new student();
		student three =new student();
		
		
		one.study("tom",12,'r');
		String two =one.toString();
		
		System.out.println(two);
		three = one.abc();
		System.out.println(three);
		
		
	}

}
