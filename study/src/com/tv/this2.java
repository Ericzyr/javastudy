package com.tv;
//构造方法是做初始化的

//一个方法可以有多个，就是方法重载;
class cat{
	private String name;
	private int age;
	
	{
		System.out.println("我是构造代码块");
		//它是对象一建立就运行了，优先构造方法。
//构造代码块 作用：给对象时行初始化的 所有的对象统一的初始化
//构造方法 作用 是对，对应对象初始化
	}
//	构造方法 无参
	cat(){
		
	}
//	构造方法 有参
	cat(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void eat(){
		System.out.println(this.name+" go have to meal");
	}
}

public class this2 {
	public static void main(String[] agrs){
		cat one= new cat("Tom",25);
		one.eat();
	}
}
